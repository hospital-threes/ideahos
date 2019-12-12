package com.jz.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.jz.pojo.User;
import com.jz.pojo.Weather_1;
import com.jz.pojo.Weather_2;
import com.jz.service.WeatherService;
import com.jz.utils.JSONUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.SoundbankResource;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @ClassName: WeatherController
 * @Author: JiangZe
 * @Description: 定时任务--读取天气文件
 * @Version: 1.0
 * @Date: 2019/12/4 9:17
 */
@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    //第一题
    @RequestMapping("/addWeather_1")
    @ResponseBody
    public boolean addWeather_1(Weather_1 weather1){
        System.out.println("第一题：：：");
        boolean b = weatherService.addWeather_1(weather1);
        return b;
    }




    //第二题
    @ResponseBody
    @RequestMapping("/addWeather_2")
    @Scheduled(cron = "2 */5 * * * ?")
    public boolean addWeather_2() throws IOException {
        System.out.println("第二题：：：：：");
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        String name=hour+""+minute+".txt";
        System.out.println(name);
        boolean b=false;
        File file = new File("D:\\kaoshi\\bj\\2019-12-06\\"+name);
        String encoding = "GBK";
        //读取数据
        if (file.isFile() && file.exists()) { //判断文件是否存在
            InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file), encoding);//考虑到编码格式

            BufferedReader bufferedReader = new BufferedReader(read);
            StringBuilder str=new StringBuilder();

            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                str.append(lineTxt);
            }
            //截取字符串获取当前天气
            int realtime = str.indexOf("realtime");
            int future = str.indexOf("future");
            String weather = str.substring(realtime + 11, future - 5);
            weather="[{"+weather+"}]";
            //json转化为对象
            Weather_2 weather1 = JSONUtils.json2Object(weather, Weather_2.class);
            //存到数据库
            System.out.println(weather1);
            b=weatherService.addWeather_2(weather1);
        }
        return b;
    }






    //第一题
   /* @RequestMapping("/getuser")
    public String getuser(Weather_1 weather1,HttpResponse response){
        List l = new ArrayList();
        l.add(new User(1,"zhangsan",12));
        Gson gson=new Gson();
        String json = gson.toJson(l);
        System.out.println(json);

        //
        Writer out=response.getWriter();
        out.write(json);
        out.flush();


        return "";
    }*/


    @RequestMapping("/User")
    @ResponseBody
    public List<User> getUser(){
        List<User> list =weatherService.findall();
        return list;
    }


    @RequestMapping("/User2")
    @ResponseBody
    public User findall2(){
        User list =weatherService.findall2();
        return list;
    }



}
