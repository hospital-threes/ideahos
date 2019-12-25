package com.wx_hospital.service;

import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecPatient;
import org.apache.ibatis.annotations.Param;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 13:04
 **/
public interface RechargeMedicalCardService {
    /*添加充值记录*/
    int InsertOrder(HisOrder HisOrder);
    /*就趁充值*/
    int UpdataMedical(SecPatient secPatient);

}

