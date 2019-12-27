package com.wx_hospital.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class HisOrder implements Serializable {
    private Integer id;

    private Boolean disabled;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private String orderName;

    private String orderNum;

    private Integer orderPlacer;

    private String status;

    private Date payStartTime;

    private Date refundStartTime;

    private Double payMoney;

    private String payWay;

    private String patientMedicalcardnumber;

    private static final long serialVersionUID = 1L;

    public String getPatientMedicalcardnumber() {
        return patientMedicalcardnumber;
    }

    public void setPatientMedicalcardnumber(String patientMedicalcardnumber) {
        this.patientMedicalcardnumber = patientMedicalcardnumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Integer getOrderPlacer() {
        return orderPlacer;
    }

    public void setOrderPlacer(Integer orderPlacer) {
        this.orderPlacer = orderPlacer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getPayStartTime() {
        return payStartTime;
    }

    public void setPayStartTime(Date payStartTime) {
        this.payStartTime = payStartTime;
    }

    public Date getRefundStartTime() {
        return refundStartTime;
    }

    public void setRefundStartTime(Date refundStartTime) {
        this.refundStartTime = refundStartTime;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    @Override
    public String toString() {
        return "HisOrder{" +
                "id=" + id +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", orderName='" + orderName + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", orderPlacer=" + orderPlacer +
                ", status='" + status + '\'' +
                ", payStartTime=" + payStartTime +
                ", refundStartTime=" + refundStartTime +
                ", payMoney=" + payMoney +
                ", payWay='" + payWay + '\'' +
                ", patientMedicalcardnumber='" + patientMedicalcardnumber + '\'' +
                '}';
    }
}