package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecHospitalMapper;
import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecDoctor;
import com.wx_hospital.pojo.SecPic;
import com.wx_hospital.service.OnlineConsultationService;

import com.wx_hospital.utils.Response;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ideahos
 * @description: 在线咨询-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:49
 **/
@Service
public class OnlineConsultationServiceImpl implements OnlineConsultationService {

    @Resource
    private SecHospitalMapper secHospitalMapper;


    @Override
    public List<SecDoctor> getAlldt22() {
        List<SecDoctor> list=new ArrayList<>();
        SecDoctor secUser=new SecDoctor();
        secUser.setId(1);
        secUser.setAuthor("尹玲");
        secUser.setPhto("/images/doctor.jpg");
        secUser.setInfo("擅长：围产保健，妊娠期糖尿病。");
        secUser.setHasChange(false);
        secUser.setState(1);
        SecDoctor secUser2=new SecDoctor();
        secUser2.setId(2);
        secUser2.setAuthor("张三");
        secUser2.setPhto("/images/doctor2.jpg");
        secUser2.setInfo("擅长：围产保健，妊娠期糖尿病。");
        secUser.setHasChange(false);
        secUser2.setState(2);
        SecDoctor secUser3=new SecDoctor();
        secUser3.setId(3);
        secUser3.setAuthor("李四");
        secUser3.setPhto("/images/doctor.jpg");
        secUser3.setInfo("擅长：围产保健，妊娠期糖尿病。");
        secUser.setHasChange(false);
        secUser3.setState(1);
        SecDoctor secUser4=new SecDoctor();
        secUser4.setId(4);
        secUser4.setAuthor("王五");
        secUser4.setPhto("/images/doctor2.jpg");
        secUser4.setInfo("擅长：围产保健，妊娠期糖尿病。");
        secUser4.setHasChange(false);
        secUser4.setState(2);
        SecDoctor secUser5=new SecDoctor();
        secUser5.setId(5);
        secUser5.setAuthor("赵六");
        secUser5.setPhto("/images/doctor.jpg");
        secUser5.setInfo("擅长：围产保健，妊娠期糖尿病。");
        secUser5.setHasChange(false);
        secUser5.setState(1);
        SecDoctor secUser6=new SecDoctor();
        secUser6.setAuthor("钱七");
        secUser6.setId(6);
        secUser6.setPhto("/images/doctor.jpg");
        secUser6.setInfo("擅长：围产保健，妊娠期糖尿病。");
        secUser6.setHasChange(false);
        secUser6.setState(1);
        list.add(secUser);
        list.add(secUser2);
        list.add(secUser3);
        list.add(secUser4);
        list.add(secUser5);
        list.add(secUser6);
        return  list;
    }

    //添加数据库  咨询表\订单表
    @Transactional
    @Override
    public Response addSecConsultation(SecDoctor doctor, int userid, String phone, String biaoti, String text, String fix, int paymentStatus, String orderNum, int state, int hospitalId) {
        System.out.println("userId+++++"+userid);
        if(fix.equals("男")){
            fix="1";
        }else {
            fix="2";
        }
        //封装订单信息类
        HisOrder hisOrder=new HisOrder();
        hisOrder.setDisabled(false);
        hisOrder.setOrderName("在线咨询");
        hisOrder.setOrderNum(orderNum);
        hisOrder.setOrderPlacer(userid);
        //免费咨询
        if(state==0){
            hisOrder.setStatus("已支付");
            hisOrder.setPayMoney(0.0);
            //付费咨询
        }else if(state==1){
            hisOrder.setStatus("未支付");
        }

        boolean g=false;
        //添加数据库  订单表
        boolean r= secHospitalMapper.addHisOrder(hisOrder);
        if(r!=false){
            //添加数据库  咨询表
            g=secHospitalMapper.addSecConsultation(doctor,userid,phone,biaoti,text,fix,paymentStatus,hisOrder.getId(),hospitalId);
        }


        Response response=new Response();
        response.setResponse(g);
        response.setId(userid);//doctor.getId()
        response.setOrderNum(orderNum);
        return response;
    }
    //添加图片
    @Override
    public boolean addSecPicBySecConsultation(SecPic pic, int orderId) {
        boolean k=false;
        k= secHospitalMapper.addSecPicBySecConsultation(pic);
        return k;
    }

    @Override
    public boolean updateConsultationState(int id) {
        return secHospitalMapper.updateConsultationState( id);
    }
}

