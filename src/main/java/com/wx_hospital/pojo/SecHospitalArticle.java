package com.wx_hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class SecHospitalArticle implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private String articleTitle;

    private Integer articleType;

    private Integer hospitalId;

    private String articleInfo;

    private static final long serialVersionUID = 1L;

    public String getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(String articleInfo) {
        this.articleInfo = articleInfo;
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

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    @Override
    public String toString() {
        return "SecHospitalArticle{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleType=" + articleType +
                ", hospitalId=" + hospitalId +
                ", articleInfo='" + articleInfo + '\'' +
                '}';
    }
}