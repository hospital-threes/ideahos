package com.wx_hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class SecHospitalInfo implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private Integer newId;

    private Integer sequence;

    private String newInfo;

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

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getNewInfo() {
        return newInfo;
    }

    public void setNewInfo(String newInfo) {
        this.newInfo = newInfo == null ? null : newInfo.trim();
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
        sb.append(", newId=").append(newId);
        sb.append(", sequence=").append(sequence);
        sb.append(", newInfo=").append(newInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}