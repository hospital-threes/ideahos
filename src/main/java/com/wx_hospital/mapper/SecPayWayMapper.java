package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecPayWay;
import com.wx_hospital.pojo.SecUser;

import java.util.List;

public interface SecPayWayMapper {
    /**
     * @program: ideahos
     * @description:
     * @author: 罗子鉴
     * @create: 2019-12-13 12:51
     **/
    List<SecPayWay> selectZhifuStyle();
}