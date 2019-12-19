package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecDoctorMapper;
import com.wx_hospital.mapper.SecPatientMapper;
import com.wx_hospital.mapper.SecPayWayMapper;
import com.wx_hospital.mapper.SecReservationMapper;
import com.wx_hospital.pojo.*;
import com.wx_hospital.service.OnlineRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 预约挂号-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:52
 **/
@Service
public class OnlineRegistrationServiceImpl implements OnlineRegistrationService {

    @Autowired
    private SecPayWayMapper secPayWayMapper;
    @Autowired
    private SecReservationMapper secReservationMapper;
    @Autowired
    private SecDoctorMapper secDoctorMapper;
    @Autowired
    private SecPatientMapper secPatientMapper;


    @Override
    public List<SecPayWay> selectZhifuStyle() {
        return secPayWayMapper.selectZhifuStyle();
    }

    @Override
    public int addReservationTable(SecReservation secReservation) {
        return secReservationMapper.addReservationTable(secReservation);
    }

    @Override
    public List<SecDoctor> findDoctor(String deptId) {
        return secDoctorMapper.findDoctor(deptId);
    }

    @Override
    public SecDoctor huoquaddress(String id) {
        return secDoctorMapper.huoquaddress(id);
    }

    @Override
    public SecDoctorAppointmenttime huoquappointment(String appointmenttime) {
        return secDoctorMapper.huoquappointment(appointmenttime);
    }

    @Override
    public List<SecDoctorAppointmenttime> huoqutime(Integer id) {
        List<SecDoctorAppointmenttime> list=secDoctorMapper.huoqutime(id);
        return list;
    }

    @Override
    public List<SecDoctor> huoquadministrative(String deptname) {
        return secDoctorMapper.huoquadministrative(deptname);
    }

    @Override
    public List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id) {
        List<SecDoctorAppointmenttimeTimeframe> list=secDoctorMapper.huoquappointmenttime(id);


        return list;
    }

    @Override
    public Integer sum1(Integer id) {
        return secDoctorMapper.sum1(id);
    }

    @Override
    public Integer sum2(Integer id) {
        return secDoctorMapper.sum2(id);
    }

    @Override
    public String findTime(Integer id) {
        return secDoctorMapper.findTime( id);
    }

    @Override
    public String findTime2(Integer apptimeId) {
        return secDoctorMapper.findTime2( apptimeId);
    }

    @Override
    public String findDoctorName(Integer doctorId) {
        return secDoctorMapper.findDoctorName( doctorId);
    }

    @Override
    public int addReservationTablePay(SecReservation secReservation) {
        return secReservationMapper.addReservationTablePay(secReservation);
    }

    @Override
    public SecReservation SelectPaytime(String orderId) {
        return secReservationMapper.SelectPaytime(orderId);
    }

    @Override
    public SecPatient SelectCardNumber(String patientId) {
        return secPatientMapper.SelectCardNumber(patientId);
    }

    @Override
    public int deleteOrder(Integer orderId) {
        return secReservationMapper.deleteOrder(orderId);
    }
}

