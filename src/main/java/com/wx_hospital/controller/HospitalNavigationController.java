package com.wx_hospital.controller;

import com.wx_hospital.service.HospitalNavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ideahos
 * @description: 来院导航-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:27
 **/
@Controller
@RequestMapping("hospitalNavigation")
public class HospitalNavigationController {
    @Autowired
    private HospitalNavigationService hospitalNavigationServiceImpl;

}

