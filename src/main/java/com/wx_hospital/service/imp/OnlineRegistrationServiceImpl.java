package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.*;
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
    @Autowired
    private SecFirstDepartmentMapper secFirstDepartmentMapper;
    @Autowired
    private HisOrderMapper hisOrderMapper;



    /**
     * @program: ideahos
     * @description:
     * @author: 罗子鉴
     * @create: 2019-12-13 12:51
     **/
    @Override
    public List<SecPayWay> selectZhifuStyle() {
        return secPayWayMapper.selectZhifuStyle();
    }
    /**
     * 添加order表和预约表
     *
     * @param secReservation
     * @return
     */
    @Override
    public int addReservationTable(int orderId, SecReservation secReservation) {
        return secReservationMapper.addReservationTable(orderId,secReservation);
    }
    /**
     * 查询医生信息
     *
     * @param deptId
     * @return
     */
    @Override
    public List<SecDoctor> findDoctor(String deptId) {
        return secDoctorMapper.findDoctor(deptId);
    }
    /**
     * 获取医生就诊地址
     *
     * @param id
     * @return
     */
    @Override
    public SecDoctor huoquaddress(String id) {
        return secDoctorMapper.huoquaddress(id);
    }
    /**
     * 查询预约状态
     *
     * @param appointmenttime
     * @return
     */
    @Override
    public SecDoctorAppointmenttime huoquappointment(String appointmenttime) {
        return secDoctorMapper.huoquappointment(appointmenttime);
    }
    /**
     * 获取预约状态 时间
     *
     * @param id
     * @return
     */
    @Override
    public List<SecDoctorAppointmenttime> huoqutime(Integer id) {
        List<SecDoctorAppointmenttime> list=secDoctorMapper.huoqutime(id);
        return list;
    }
    /**
     * 获取同科室医生
     *
     * @param deptname
     * @return
     */
    @Override
    public List<SecDoctor> huoquadministrative(String deptname) {
        return secDoctorMapper.huoquadministrative(deptname);
    }
    /**
     * 获取预约时间
     *
     * @param id
     * @return
     */
    @Override
    public List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id) {
        List<SecDoctorAppointmenttimeTimeframe> list=secDoctorMapper.huoquappointmenttime(id);


        return list;
    }
    /**
     * 查询预约状态
     *
     * @param id
     * @return
     */
    @Override
    public Integer sum1(Integer id) {
        return secDoctorMapper.sum1(id);
    }
    /**
     * 查询预约状态
     *
     * @param id
     * @return
     */
    @Override
    public Integer sum2(Integer id) {
        return secDoctorMapper.sum2(id);
    }
    /**
     * 获取预约时间
     *
     * @param id
     * @return
     */
    @Override
    public String findTime(Integer id) {
        return secDoctorMapper.findTime( id);
    }
    /**
     * 获取预约时间
     *
     * @param apptimeId
     * @return
     */
    @Override
    public String findTime2(Integer apptimeId) {
        return secDoctorMapper.findTime2( apptimeId);
    }
    /**
     * 获取预约时间
     *
     * @param doctorId
     * @return
     */
    @Override
    public String findDoctorName(Integer doctorId) {
        return secDoctorMapper.findDoctorName( doctorId);
    }
    /**
     * 添加预约表点击支付支付成功
     *
     * @param secReservation
     * @return
     */
    @Override
    public int addReservationTablePay(SecReservation secReservation) {
        return secReservationMapper.addReservationTablePay(secReservation);
    }
    /**
     * 查询支付时间
     *
     * @param orderId
     * @return
     */
    @Override
    public SecReservation SelectPaytime(String orderId) {
        return secReservationMapper.SelectPaytime(orderId);
    }
    /**
     * SelectCardNumber
     * 查询就诊卡号
     *
     * @param patientId
     * @return
     */
    @Override
    public SecPatient SelectCardNumber(String patientId) {
        return secPatientMapper.SelectCardNumber(patientId);
    }
    /**
     * 删除订单（取消）
     *
     * @param
     * @return
     */
    @Override
    public int deleteOrder(Integer orderId) {
        return secReservationMapper.deleteOrder(orderId);
    }
    /**
     * 查询一级科室-
     *
     * @return
     */
    @Override
    public List<SecFirstDepartment> selectFirstdepartment() {
        return secFirstDepartmentMapper.selectFirstdepartment();
    }
    /**
     * 添加order表和预约表
     *
     * @param hisOrder
     * @return
     */
    @Override
    public int addOrder(HisOrder hisOrder) {
        return hisOrderMapper.addOrder(hisOrder);
    }
    /**
     * 添加预约表点击支付支付成功
     *
     * @param secReservation
     * @return
     */
    @Override
    public int upOrder(SecReservation secReservation) {
        return hisOrderMapper.upOrder(secReservation);
    }
}

