package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecPayWay;
import com.wx_hospital.pojo.SecReport;
import com.wx_hospital.service.OnlineRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ideahos
 * @description: 预约挂号-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 11:53
 **/
@Controller
@RequestMapping("onlineRegistration")
public class OnlineRegistrationController {
    @Autowired
    private OnlineRegistrationService onlineRegistrationServiceImpl;


    /*查询支付方式*/
    @RequestMapping("/selectZhifuStyle")
    @ResponseBody
    public List<SecPayWay> selectZhifuStyle(){//用户id
        List<SecPayWay> list =onlineRegistrationServiceImpl.selectZhifuStyle();
        return list;
    }

}

