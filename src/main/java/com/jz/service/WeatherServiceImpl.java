package com.jz.service;

import com.jz.mapper.WeatherMapper;
import com.jz.pojo.User;
import com.jz.pojo.Weather_1;
import com.jz.pojo.Weather_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: WeatherServiceImpl
 * @Author: JiangZe
 * @Description: 定时任务--读取天气文件
 * @Version: 1.0
 * @Date: 2019/12/4 9:15
 */
@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    private WeatherMapper weatherMapper;

    //第一题
    @Override
    public boolean addWeather_1(Weather_1 weather1) {
        boolean b = weatherMapper.addWeather_1(weather1);
        return b;
    }
    //第二题
    @Override
    public boolean addWeather_2(Weather_2 weather2) {
        boolean b = weatherMapper.addWeather_2(weather2);
        return b;
    }

    @Override
    public List<User> findall() {
        return weatherMapper.findall();
    }

    @Override
    public User findall2() {
        return  weatherMapper.findall2();
    }


}
