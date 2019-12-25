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

    List<SecPayWay> selectZhifuStyle();

    int addReservationTable(SecReservation secReservation);

    List<SecDoctor> findDoctor(String deptId);

    SecDoctor huoquaddress(String id);

    SecDoctorAppointmenttime huoquappointment(String appointmenttime);

    List<SecDoctorAppointmenttime> huoqutime(Integer id);

    List<SecDoctor> huoquadministrative(String deptname);

    List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id);

    Integer sum1(Integer id);

    Integer sum2(Integer id);

    String findTime(Integer id);

    String findTime2(Integer apptimeId);

    String findDoctorName(Integer doctorId);

    int addReservationTablePay(SecReservation secReservation);

    SecReservation SelectPaytime(String orderId);

    SecPatient SelectCardNumber(String patientId);

    int deleteOrder(Integer orderId);

    List<SecFirstDepartment> selectFirstdepartment();
}

