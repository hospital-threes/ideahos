package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecConsultation;
import com.wx_hospital.pojo.SecConsultationVoio;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecConsultationMapper {

    List<SecConsultationVoio> getOnlineconsultationIsNotPaid(Integer patientId);

    List<SecConsultationVoio> getOnlineOrder(Integer patientId);

    SecConsultation getConsultationOrderDetailById(@Param("id") Integer id);
}