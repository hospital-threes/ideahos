package com.wx_hospital.service;

import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecUser;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:57
 **/
public interface PersonalCenterService {

    SecPatient selectHuixiapatient(Integer patientId);

    int UpdateMoren(Integer patientid,Integer userId);

    List<SecPatient> selectpatient(Integer id);

    SecUser userLogin(String phone);

    SecPatient getDefaultPatient(Integer userId);

    int addPatient(SecPatient secPatient);

    int updatePatient(SecPatient secPatient);
}

