package com.wx_hospital.service;

import com.wx_hospital.pojo.SecHospitalNews;

import java.util.List;

public interface SecHospitalNewsService {
    //查询医院动态的新闻
    List<SecHospitalNews> SelectNew();
}
