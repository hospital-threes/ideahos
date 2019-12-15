package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecHospitalArticleInfo;

import java.util.List;

public interface SecHospitalArticleInfoMapper {
    //医院介绍详细
    List<SecHospitalArticleInfo> SelectArticleInfoAll(Integer id);

}