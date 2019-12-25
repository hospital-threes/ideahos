package com.wx_hospital.mapper;


public interface HisOrderMapper {
    /*添加充值记录*/
    int InsertOrder(HisOrder HisOrder);

    List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId);
}