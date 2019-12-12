package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class SecDoctorAppointmenttimeTimeframe implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private Integer appointmenttimeId;

    private String timeframe;

    private Integer timeframePeoplenum;

    private String timeframeStatus;

    private Integer timeframePeoplenum1;

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

    public Integer getAppointmenttimeId() {
        return appointmenttimeId;
    }

    public void setAppointmenttimeId(Integer appointmenttimeId) {
        this.appointmenttimeId = appointmenttimeId;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe == null ? null : timeframe.trim();
    }

    public Integer getTimeframePeoplenum() {
        return timeframePeoplenum;
    }

    public void setTimeframePeoplenum(Integer timeframePeoplenum) {
        this.timeframePeoplenum = timeframePeoplenum;
    }

    public String getTimeframeStatus() {
        return timeframeStatus;
    }

    public void setTimeframeStatus(String timeframeStatus) {
        this.timeframeStatus = timeframeStatus == null ? null : timeframeStatus.trim();
    }

    public Integer getTimeframePeoplenum1() {
        return timeframePeoplenum1;
    }

    public void setTimeframePeoplenum1(Integer timeframePeoplenum1) {
        this.timeframePeoplenum1 = timeframePeoplenum1;
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
        sb.append(", appointmenttimeId=").append(appointmenttimeId);
        sb.append(", timeframe=").append(timeframe);
        sb.append(", timeframePeoplenum=").append(timeframePeoplenum);
        sb.append(", timeframeStatus=").append(timeframeStatus);
        sb.append(", timeframePeoplenum1=").append(timeframePeoplenum1);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}