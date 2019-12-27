package com.wx_hospital.service;

import com.wx_hospital.pojo.SecPatient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:56
 **/
public interface OutpatientPaymentService {
    /*门诊缴费*/
    List<SecPatient> SelectPatOrPay(@Param("id")Integer id);
}

