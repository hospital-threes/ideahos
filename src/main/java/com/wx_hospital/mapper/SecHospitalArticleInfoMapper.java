package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecHospitalArticleInfo;

import java.util.List;

public interface SecHospitalArticleInfoMapper {
    /**
     * 医院动态详细
     * @param id
     * @return
     */
    List<SecHospitalArticleInfo> SelectArticleInfoAll(Integer id);

}