package com.wx_hospital.controller;

import com.wx_hospital.service.OutpatientPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ideahos
 * @description: 门诊缴费-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:02
 **/
@Controller
@RequestMapping("OutpatientPayment")
public class OutpatientPaymentController {
    @Autowired
    private OutpatientPaymentService outpatientPaymentServiceImpl;
}

