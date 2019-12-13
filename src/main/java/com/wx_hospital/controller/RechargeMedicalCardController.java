package com.wx_hospital.controller;

import com.wx_hospital.service.RechargeMedicalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

