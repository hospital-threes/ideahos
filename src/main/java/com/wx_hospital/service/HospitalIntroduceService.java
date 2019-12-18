package com.wx_hospital.service;

import com.wx_hospital.pojo.SecHospitalArticle;
import com.wx_hospital.pojo.SecHospitalArticleInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:40
 **/
public interface HospitalIntroduceService {
    //医院动态
    List<SecHospitalArticle> SelectNews( @Param("articleType") Integer articleType,@Param("hospitalId") Integer hospitalId);
    //医院介绍详细
    List<SecHospitalArticleInfo> SelectArticleInfoAll(Integer id);
}

