package com.wx_hospital.mapper;


import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecReservation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HisOrderMapper {

    /**
     * 添加充值记录
     * @param HisOrder
     * @return
     */
    int InsertOrder(HisOrder HisOrder);

    /**
     *
     * @param patientId
     * @return
     */
    List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId);

    /**
     * 查询充值的记录
     * @param id
     * @return
     */
    HisOrder SelectIdOne(@Param("id")Integer id);

    /**
     * 修改充值记录的状态
     * @param oId
     * @param payWay
     * @return
     */
    int UpdataStatus(@Param("oId")Integer oId,@Param("payWay")String payWay);


    /**
     * 添加预约记录
     * @param hisOrder
     * @return
     */
    int addOrder(HisOrder hisOrder);

    /**
     * 修改订单表
     * @param secReservation
     * @return
     */
    int upOrder(SecReservation secReservation);
}