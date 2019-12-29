package com.wx_hospital.controller;

import com.wx_hospital.pojo.*;
import com.wx_hospital.service.PersonalCenterService;
import com.wx_hospital.utils.JSONUtils;
import com.wx_hospital.utils.JedisClientPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: ideahos
 * @description: 个人中心-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:29
 **/
@Controller
@RequestMapping("personalCenter")
public class PersonalCenterController {
    @Autowired
    private PersonalCenterService personalCenterServiceImpl;
    @Autowired
    private JedisClientPool jedisClientPool;



    /**
     * 发送手机验证码
     * @param phone
     * @return
     */
    @RequestMapping("/getPhoneCode")
    @ResponseBody
    public boolean getmobileCode(String phone) {
        //生成随机4位数验证码
        int code = (int) ((Math.random() * 9 + 1) * 1000);
        //将int 转换成 string
        String pCode = String.valueOf(code);
        System.out.println(pCode);

        //生成key值
        String sss = "pCode" + phone;
        //将验证码存入到redis 数据库中
        String set = jedisClientPool.set(sss, pCode);

        //设置存在时间为5分钟
        Long expire = jedisClientPool.expire(sss, 5 * 60);
        //通过插件发送信息
        //boolean b = SendSMSUtils.sendMSM(phone, pCode);

        return expire>0;
    }


    /**
     * 验证手机验证码
     * @param pCode
     * @param phone
     * @return
     */
    @RequestMapping("/verifyPhoneCode")
    @ResponseBody
    public Map<String, String> verifyMobileCode(String phone, String pCode) {
        Map<String, String> map = new HashMap<String, String>();
        String sss= "pCode" + phone;
        //将用户的验证码从redis中取出
        String code = jedisClientPool.get(sss);
        //进行判断
        if (pCode.equals(code)) {

            map.put("result","success");

            SecUser secUser= personalCenterServiceImpl.userLogin(phone);

            map.put("userId", secUser.getId()+"");

            SecPatient secPatient = personalCenterServiceImpl.getDefaultPatient(secUser.getId());

            map.put("patientInfo", JSONUtils.object2Json(secPatient));
        }else {
            map.put("result","failed");
        }

        return map;
    }

    /**
     * 获取默认就诊人信息
     * @param userId
     * @return
     */
    @RequestMapping("/getDefaultPatient")
    @ResponseBody
    public SecPatient getDefaultPatient(Integer userId){

        SecPatient secPatient = personalCenterServiceImpl.getDefaultPatient(userId);

        return secPatient;
    }

    /**
     *  查询就诊人
     * @param userId
     * @return
     */
    @RequestMapping("/selectPatient")
    @ResponseBody
    public List<SecPatient> selectPatient(Integer userId){//用户id(获取session的id)
        List<SecPatient>  list =personalCenterServiceImpl.selectpatient(userId);
        return list;
    }



    /**
     * 修改默认人
     * @param patientid
     * @param userId
     * @return
     */
    @RequestMapping("/UpdateMoren")
    @ResponseBody
    public int UpdateMoren(Integer patientid,Integer userId){//patientid
        int i =personalCenterServiceImpl.UpdateMoren(patientid,userId);
        return i;
    }

    /**
     * 回显就诊人（就诊信息）
     * @param
     * @return
     */
    @RequestMapping("/selectHuixiapatient")
    @ResponseBody
    public SecPatient selectHuixiapatient(Integer patientid){
        SecPatient secPatient =personalCenterServiceImpl.selectHuixiapatient(patientid);
        return  secPatient;
    }

    /**
     * 添加就诊人
     * @param secPatient
     * @return
     */
    @RequestMapping("/addPatient")
    @ResponseBody
    public boolean addPatient(SecPatient secPatient){
        int i = personalCenterServiceImpl.addPatient(secPatient);
        return i>0;
    }


    /**
     * 添加就诊人
     * @param secPatient
     * @return
     */
    @RequestMapping("/updatePatient")
    @ResponseBody
    public boolean updatePatient(SecPatient secPatient){
        int i = personalCenterServiceImpl.updatePatient(secPatient);
        return i>0;
    }

    /**
     * 逻辑删除 就诊人信息
     * @param patientid
     * @return
     */
    @RequestMapping("/deletePatient")
    @ResponseBody
    public boolean deletePatient(Integer patientid){

        int i = personalCenterServiceImpl.deletePatient(patientid);

        return i>0;
    }

    /**
     * 获取当前未支付订单信息
     * @Param patientId
     * return
     */
    @RequestMapping("/getNoPaymentOrderBypatientId")
    @ResponseBody
    public List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId){

        List<HisOrder> hisOrders = personalCenterServiceImpl.getNoPaymentOrderBypatientId(patientId);

        return hisOrders;
    }


    /**
     * 获取当前就诊人预约挂号信息
     * @Param patientId
     * return
     */
    @RequestMapping("/getReservationIsNotPaid")
    @ResponseBody
    public List<SecReservationVoio> getReservationIsNotPaid(Integer patientId){

        List<SecReservationVoio> reservations = personalCenterServiceImpl.getReservationIsNotPaid(patientId);

        return reservations;
    }

    /**
     * 获取当前就诊人的在线咨询信息
     * @Param patientId
     * return
     */
    @RequestMapping("/getOnlineconsultationIsNotPaid")
    @ResponseBody
    public List<SecConsultationVoio> getOnlineconsultationIsNotPaid(Integer patientId){

        List<SecConsultationVoio> consultations = personalCenterServiceImpl.getOnlineconsultationIsNotPaid(patientId);

        return consultations;
    }

    /**
     * 获取当前就诊人门诊缴费订单
     * @Param patientId
     * return
     */
    @RequestMapping("/getOutpatientpayment")
    @ResponseBody
    public List<SecPaymentVoio> getOutpatientpayment(Integer patientId){

        List<SecPaymentVoio> paymentVoios = personalCenterServiceImpl.getOutpatientpayment(patientId);

        return paymentVoios;
    }

    /**
     * 获取当前就诊人充值缴费订单
     * @Param patientId
     * return
     */
    @RequestMapping("/getPatientrechargeIsNotPaid")
    @ResponseBody
    public List<HisOrder> getPatientrechargeIsNotPaid(Integer patientId){

        List<HisOrder> orders = personalCenterServiceImpl.getPatientrechargeIsNotPaid(patientId);

        return orders;
    }


    /**
     *
     * 获取当前就诊人的信息
     */
    @RequestMapping("/getOnlineOrder")
    @ResponseBody
    public List<SecConsultationVoio> getOnlineOrder(Integer patientId){

        List<SecConsultationVoio> consultations = personalCenterServiceImpl.getOnlineOrder(patientId);

        return consultations;
    }

    /**
     * 获取在线咨询详情
     * @param id
     * @param hospitalId
     * @return
     */
    @RequestMapping("/getOrderDetailById")
    @ResponseBody
    public SecConsultation getOrderDetailById(Integer id,Integer hospitalId){

        SecConsultation consultation = personalCenterServiceImpl.getOrderDetailById(id,hospitalId);

        return consultation;
    }

}

