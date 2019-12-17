package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecDoctor;
import com.wx_hospital.pojo.SecDoctorAppointmenttime;
import com.wx_hospital.pojo.SecDoctorAppointmenttimeTimeframe;

import java.util.List;

public interface SecDoctorMapper {
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
}

