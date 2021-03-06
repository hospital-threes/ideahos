package com.wx_hospital.controller;

import com.wx_hospital.service.HospitalDynamicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ideahos
 * @description: 医院动态-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:29
 **/
@Controller
@RequestMapping("hospitalDynamics")
public class HospitalDynamicsController {
    @Autowired
    private HospitalDynamicsService hospitalDynamicsServiceImpl;
}

