package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.*;
import com.wx_hospital.pojo.*;
import com.wx_hospital.service.PersonalCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 个人中心-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:57
 **/
@Service
public class PersonalCenterServiceImpl implements PersonalCenterService {
    @Autowired
    private SecUserMapper secUserMapper;
    @Autowired
    private SecPatientMapper secPatientMapper;
    @Autowired
    private HisOrderMapper hisOrderMapper;
    @Autowired
    private SecReservationMapper secReservationMapper;
    @Autowired
    private SecConsultationMapper secConsultationMapper;
    @Autowired
    private SecPaymentMapper secPaymentMapper;

    /**
     * 回显就诊人（就诊信息）
     * @param
     * @return
     */
    @Override
    public SecPatient selectHuixiapatient(Integer patientId) {

        return secPatientMapper.selectHuixiapatient(patientId);
    }
    /**
     * 修改默认人
     * @param patientid
     * @param userId
     * @return
     */
    @Override
    public int UpdateMoren(Integer patientid,Integer userId) {

        return secPatientMapper.UpdateMoren(patientid,userId);
    }
    /**
     *  查询就诊人
     * @param id
     * @return
     */
    @Override
    public List<SecPatient> selectpatient(Integer id) {

        return secPatientMapper.selectpatient(id);
    }
    /**
     * 验证手机验证码
     * @param phone
     * @return
     */
    @Override
    public SecUser userLogin(String phone) {

        SecUser userByPhone = secUserMapper.findUserByPhone(phone);
        if(userByPhone==null){
            int zhuce = secUserMapper.zhuce(phone);
            if(zhuce>0){
                userByPhone = secUserMapper.findUserByPhone(phone);
            }
        }

        return userByPhone;
    }
    /**
     * 验证手机验证码
     * @param userId
     * @return
     */
    @Override
    public SecPatient getDefaultPatient(Integer userId) {

        return secPatientMapper.getDefaultPatient(userId);
    }
    /**
     * 回显就诊人（就诊信息）
     * @param secPatient
     * @return
     */
    @Override
    public int addPatient(SecPatient secPatient) {

        return secPatientMapper.addPatient(secPatient);
    }

    /**
     * 添加就诊人
     * @param secPatient
     * @return
     */
    @Override
    public int updatePatient(SecPatient secPatient) {
        return secPatientMapper.updatePatient(secPatient);
    }
    /**
     * 逻辑删除 就诊人信息
     * @param patientid
     * @return
     */
    @Override
    public int deletePatient(Integer patientid) {

        return secPatientMapper.deletePatient(patientid);
    }
    /**
     * 获取当前未支付订单信息
     * @Param patientId
     * return
     */
    @Override
    public List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId) {

        List<HisOrder> hisOrders = hisOrderMapper.getNoPaymentOrderBypatientId(patientId);

        return hisOrders;
    }
    /**
     * 获取当前就诊人预约挂号信息
     * @Param patientId
     * return
     */
    @Override
    public List<SecReservationVoio> getReservationIsNotPaid(Integer patientId) {

        List<SecReservationVoio> reservations = secReservationMapper.getReservationIsNotPaid(patientId);

        return reservations;
    }

    /**
     * 获取当前就诊人的在线咨询信息
     * @Param patientId
     * return
     */
    @Override
    public List<SecConsultationVoio> getOnlineconsultationIsNotPaid(Integer patientId) {

        List<SecConsultationVoio> secConsultationVoios = secConsultationMapper.getOnlineconsultationIsNotPaid(patientId);

        return secConsultationVoios;
    }
    /**
     * 获取当前就诊人门诊缴费订单
     * @Param patientId
     * return
     */
    @Override
    public List<SecPaymentVoio> getOutpatientpayment(Integer patientId) {

        List<SecPaymentVoio> paymentVoios = secPaymentMapper.getOutpatientpayment(patientId);

        return paymentVoios;
    }
    /**
     * 获取当前就诊人充值缴费订单
     * @Param patientId
     * return
     */
    @Override
    public List<HisOrder> getPatientrechargeIsNotPaid(Integer patientId) {

        List<HisOrder> orders = hisOrderMapper.getNoPaymentOrderBypatientId(patientId);

        return orders;
    }


    /**
     * 获取当前就诊人的信息
     * @param patientId
     * @return
     */
    @Override
    public List<SecConsultationVoio> getOnlineOrder(Integer patientId) {

        List<SecConsultationVoio> consultationVoios = secConsultationMapper.getOnlineOrder(patientId);

        return consultationVoios;
    }
    /**
     * 获取在线咨询详情
     * @param id
     * @return
     */
    @Override
    public SecConsultation getConsultationOrderDetailById(Integer id) {

        SecConsultation consultation = secConsultationMapper.getConsultationOrderDetailById(id);

        return consultation;
    }

    @Override
    public List<SecReservationVoio> getReservationOrder(Integer patientId) {

        List<SecReservationVoio> reservationVoios = secReservationMapper.getReservationOrder(patientId);

        return reservationVoios;
    }

    @Override
    public List<SecPaymentVoio> getAllOutpatientpayment(Integer patientId) {

        List<SecPaymentVoio> paymentVoios = secPaymentMapper.getAllOutpatientpayment(patientId);

        return paymentVoios;
    }

    @Override
    public List<HisOrder> getPatientrecharge(Integer patientId) {

        List<HisOrder> hisOrders = hisOrderMapper.getPatientrecharge(patientId);

        return hisOrders;
    }

}

