package com.example.demo.pojo;

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
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", status=").append(status);
        sb.append(", disabled=").append(disabled);
        sb.append(", createtime=").append(createtime);
        sb.append(", firstDepartmentId=").append(firstDepartmentId);
        sb.append(", secondDepartmentName=").append(secondDepartmentName);
        sb.append(", sequence=").append(sequence);
        sb.append(", secondDepartmentAddress=").append(secondDepartmentAddress);
        sb.append(", secondDepartmentCommont=").append(secondDepartmentCommont);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}