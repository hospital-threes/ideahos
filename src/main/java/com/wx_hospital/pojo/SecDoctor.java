package com.example.demo.pojo;

import java.io.Serializable;
import java.util.Date;

public class SecDoctor implements Serializable {
    private Integer id;

    private String status;

    private Boolean disabled;

    private Date createtime;

    private String name;

    private Boolean assistant;

    private Boolean display;

    private String tel;

    private Integer rank;

    private String visitplaces;

    private String visitaddress;

    private String introduce;

    private String adeptat;

    private Boolean onlineconsultant;

    private Boolean ispremium;

    private Double price;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getAssistant() {
        return assistant;
    }

    public void setAssistant(Boolean assistant) {
        this.assistant = assistant;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getVisitplaces() {
        return visitplaces;
    }

    public void setVisitplaces(String visitplaces) {
        this.visitplaces = visitplaces == null ? null : visitplaces.trim();
    }

    public String getVisitaddress() {
        return visitaddress;
    }

    public void setVisitaddress(String visitaddress) {
        this.visitaddress = visitaddress == null ? null : visitaddress.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getAdeptat() {
        return adeptat;
    }

    public void setAdeptat(String adeptat) {
        this.adeptat = adeptat == null ? null : adeptat.trim();
    }

    public Boolean getOnlineconsultant() {
        return onlineconsultant;
    }

    public void setOnlineconsultant(Boolean onlineconsultant) {
        this.onlineconsultant = onlineconsultant;
    }

    public Boolean getIspremium() {
        return ispremium;
    }

    public void setIspremium(Boolean ispremium) {
        this.ispremium = ispremium;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        sb.append(", name=").append(name);
        sb.append(", assistant=").append(assistant);
        sb.append(", display=").append(display);
        sb.append(", tel=").append(tel);
        sb.append(", rank=").append(rank);
        sb.append(", visitplaces=").append(visitplaces);
        sb.append(", visitaddress=").append(visitaddress);
        sb.append(", introduce=").append(introduce);
        sb.append(", adeptat=").append(adeptat);
        sb.append(", onlineconsultant=").append(onlineconsultant);
        sb.append(", ispremium=").append(ispremium);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}