package com.wx_hospital.controller;

import com.wx_hospital.service.OnlineConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

