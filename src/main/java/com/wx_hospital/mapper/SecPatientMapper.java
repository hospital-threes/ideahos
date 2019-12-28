package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecPatient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecPatientMapper {

    List<SecPatient> selectpatient(Integer id);

    int UpdateMoren(@Param("patientid") Integer patientid,@Param("userId")  Integer userId);

    SecPatient selectHuixiapatient(Integer id);

    SecPatient getDefaultPatient(Integer userId);

    SecPatient SelectCardNumber(String patientId);

    int addPatient(@Param("secPatient")SecPatient secPatient);

    int updatePatient(@Param("secPatient")SecPatient secPatient);

    int deletePatient(Integer patientid);

    /*就趁充值*/
    int UpdataMedical(@Param("price")Integer price,@Param("id")Integer id);
    /*就诊卡扣费*/
    int UpdataMedicalko(@Param("price")Integer price,@Param("id")Integer id);
    /*门诊缴费*/
    List<SecPatient> SelectPatOrPay(@Param("id")Integer id);

}