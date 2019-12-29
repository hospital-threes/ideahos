package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecPaymentVoio;

import java.util.List;

public interface SecPaymentMapper {

    List<SecPaymentVoio> getOutpatientpayment(Integer patientId);

    List<SecPaymentVoio> getAllOutpatientpayment(Integer patientId);
}