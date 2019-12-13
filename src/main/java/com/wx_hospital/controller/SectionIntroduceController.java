package com.wx_hospital.controller;

import com.wx_hospital.service.SectionIntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ideahos
 * @description: 科室介绍-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:16
 **/
@Controller
@RequestMapping("rechargeMedicalCard")
public class SectionIntroduceController {
    @Autowired
    private SectionIntroduceService sectionIntroduceServiceImpl;
}

