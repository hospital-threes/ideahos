package com.wx_hospital.controller;

import com.wx_hospital.service.HospitalReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ideahos
 * @description: 检查报告-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 11:56
 **/
@Controller
@RequestMapping("hospitalReport")
public class HospitalReportController {
    @Autowired
    private HospitalReportService hospitalReportServiceImpl;
}

