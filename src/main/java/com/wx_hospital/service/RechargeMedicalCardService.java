package com.wx_hospital.service;

import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecPatient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    int UpdataMedical(@Param("price")Integer price,@Param("id")Integer id,@Param("oId")Integer oId,@Param("payWay")String payWay);
    /*就诊卡扣费*/
    int UpdataMedicalko(@Param("price")Integer price,@Param("id")Integer id,@Param("oId")Integer oId,@Param("payWay")String payWay);
    /*查询充值的记录*/
    HisOrder SelectIdOne(@Param("id")Integer id);


}

