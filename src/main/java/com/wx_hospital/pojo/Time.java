package com.wx_hospital.pojo;

public class Time {
    private String yuyuetime;

    private String yuyuetime1;

    private String week;

    private String doctorName;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getYuyuetime() {
        return yuyuetime;
    }

    public void setYuyuetime(String yuyuetime) {
        this.yuyuetime = yuyuetime;
    }

    public String getYuyuetime1() {
        return yuyuetime1;
    }

    public void setYuyuetime1(String yuyuetime1) {
        this.yuyuetime1 = yuyuetime1;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    @Override
    public String toString() {
        return "Time{" +
                "yuyuetime='" + yuyuetime + '\'' +
                ", yuyuetime1='" + yuyuetime1 + '\'' +
                ", week='" + week + '\'' +
                '}';
    }
}
