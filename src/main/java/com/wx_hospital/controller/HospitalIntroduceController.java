package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecHospitalArticle;
import com.wx_hospital.pojo.SecHospitalArticleInfo;
import com.wx_hospital.service.HospitalIntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ideahos
 * @description: 医院介绍-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:05
 **/
@Controller
@RequestMapping("/hospitalIntroduce")
public class HospitalIntroduceController {

    @Autowired
    private HospitalIntroduceService hospitalIntroduceServiceImpl;

    //医院动态信息
    @RequestMapping("/SelectNews")
    @ResponseBody
    public List<SecHospitalArticle> SelectNews(){
        List<SecHospitalArticle> list=hospitalIntroduceServiceImpl.SelectNews();
        return list;
    }
    //医院动态详细
    @RequestMapping("/SelectArticleInfoAll")
    @ResponseBody
    public List<SecHospitalArticleInfo> SelectArticleInfoAll(Integer id){
        List<SecHospitalArticleInfo> list=hospitalIntroduceServiceImpl.SelectArticleInfoAll(id);
        return list;
    }
}

