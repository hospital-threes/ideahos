package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecReservation;
import com.wx_hospital.pojo.SecReservationVoio;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecReservationMapper {
    /**
     * 添加order表和预约表
     *
     * @param secReservation
     * @return
     */
    /**
     * 添加预约关联表
     * @param orderId
     * @param secReservation
     * @return
     */
    int addReservationTable(@Param("orderId") int orderId, @Param("secReservation") SecReservation secReservation);
    /**
     * 添加预约表点击支付支付成功
     *
     * @param secReservation
     * @return
     */
    int addReservationTablePay(SecReservation secReservation);
    /**
     * 查询支付时间
     *
     * @param orderId
     * @return
     */
    SecReservation SelectPaytime(String orderId);
    /**
     * 删除订单（取消）
     *
     * @param
     * @return
     */
    int deleteOrder(Integer orderId);
    /**
     * 获取当前就诊人预约挂号信息
     * @Param patientId
     * return
     */
    List<SecReservationVoio> getReservationIsNotPaid(Integer patientId);

    List<SecReservationVoio> getReservationOrder(Integer patientId);
}