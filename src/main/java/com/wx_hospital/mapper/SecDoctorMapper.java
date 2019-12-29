package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecDoctor;
import com.wx_hospital.pojo.SecDoctorAppointmenttime;
import com.wx_hospital.pojo.SecDoctorAppointmenttimeTimeframe;

import java.util.List;

public interface SecDoctorMapper {
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
}

