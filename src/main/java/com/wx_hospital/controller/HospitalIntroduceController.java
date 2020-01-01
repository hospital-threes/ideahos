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


    /**
     * 医院动态信息
     * @param articleType
     * @param hospitalId
     * @return
     */
    @RequestMapping("/SelectNews")
    @ResponseBody
    public List<SecHospitalArticle> SelectNews(Integer articleType, Integer hospitalId) {
        List<SecHospitalArticle> list = hospitalIntroduceServiceImpl.SelectNews(articleType, hospitalId);
        return list;
    }

    /**
     * 医院介绍信息
     * @param articleType
     * @param hospitalId
     * @return
     */
    @RequestMapping("/SelectNews2")
    @ResponseBody
    public List<SecHospitalArticle> SelectNews2(Integer articleType, Integer hospitalId) {
        List<SecHospitalArticle> list = hospitalIntroduceServiceImpl.SelectNews2(articleType, hospitalId);
        return list;
    }
    /**
     * 医院动态详细
     * @param id
     * @return
     */
    @RequestMapping("/SelectArticleInfoAll")
    @ResponseBody
    public List<SecHospitalArticleInfo> SelectArticleInfoAll(Integer id) {
        List<SecHospitalArticleInfo> list = hospitalIntroduceServiceImpl.SelectArticleInfoAll(id);
        return list;
    }
}

