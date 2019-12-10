package com.jz.mapper;

import com.jz.pojo.User;
import com.jz.pojo.Weather_1;
import com.jz.pojo.Weather_2;

import java.util.List;

/**
 * @ClassName: WeatherMapper
 * @Author: JiangZe
 * @Description: 定时任务--读取天气文件$
 * @Version: 1.0
 * @Date: 2019/12/4 9:13
 */
public interface WeatherMapper {
    //第一题
    boolean addWeather_1(Weather_1 weather1);
    //第二题
    boolean addWeather_2(Weather_2 weather2);

    List<User> findall();

    User findall2();
}
