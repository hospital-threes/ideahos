package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecReservation;
import com.wx_hospital.service.PersonalCenterService;
import com.wx_hospital.utils.JedisClientPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: ideahos
 * @description: 个人中心-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:29
 **/
@Controller
@RequestMapping("personalCenter")
public class PersonalCenterController {
    @Autowired
    private PersonalCenterService personalCenterServiceImpl;
    @Autowired
    private JedisClientPool jedisClientPool;

    /**
     * 获取默认就诊人信息
     * @param userId
     * @return
     */
    @RequestMapping("/getDefaultPatient")
    @ResponseBody
    public SecPatient getDefaultPatient(Integer userId){

        SecPatient secPatient = personalCenterServiceImpl.getDefaultPatient(userId);

        return secPatient;
    }

    /**
     * 发送手机验证码
     * @param phone
     * @return
     */
    @RequestMapping("/getPhoneCode")
    @ResponseBody
    public boolean getmobileCode(String phone) {
        //生成随机4位数验证码
        int code = (int) ((Math.random() * 9 + 1) * 1000);
        //将int 转换成 string
        String pCode = String.valueOf(code);
        System.out.println(pCode);

        //生成key值
        String sss = "pCode" + phone;
        //将验证码存入到redis 数据库中
        String set = jedisClientPool.set(sss, pCode);

        //设置存在时间为5分钟
        Long expire = jedisClientPool.expire(sss, 5 * 60);
        //通过插件发送信息
        //boolean b = SendSMSUtils.sendMSM(phone, pCode);

        return expire>0;
    }

    /**
     *  查询就诊人
     * @param id
     * @return
     */
    @RequestMapping("/selectPatient")
    @ResponseBody
    public List<SecPatient> selectPatient(Integer id){//用户id(获取session的id)
        List<SecPatient>  list =personalCenterServiceImpl.selectpatient(id);
        return list;
    }

    /**
     * 修改默认人
     * @param patientid
     * @param userId
     * @return
     */
    @RequestMapping("/UpdateMoren")
    @ResponseBody
    public int UpdateMoren(Integer patientid,Integer userId){//patientid
        int i =personalCenterServiceImpl.UpdateMoren(patientid,userId);
        return i;
    }

    /**
     * 回显就诊人（就诊信息）
     * @param patientId
     * @return
     */
    @RequestMapping("/selectHuixiapatient")
    @ResponseBody
    public SecPatient selectHuixiapatient(Integer patientId){

        SecPatient secPatient =personalCenterServiceImpl.selectHuixiapatient(patientId);

        return  secPatient;
    }

}

