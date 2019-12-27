package com.wx_hospital.controller;

import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.service.RechargeMedicalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

/**
 * @program: ideahos
 * @description: 就诊卡充值-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:01
 **/
@Controller
@RequestMapping("rechargeMedicalCard")
public class RechargeMedicalCardController {
    @Autowired
    private RechargeMedicalCardService rechargeMedicalCardServiceImpl;

    @RequestMapping("/UpdataMedical")
    @ResponseBody
    public int UpdataMedical(Integer price,Integer id,Integer oId,String payWay){
        return rechargeMedicalCardServiceImpl.UpdataMedical(price,id,oId,payWay);
    }
    /*就诊卡充值*/
    @RequestMapping("/InsertOrder")
    @ResponseBody
    public int InsertOrder(HisOrder HisOrder){
        int radomInt = new Random().nextInt(999999);
        System.out.println(radomInt);
        HisOrder.setOrderNum(String.valueOf(radomInt));
        int i= rechargeMedicalCardServiceImpl.InsertOrder(HisOrder);
        int id=HisOrder.getId();
        return id;

    }
    @RequestMapping("/SelectIdOne")
    @ResponseBody
    public HisOrder SelectIdOne(Integer id) {
        HisOrder hisOrder=rechargeMedicalCardServiceImpl.SelectIdOne(id);
        return hisOrder;
    }

}

