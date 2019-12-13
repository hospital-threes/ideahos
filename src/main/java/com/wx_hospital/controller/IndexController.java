package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecHospital;
import com.wx_hospital.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ideahos
 * @description: 首页管理-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 11:52
 **/
@Controller
@RequestMapping("index")
public class IndexController {
    @Autowired
    private IndexService indexServiceImpl;

    //首页的信息
    @RequestMapping("/SelectHos")
    @ResponseBody
    public List<SecHospital> SelectHos() {
        List<SecHospital> list=indexServiceImpl.SelectHos();
        return list;
    }
}

