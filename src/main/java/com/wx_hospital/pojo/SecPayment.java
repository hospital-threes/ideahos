package com.wx_hospital.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class SecPayment implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    private String orderId;

    private String orderName;

    private Integer patientId;

    private String patientMedicalcardnumber;

    private Double price;

    private String priceType;

    private String priceStatus;

    private Date priceTime;

    private String fileAddr;


    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientMedicalcardnumber() {
        return patientMedicalcardnumber;
    }

    public void setPatientMedicalcardnumber(String patientMedicalcardnumber) {
        this.patientMedicalcardnumber = patientMedicalcardnumber == null ? null : patientMedicalcardnumber.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType == null ? null : priceType.trim();
    }

    public String getPriceStatus() {
        return priceStatus;
    }

    public void setPriceStatus(String priceStatus) {
        this.priceStatus = priceStatus == null ? null : priceStatus.trim();
    }

    public Date getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(Date priceTime) {
        this.priceTime = priceTime;
    }

    public String getFileAddr() {
        return fileAddr;
    }

    public void setFileAddr(String fileAddr) {
        this.fileAddr = fileAddr == null ? null : fileAddr.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", disabled=").append(disabled);
        sb.append(", createtime=").append(createtime);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderName=").append(orderName);
        sb.append(", patientId=").append(patientId);
        sb.append(", patientMedicalcardnumber=").append(patientMedicalcardnumber);
        sb.append(", price=").append(price);
        sb.append(", priceType=").append(priceType);
        sb.append(", priceStatus=").append(priceStatus);
        sb.append(", priceTime=").append(priceTime);
        sb.append(", fileAddr=").append(fileAddr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}