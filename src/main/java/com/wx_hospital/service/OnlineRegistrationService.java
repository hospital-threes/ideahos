package com.wx_hospital.service;

import com.wx_hospital.pojo.*;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:51
 **/
public interface OnlineRegistrationService {
    /**
     * 查询支付方式
     *
     * @return
     */
    List<SecPayWay> selectZhifuStyle();
    /**
     * 添加order表和预约表
     *
     * @param secReservation
     * @return
     */
    int addReservationTable(int orderId, SecReservation secReservation);
    /**
     * 查询医生信息
     *
     * @param deptId
     * @return
     */
    List<SecDoctor> findDoctor(String deptId);
    /**
     * 获取医生就诊地址
     *
     * @param id
     * @return
     */
    SecDoctor huoquaddress(String id);

    /**
     * 查询预约状态
     *
     * @param appointmenttime
     * @return
     */
    SecDoctorAppointmenttime huoquappointment(String appointmenttime);

    /**
     * 获取预约状态 时间
     *
     * @param id
     * @return
     */
    List<SecDoctorAppointmenttime> huoqutime(Integer id);
    /**
     * 获取同科室医生
     *
     * @param deptname
     * @return
     */
    List<SecDoctor> huoquadministrative(String deptname);
    /**
     * 获取预约时间
     *
     * @param id
     * @return
     */
    List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id);
    /**
     * 查询预约状态
     *
     * @param id
     * @return
     */
    Integer sum1(Integer id);
    /**
     * 查询预约状态
     *
     * @param id
     * @return
     */
    Integer sum2(Integer id);

    /**
     * 获取预约时间
     *
     * @param id
     * @return
     */
    String findTime(Integer id);
    /**
     * 获取预约时间
     *
     * @param apptimeId
     * @return
     */
    String findTime2(Integer apptimeId);
    /**
     * 获取预约时间
     *
     * @param doctorId
     * @return
     */
    String findDoctorName(Integer doctorId);
    /**
     * 添加预约表点击支付支付成功
     *
     * @param secReservation
     * @return
     */
    int addReservationTablePay(SecReservation secReservation);

    /**
     * 查询支付时间
     *
     * @param orderId
     * @return
     */
    SecReservation SelectPaytime(String orderId);
    /**
     * SelectCardNumber
     * 查询就诊卡号
     *
     * @param patientId
     * @return
     */
    SecPatient SelectCardNumber(String patientId);
    /**
     * 删除订单（取消）
     *
     * @param
     * @return
     */
    int deleteOrder(Integer orderId);
    /**
     * 查询一级科室-
     *
     * @return
     */
    List<SecFirstDepartment> selectFirstdepartment();

    /**
     * 添加order表和预约表
     *
     * @param hisOrder
     * @return
     */
    int addOrder(HisOrder hisOrder);
    /**
     * 添加预约表点击支付支付成功
     *
     * @param secReservation
     * @return
     */
    int upOrder(SecReservation secReservation);
}

