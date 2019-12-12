package com.wx_hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class HisOrder implements Serializable {
    private Integer id;

    private Boolean disabled;

    private Date createtime;

    private String orderName;

    private String orderNum;

    private Integer orderPlacer;

    private String status;

    private Date payStartTime;

    private Date refundStartTime;

    private Double payMoney;

    private String payWay;

    private static final long serialVersionUID = 1L;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", disabled=").append(disabled);
        sb.append(", createtime=").append(createtime);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", orderPlacer=").append(orderPlacer);
        sb.append(", status=").append(status);
        sb.append(", payStartTime=").append(payStartTime);
        sb.append(", refundStartTime=").append(refundStartTime);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payWay=").append(payWay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}