package com.wx_hospital.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class SecPaymentVoio implements Serializable {
    private Integer id;
    private Integer orderId;
    private String orderName;
    private String orderNum;
    private Double payMoney;
    private String status;
    private String patmentName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyt-MM-dd")
    private Date patmentTime;

    private String fileAddr;

    public String getFileAddr() {
        return fileAddr;
    }

    public void setFileAddr(String fileAddr) {
        this.fileAddr = fileAddr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatmentName() {
        return patmentName;
    }

    public void setPatmentName(String patmentName) {
        this.patmentName = patmentName;
    }

    public Date getPatmentTime() {
        return patmentTime;
    }

    public void setPatmentTime(Date patmentTime) {
        this.patmentTime = patmentTime;
    }
}