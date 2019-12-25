package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecReservation;
import com.wx_hospital.pojo.SecReservationVoio;

import java.util.List;

public interface SecReservationMapper {

    int addReservationTable(SecReservation secReservation);

    int addReservationTablePay(SecReservation secReservation);

    SecReservation SelectPaytime(String orderId);

    int deleteOrder(Integer orderId);

    List<SecReservationVoio> getReservationIsNotPaid(Integer patientId);
}