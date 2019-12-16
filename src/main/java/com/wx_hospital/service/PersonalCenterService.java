package com.wx_hospital.service;

import com.wx_hospital.pojo.SecUser;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:57
 **/
public interface PersonalCenterService {

    SecUser userLogin(String phone);
}

