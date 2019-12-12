package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecHospitalNews;

import java.util.List;

public interface SecHospitalNewsMapper {
    //查询医院动态的新闻
    List<SecHospitalNews> SelectNew();

}