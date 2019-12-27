package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecConsultationVoio;

import java.util.List;

public interface SecConsultationMapper {

    List<SecConsultationVoio> getOnlineconsultationIsNotPaid(Integer patientId);

    List<SecConsultationVoio> getOnlineOrder(Integer patientId);
}