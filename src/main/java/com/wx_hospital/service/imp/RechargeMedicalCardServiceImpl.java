package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecPatientMapper;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.service.RechargeMedicalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: ideahos
 * @description: 就诊卡充值-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 13:04
 **/
@Service
public class RechargeMedicalCardServiceImpl implements RechargeMedicalCardService {
    @Autowired
    private SecPatientMapper secPatientMapper;

    @Override
    public int UpdataMedical(SecPatient medicalCardBalance) {
        return secPatientMapper.UpdataMedical(medicalCardBalance);
    }
}

