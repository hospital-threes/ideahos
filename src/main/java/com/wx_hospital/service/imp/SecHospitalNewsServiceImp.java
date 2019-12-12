package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecHospitalNewsMapper;
import com.wx_hospital.pojo.SecHospitalNews;
import com.wx_hospital.service.SecHospitalNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SecHospitalNewsServiceImp implements SecHospitalNewsService {
    @Autowired
    private SecHospitalNewsMapper se;
    @Override
    public List<SecHospitalNews> SelectNew() {
        return se.SelectNew();
    }
}
