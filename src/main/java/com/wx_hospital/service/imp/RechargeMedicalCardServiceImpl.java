package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.HisOrderMapper;
import com.wx_hospital.mapper.SecPatientMapper;
import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.service.RechargeMedicalCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Autowired
    private HisOrderMapper hisOrderMapper;

    @Override
    public int InsertOrder(HisOrder HisOrder) {
        return hisOrderMapper.InsertOrder(HisOrder);
    }

    @Override
    public int UpdataMedical(Integer price,Integer id,Integer oId,String payWay) {
        hisOrderMapper.UpdataStatus(oId,payWay);
        return secPatientMapper.UpdataMedical(price,id);
    }

    @Override
    public int UpdataMedicalko(Integer price, Integer id, Integer oId, String payWay) {
        hisOrderMapper.UpdataStatus(oId,payWay);
        return secPatientMapper.UpdataMedicalko(price,id);
    }

    @Override
    public HisOrder SelectIdOne(Integer id) {
        return hisOrderMapper.SelectIdOne(id);
    }
}

