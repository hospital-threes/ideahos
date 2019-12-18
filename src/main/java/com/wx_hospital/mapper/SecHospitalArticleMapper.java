package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecHospitalArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecHospitalArticleMapper {
    //医院动态
    List<SecHospitalArticle> SelectNews(@Param("articleType") Integer articleType,@Param("hospitalId") Integer hospitalId);

}