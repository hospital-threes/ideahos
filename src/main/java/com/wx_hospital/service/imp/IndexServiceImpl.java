package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecHospitalMapper;
import com.wx_hospital.pojo.SecHospital;
import com.wx_hospital.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 首页-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:47
 **/
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private SecHospitalMapper secHospitalMapper;

    /**
     * 首页的信息
     * @param hospitalId
     * @return
     */
    @Override
    public List<SecHospital> SelectHos(String hospitalId) {

        return secHospitalMapper.SelectHos(hospitalId);
    }
}

