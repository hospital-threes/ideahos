package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecPaymentVoio;

import java.util.List;

public interface SecPaymentMapper {
    /**
     * 获取当前就诊人门诊缴费订单
     * @Param patientId
     * return
     */
    List<SecPaymentVoio> getOutpatientpayment(Integer patientId);

    List<SecPaymentVoio> getAllOutpatientpayment(Integer patientId);
}