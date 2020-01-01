package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecHospitalArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecHospitalArticleMapper {
    /**
     * 医院动态信息
     * @param articleType
     * @param hospitalId
     * @return
     */
    List<SecHospitalArticle> SelectNews(@Param("articleType") Integer articleType,@Param("hospitalId") Integer hospitalId);

    /**
     * 医院信息介绍
     * @param articleType
     * @param hospitalId
     * @return
     */
    List<SecHospitalArticle> SelectNews2(@Param("articleType") Integer articleType,@Param("hospitalId") Integer hospitalId);

}