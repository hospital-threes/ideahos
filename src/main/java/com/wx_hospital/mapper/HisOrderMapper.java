package com.wx_hospital.mapper;


import com.wx_hospital.pojo.HisOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HisOrderMapper {
    /*添加充值记录*/
    int InsertOrder(HisOrder HisOrder);

    List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId);
    /*查询充值的记录*/
    HisOrder SelectIdOne(@Param("id")Integer id);
    /*修改充值记录的状态*/
    int UpdataStatus(@Param("oId")Integer oId,@Param("payWay")String payWay);

}