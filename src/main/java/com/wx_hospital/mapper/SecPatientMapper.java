package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecPatient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecPatientMapper {
    /**
     *  查询就诊人
     * @param id
     * @return
     */
    List<SecPatient> selectpatient(Integer id);
    /**
     * 修改默认人
     * @param patientid
     * @param userId
     * @return
     */
    int UpdateMoren(@Param("patientid") Integer patientid,@Param("userId")  Integer userId);
    /**
     * 回显就诊人（就诊信息）
     * @param
     * @return
     */
    SecPatient selectHuixiapatient(Integer id);
    /**
     * 验证手机验证码
     * @param userId
     * @return
     */
    SecPatient getDefaultPatient(Integer userId);
    /**
     * SelectCardNumber
     * 查询就诊卡号
     *
     * @param patientId
     * @return
     */
    SecPatient SelectCardNumber(String patientId);
    /**
     * 回显就诊人（就诊信息）
     * @param secPatient
     * @return
     */
    int addPatient(@Param("secPatient")SecPatient secPatient);
    /**
     * 添加就诊人
     * @param secPatient
     * @return
     */
    int updatePatient(@Param("secPatient")SecPatient secPatient);
    /**
     * 逻辑删除 就诊人信息
     * @param patientid
     * @return
     */
    int deletePatient(Integer patientid);
    /**
     * 就诊卡充值信息
     *
     * @param price
     * @param id
     * @return
     */
    int UpdataMedical(@Param("price")Integer price,@Param("id")Integer id);
    /**
     * 从就诊卡中扣钱信息
     * @param price
     * @param id
     * @return
     */
    int UpdataMedicalko(@Param("price")Integer price,@Param("id")Integer id);
    /**
     * 门诊缴费
     * @param id
     * @return
     */
    List<SecPatient> SelectPatOrPay(@Param("id")Integer id);

}