package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.service.OutpatientPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    /**
     * 门诊缴费
     * @param id
     * @return
     */
    @RequestMapping("/SelectPatOrPay")
    @ResponseBody
    public List<SecPatient> SelectPatOrPay(Integer id) {
        List<SecPatient> list = outpatientPaymentServiceImpl.SelectPatOrPay(id);
        return list;
    }
}

