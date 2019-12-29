package com.wx_hospital.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wx_hospital.pojo.SecDoctor;
import com.wx_hospital.pojo.SecPic;
import com.wx_hospital.service.OnlineConsultationService;
import com.wx_hospital.utils.JSONUtils;
import com.wx_hospital.utils.OssUtil;
import com.wx_hospital.utils.Response;
import org.apache.commons.net.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @program: ideahos
 * @description: 在线咨询-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 11:53
 **/
@Controller
@RequestMapping("onlineConsultation")
public class OnlineConsultationController {
    @Autowired
    private OnlineConsultationService onlineConsultationServiceImpl;

    /**
     *
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/getAlldt22")
    public List<SecDoctor> getAlldt22(HttpSession session){
        List<SecDoctor> list=onlineConsultationServiceImpl.getAlldt22();
        return list;
    }
    /**
     *
     * @param id
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateConsultationState")
    public boolean updateConsultationState(int id,HttpSession session){
        boolean list=onlineConsultationServiceImpl.updateConsultationState(id);
        return list;
    }
    /**
     *
     * @param jsonObject
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/api", method = RequestMethod.POST)
    public Response xxx(@RequestBody JSONObject jsonObject) {

        JSONObject ite = jsonObject.getJSONObject("ite");
        String s = ite.toJSONString();
        SecDoctor doctor = JSONUtils.json2Ojbect(s, SecDoctor.class);
        System.out.println("目标医生信息：");
//        System.out.println(doctor.getId()+"doctor.getId()-------------------------");   //医生信息对象

        String phone=jsonObject.getString("phone");  //当前用户的手机号
        String biaoti=jsonObject.getString("biaoti");  //标题
        System.out.println("问题标题是："+biaoti);
        String text=jsonObject.getString("text");  //内容
        System.out.println("问题内容是："+text);
        String fix=jsonObject.getString("fix");  //性别
        System.out.println("性别是："+fix);
        int userid=Integer.parseInt(jsonObject.getString("userid"));  //当前用户id
        System.out.println("用户id是："+userid);
        int state=Integer.parseInt(jsonObject.getString("state"));  //问题是付费还是免费
        //根据前台传过来的付费状态，判断需不需要支付
        int paymentStatus=1;
        if(state==0){
            System.out.println("已经支付");
            paymentStatus=0;  //已支付
        }else if(state==1){
            System.out.println("没有支付");
            paymentStatus=1;  //未支付
        }

        JSONArray photos = jsonObject.getJSONArray("photos");

        String orderNum="";
        //生成订单号
        for(int i=0;i<10;i++){
            int oo = ThreadLocalRandom.current().nextInt(10);
            orderNum+=String.valueOf(oo);
        }


        //医院id  hospitalId
        int hospitalId=Integer.parseInt(jsonObject.getString("hospitalId"));


        //添加数据库  咨询表\订单表
        Response f= onlineConsultationServiceImpl.addSecConsultation(doctor,userid,phone,biaoti,text,fix,paymentStatus,orderNum,state,hospitalId);

        if (photos.size() > 0) {
            for (int i = 0; i < photos.size(); i++) {
                JSONObject obj = photos.getJSONObject(i);
                String fileName = obj.getString("filename");
                String base64Str = obj.getString("base64Str");
                String directoryName = "xx/xx";
                /*  String extension = fileName.substring(fileName.lastIndexOf(".")).toLowerCase();*/
                String extension =phone+"-"+jsonObject.getString("userid")+"-"+String.valueOf(i+1)+".jpg";

                InputStream inputStream = new ByteArrayInputStream(Base64.decodeBase64(base64Str.substring(base64Str.indexOf(",") + 1)));
                System.out.println("转换成的地址+++：：：："+inputStream);
                OssUtil client = new OssUtil();
                String result = client.uploadFile2OSS(inputStream, extension);// extension指的是拓展名，例如".amr"
                System.out.println("返回的结果是：；；"+result);
                String str =client. getImgUrl(extension);
                String trim = str.trim();
                String[] imgUrls = trim.split("\\?");
                String url= imgUrls[0];
                System.out.println("OSS图片路径是："+url);
                //图片添加数据库
                SecPic pic=new SecPic();
                pic.setObjId(userid);
                pic.setDisabled(false);
                pic.setType("consultation");
                pic.setObjType("患者");
                pic.setPicPath(url);
                pic.setPicName(extension);
                pic.setStatus("1");

                boolean h = onlineConsultationServiceImpl.addSecPicBySecConsultation(pic,f.getOrderId());
            }
        }
        System.out.println(f.getResponse()+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        return f;
    }
}

