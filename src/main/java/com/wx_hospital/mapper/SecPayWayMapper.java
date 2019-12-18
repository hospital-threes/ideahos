package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecPayWay;
import com.wx_hospital.pojo.SecUser;

import java.util.List;

public interface SecPayWayMapper {

    List<SecPayWay> selectZhifuStyle();

    List<SecPatient> selectpatient(Integer id);

    int UpdateMoren(Integer id);

    SecPatient selectHuixiapatient(Integer id);

    SecPatient selectUser(Integer id);
}