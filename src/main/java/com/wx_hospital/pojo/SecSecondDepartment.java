package com.wx_hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class SecSecondDepartment implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private Integer firstDepartmentId;

    private String secondDepartmentName;

    private Integer sequence;

    private String secondDepartmentAddress;

    private String secondDepartmentCommont;

    private Integer hospitalId;

    private String departmentName;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public Integer getFirstDepartmentId() {
        return firstDepartmentId;
    }

    public void setFirstDepartmentId(Integer firstDepartmentId) {
        this.firstDepartmentId = firstDepartmentId;
    }

    public String getSecondDepartmentName() {
        return secondDepartmentName;
    }

    public void setSecondDepartmentName(String secondDepartmentName) {
        this.secondDepartmentName = secondDepartmentName == null ? null : secondDepartmentName.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getSecondDepartmentAddress() {
        return secondDepartmentAddress;
    }

    public void setSecondDepartmentAddress(String secondDepartmentAddress) {
        this.secondDepartmentAddress = secondDepartmentAddress == null ? null : secondDepartmentAddress.trim();
    }

    public String getSecondDepartmentCommont() {
        return secondDepartmentCommont;
    }

    public void setSecondDepartmentCommont(String secondDepartmentCommont) {
        this.secondDepartmentCommont = secondDepartmentCommont == null ? null : secondDepartmentCommont.trim();
    }

    @Override
    public String toString() {
        return "SecSecondDepartment{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", firstDepartmentId=" + firstDepartmentId +
                ", secondDepartmentName='" + secondDepartmentName + '\'' +
                ", sequence=" + sequence +
                ", secondDepartmentAddress='" + secondDepartmentAddress + '\'' +
                ", secondDepartmentCommont='" + secondDepartmentCommont + '\'' +
                ", hospitalId=" + hospitalId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}