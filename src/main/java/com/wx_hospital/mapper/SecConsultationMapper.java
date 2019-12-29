package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecConsultation;
import com.wx_hospital.pojo.SecConsultationVoio;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecConsultationMapper {
    /**
     * 获取当前就诊人的在线咨询信息
     * @Param patientId
     * return
     */
    List<SecConsultationVoio> getOnlineconsultationIsNotPaid(Integer patientId);
    /**
     * 获取当前就诊人的信息
     * @param patientId
     * @return
     */
    List<SecConsultationVoio> getOnlineOrder(Integer patientId);
    /**
     * 获取在线咨询详情
     * @param id
     * @param hospitalId
     * @return
     */
    SecConsultation getOrderDetailById(@Param("id") Integer id,@Param("hospitalId") Integer hospitalId);
}