package com.jz.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName bjWeather
 * @Description TODO
 * @Author Chang
 * @Date 2019/12/4 9:47
 * @Version 1.0
 **/
public class Weather_2 {
    private Integer id;
//    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String bjTime;
    private String temperature;
    private String humidity;
    private String info;
    private String wid;
    private String direct;
    private String power;
    private String aqi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Date getTime() {
//        return time;
//    }

//    public void setTime(Date time) {
//        this.time = time;
//    }


    public String getBjTime() {
        return bjTime;
    }

    public void setBjTime(String bjTime) {
        this.bjTime = bjTime;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    @Override
    public String toString() {
        return "Weather_2{" +
                "id=" + id +
                ", time=" + bjTime +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", info='" + info + '\'' +
                ", wid='" + wid + '\'' +
                ", direct='" + direct + '\'' +
                ", power='" + power + '\'' +
                ", aqi='" + aqi + '\'' +
                '}';
    }
}
