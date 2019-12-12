package com.wx_hospital.pojo;

import java.util.Date;

/**
 * @author Administrator
 * @desc
 * @create 2019-12-11 20:16
 **/

public class JiuzhenPersonVo {/*就诊人vo*/
    private  Integer id;
    private String  patientName;
    private String  examineInfo;
    private String  sampleType;
    private Date sampleTime;
    private String  secondDepartmentName;
    private String  secondDepartmentAddress;


    @Override
    public String toString() {
        return "JiuzhenPersonVo{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", examineInfo='" + examineInfo + '\'' +
                ", sampleType='" + sampleType + '\'' +
                ", sampleTime=" + sampleTime +
                ", secondDepartmentName='" + secondDepartmentName + '\'' +
                ", secondDepartmentAddress='" + secondDepartmentAddress + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getExamineInfo() {
        return examineInfo;
    }

    public void setExamineInfo(String examineInfo) {
        this.examineInfo = examineInfo;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public Date getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    public String getSecondDepartmentName() {
        return secondDepartmentName;
    }

    public void setSecondDepartmentName(String secondDepartmentName) {
        this.secondDepartmentName = secondDepartmentName;
    }

    public String getSecondDepartmentAddress() {
        return secondDepartmentAddress;
    }

    public void setSecondDepartmentAddress(String secondDepartmentAddress) {
        this.secondDepartmentAddress = secondDepartmentAddress;
    }
}
