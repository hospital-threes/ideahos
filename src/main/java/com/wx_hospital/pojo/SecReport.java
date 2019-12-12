package com.wx_hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class SecReport implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private String examineName;

    private String examineInfo;

    private Integer examineId;

    private Integer clinicDepartmentId;

    private Date sampleTime;

    private String sampleType;

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

    public String getExamineName() {
        return examineName;
    }

    public void setExamineName(String examineName) {
        this.examineName = examineName == null ? null : examineName.trim();
    }

    public String getExamineInfo() {
        return examineInfo;
    }

    public void setExamineInfo(String examineInfo) {
        this.examineInfo = examineInfo == null ? null : examineInfo.trim();
    }

    public Integer getExamineId() {
        return examineId;
    }

    public void setExamineId(Integer examineId) {
        this.examineId = examineId;
    }

    public Integer getClinicDepartmentId() {
        return clinicDepartmentId;
    }

    public void setClinicDepartmentId(Integer clinicDepartmentId) {
        this.clinicDepartmentId = clinicDepartmentId;
    }

    public Date getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType == null ? null : sampleType.trim();
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
        sb.append(", examineName=").append(examineName);
        sb.append(", examineInfo=").append(examineInfo);
        sb.append(", examineId=").append(examineId);
        sb.append(", clinicDepartmentId=").append(clinicDepartmentId);
        sb.append(", sampleTime=").append(sampleTime);
        sb.append(", sampleType=").append(sampleType);
        sb.append(", fileAddr=").append(fileAddr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}