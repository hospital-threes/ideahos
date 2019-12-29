package com.wx_hospital.mapper;


import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecReservation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HisOrderMapper {
    /*添加充值记录*/
    int InsertOrder(HisOrder HisOrder);

    List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId);

    List<HisOrder> getPatientrecharge(Integer patientId);

    /*查询充值的记录*/
    HisOrder SelectIdOne(@Param("id")Integer id);
    /*修改充值记录的状态*/
    int UpdataStatus(@Param("oId")Integer oId,@Param("payWay")String payWay);

    /*添加预约记录*/
    int addOrder(HisOrder hisOrder);
    /*修改订单表*/
    int upOrder(SecReservation secReservation);

}