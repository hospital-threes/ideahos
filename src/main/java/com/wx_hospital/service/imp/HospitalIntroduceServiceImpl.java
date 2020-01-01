package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecHospitalArticleInfoMapper;
import com.wx_hospital.mapper.SecHospitalArticleMapper;
import com.wx_hospital.pojo.SecHospitalArticle;
import com.wx_hospital.pojo.SecHospitalArticleInfo;
import com.wx_hospital.service.HospitalIntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 医院介绍-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:41
 **/
@Service
public class HospitalIntroduceServiceImpl implements HospitalIntroduceService {
    @Autowired
    private SecHospitalArticleMapper SecHospitalArticleMapper;
    @Autowired
    private SecHospitalArticleInfoMapper SecHospitalArticleInfoMapper;
    /**
     * 医院动态信息
     * @param articleType
     * @param hospitalId
     * @return
     */
    @Override
    public List<SecHospitalArticle> SelectNews( Integer articleType,Integer hospitalId) {
        return SecHospitalArticleMapper.SelectNews(articleType,hospitalId);
    }

    @Override
    public List<SecHospitalArticle> SelectNews2(Integer articleType, Integer hospitalId) {
        return SecHospitalArticleMapper.SelectNews2(articleType,hospitalId);
    }

    /**
     * 医院动态详细
     * @param id
     * @return
     */
    @Override
    public List<SecHospitalArticleInfo> SelectArticleInfoAll(Integer id) {
        return SecHospitalArticleInfoMapper.SelectArticleInfoAll(id);
    }
}

