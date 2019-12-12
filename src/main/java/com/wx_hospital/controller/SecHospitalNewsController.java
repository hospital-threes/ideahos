package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecHospitalNews;
import com.wx_hospital.service.SecHospitalNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SecHospitalNewsController {
    @Autowired
    private SecHospitalNewsService se;

    @RequestMapping("/SelectNew")
    @ResponseBody
    public List<SecHospitalNews> SelectNew() {
        List<SecHospitalNews> list=se.SelectNew();
        return list;
    }
}
