package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecReservation;

public interface SecReservationMapper {

    int addReservationTable(SecReservation secReservation);

    int addReservationTablePay(SecReservation secReservation);

    SecReservation SelectPaytime(String orderId);

    int deleteOrder(Integer orderId);
}