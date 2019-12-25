package com.wx_hospital.mapper;


import com.wx_hospital.pojo.HisOrder;

import java.util.List;

public interface HisOrderMapper {

    List<HisOrder> getNoPaymentOrderBypatientId(Integer patientId);
}