package com.wx_hospital.service;

import com.wx_hospital.pojo.*;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:57
 **/
public interface PersonalCenterService {
    /**
     * 回显就诊人（就诊信息）
     *
     * @param
     * @return
     */
    SecPatient selectHuixiapatient(Integer patientId);

    /**
     * 修改默认人
     *
     * @param patientid
     * @param userId
     * @return
     */
    int UpdateMoren(Integer patientid, Integer userId);

    /**
     * 查询就诊人
     *
     * @param id
     * @return
     */
    List<SecPatient> selectpatient(Integer id);

    /**
     * 验证手机验证码
     *
     * @param phone
     * @return
     */
    SecUser userLogin(String phone);

    /**
     * 获取默认就诊人信息
     *
     * @param userId
     * @return
     */
    SecPatient getDefaultPatient(Integer userId);

    /**
     * 添加就诊人
     *
     * @param secPatient
     * @return
     */
    int addPatient(SecPatient secPatient);

    /**
     * 添加就诊人
     *
     * @param secPatient
     * @return
     */
    int updatePatient(SecPatient secPatient);

    /**
     * 逻辑删除 就诊人信息
     *
     * @param patientid
     * @return
     */
    int deletePatient(Integer patientid);

    /**
     * 获取当前未支付订单信息
     *
     * @Param patientId
     * return
     */
    List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId);

    /**
     * 获取当前就诊人预约挂号信息
     *
     * @Param patientId
     * return
     */
    List<SecReservationVoio> getReservationIsNotPaid(Integer patientId);

    /**
     * 获取当前就诊人的在线咨询信息
     *
     * @Param patientId
     * return
     */
    List<SecConsultationVoio> getOnlineconsultationIsNotPaid(Integer patientId);

    /**
     * 获取当前就诊人门诊缴费订单
     *
     * @Param patientId
     * return
     */
    List<SecPaymentVoio> getOutpatientpayment(Integer patientId);

    /**
     * 获取当前就诊人充值缴费订单
     *
     * @Param patientId
     * return
     */
    List<HisOrder> getPatientrechargeIsNotPaid(Integer patientId);

    /**
     * 获取当前就诊人的信息
     */
    List<SecConsultationVoio> getOnlineOrder(Integer patientId);

    /**
     * 获取在线咨询详情
     *
     * @param id
     * @param hospitalId
     * @return
     */
    SecConsultation getOrderDetailById(Integer id, Integer hospitalId);
}

