package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecPatient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecPatientMapper {

    List<SecPatient> selectpatient(Integer id);

    int UpdateMoren(@Param("patientid") Integer patientid,@Param("userId")  Integer userId);

    SecPatient selectHuixiapatient(Integer id);

    SecPatient getDefaultPatient(Integer userId);
}