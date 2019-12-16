package com.wx_hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class SecHospitalArticleInfo implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private Integer articleId;

    private Integer sequence;

    private String articleInfo;

    private String articleTitle;

    private static final long serialVersionUID = 1L;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
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

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(String articleInfo) {
        this.articleInfo = articleInfo == null ? null : articleInfo.trim();
    }

    @Override
    public String toString() {
        return "SecHospitalArticleInfo{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", articleId=" + articleId +
                ", sequence=" + sequence +
                ", articleInfo='" + articleInfo + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                '}';
    }
}