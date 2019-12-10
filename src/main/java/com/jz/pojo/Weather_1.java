package com.jz.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName: Weather_1
 * @Author: JiangZe
 * @Description: 第一题pojo
 * @Version: 1.0
 * @Date: 2019/12/4 19:16
 */
public class Weather_1 {
    private Integer id;
    private String weatherDescription;
    private String temperature;
    private String humidity;
    private String windDirection;
    private String windPower;
    private String city;
//    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String dateY;
    private String wind;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

//    public Date getDateY() {
//        return dateY;
//    }

//    public void setDateY(Date dateY) {
//        this.dateY = dateY;
//    }

    public String getDateY() {
        return dateY;
    }

    public void setDateY(String dateY) {
        this.dateY = dateY;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
