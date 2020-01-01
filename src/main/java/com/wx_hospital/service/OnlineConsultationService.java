package com.wx_hospital.service;

import com.wx_hospital.pojo.SecDoctor;
import com.wx_hospital.pojo.SecPic;
import com.wx_hospital.utils.Response;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:49
 **/
public interface OnlineConsultationService {

    List<SecDoctor> getAlldt22();

    boolean updateConsultationState(int id);

    boolean addSecPicBySecConsultation(SecPic pic, int orderId);

    Response addSecConsultation(SecDoctor doctor, int userid, String phone, String biaoti, String text, String fix, int paymentStatus, String orderNum, int state, int hospitalId,int  patientId,int doctorId);
}

