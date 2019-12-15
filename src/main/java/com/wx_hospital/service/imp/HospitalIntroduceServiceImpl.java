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

    @Override
    public List<SecHospitalArticle> SelectNews() {
        return SecHospitalArticleMapper.SelectNews();
    }

    @Override
    public List<SecHospitalArticleInfo> SelectArticleInfoAll(Integer id) {
        return SecHospitalArticleInfoMapper.SelectArticleInfoAll(id);
    }
}

