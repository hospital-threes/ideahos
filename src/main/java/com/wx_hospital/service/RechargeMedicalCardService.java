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
    /**
     * 就诊卡充值
     * @param HisOrder
     * @return
     */
    int InsertOrder(HisOrder HisOrder);
    /**
     * 就诊卡充值信息
     *
     * @param price
     * @param id
     * @param oId
     * @param payWay
     * @return
     */
    int UpdataMedical(@Param("price")Integer price,@Param("id")Integer id,@Param("oId")Integer oId,@Param("payWay")String payWay);
    /**
     * 从就诊卡中扣钱信息
     * @param price
     * @param id
     * @param oId
     * @param payWay
     * @return
     */
    int UpdataMedicalko(@Param("price")Integer price,@Param("id")Integer id,@Param("oId")Integer oId,@Param("payWay")String payWay);
    /**
     * 查询单个充值记录
     * @param id
     * @return
     */
    HisOrder SelectIdOne(@Param("id")Integer id);


}

