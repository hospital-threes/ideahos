package com.wx_hospital.pojo;

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



    private String DepartmentName;

    private String rankName;

    private String hospitalName;


    private String phto;

    private String author;

    private String info;

    private boolean hasChange;

    private String jieshao;

    private int praise;

    private int state;

    public String getPhto() {
        return phto;
    }

    public void setPhto(String phto) {
        this.phto = phto;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isHasChange() {
        return hasChange;
    }

    public void setHasChange(boolean hasChange) {
        this.hasChange = hasChange;
    }

    public String getJieshao() {
        return jieshao;
    }

    public void setJieshao(String jieshao) {
        this.jieshao = jieshao;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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
        return "SecDoctor{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", disabled=" + disabled +
                ", createtime=" + createtime +
                ", name='" + name + '\'' +
                ", assistant=" + assistant +
                ", display=" + display +
                ", tel='" + tel + '\'' +
                ", rank=" + rank +
                ", visitplaces='" + visitplaces + '\'' +
                ", visitaddress='" + visitaddress + '\'' +
                ", introduce='" + introduce + '\'' +
                ", adeptat='" + adeptat + '\'' +
                ", onlineconsultant=" + onlineconsultant +
                ", ispremium=" + ispremium +
                ", price=" + price +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", rankName='" + rankName + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                '}';
    }
}