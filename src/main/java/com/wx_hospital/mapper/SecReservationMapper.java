package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecReservation;
import com.wx_hospital.pojo.SecReservationVoio;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecReservationMapper {
    /**
     * 添加预约关联表
     * @param orderId
     * @param secReservation
     * @return
     */
    int addReservationTable(@Param("orderId") int orderId, @Param("secReservation") SecReservation secReservation);

    int addReservationTablePay(SecReservation secReservation);

    SecReservation SelectPaytime(String orderId);

    int deleteOrder(Integer orderId);

    List<SecReservationVoio> getReservationIsNotPaid(Integer patientId);

    List<SecReservationVoio> getReservationOrder(Integer patientId);
}