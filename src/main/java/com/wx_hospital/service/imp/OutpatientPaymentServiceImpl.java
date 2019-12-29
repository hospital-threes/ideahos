package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecPatientMapper;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.service.OutpatientPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 门诊缴费-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:56
 **/
@Service
public class OutpatientPaymentServiceImpl implements OutpatientPaymentService {
    @Autowired
    private SecPatientMapper secPatientMapper;
    /**
     * 门诊缴费
     * @param id
     * @return
     */
    @Override
    public List<SecPatient> SelectPatOrPay(Integer id) {
        return secPatientMapper.SelectPatOrPay(id);
    }
}

