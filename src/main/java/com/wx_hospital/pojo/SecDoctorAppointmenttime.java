package com.wx_hospital.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class SecDoctorAppointmenttime implements Serializable {


    private Integer id;

    private String status;

    private Boolean disabled;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createtime;

    private Integer hospitalId;

    private Integer doctorId;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date appointmentTime;

    private String appointmentStatus;

    private String appointmentTimes;

    private String week;




    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        return "SecDoctorAppointmenttime{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", hospitalId=" + hospitalId +
                ", doctorId=" + doctorId +
                ", appointmentTime=" + appointmentTime +
                ", appointmentStatus='" + appointmentStatus + '\'' +
                ", appointmentTimes='" + appointmentTimes + '\'' +
                ", week='" + week + '\'' +
                '}';
    }

    public String getAppointmentTimes() {
        return appointmentTimes;
    }

    public void setAppointmentTimes(String appointmentTimes) {
        this.appointmentTimes = appointmentTimes;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus == null ? null : appointmentStatus.trim();
    }

}