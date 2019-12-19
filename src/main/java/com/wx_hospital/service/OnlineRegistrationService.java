package com.wx_hospital.service;

import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecPayWay;
import com.wx_hospital.pojo.SecUser;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:51
 **/
public interface OnlineRegistrationService {

    List<SecPayWay> selectZhifuStyle();

//    List<SecPatient> selectpatient(Integer id);
//
//    int UpdateMoren(Integer id);
//
//    SecPatient selectHuixiapatient(Integer id);
//
//    SecPatient selectUser(Integer id);
}

