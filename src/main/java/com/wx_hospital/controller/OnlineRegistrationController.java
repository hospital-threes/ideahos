package com.wx_hospital.controller;

import com.wx_hospital.pojo.*;
import com.wx_hospital.service.DoctorService;
import com.wx_hospital.service.OnlineRegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("doctor")
public class OnlineRegistrationController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    private OnlineRegistrationService onlineRegistrationServiceImpl;


    /*查询支付方式*/
    @RequestMapping("/selectZhifuStyle")
    @ResponseBody
    public List<SecPayWay> selectZhifuStyle(){//用户id
        List<SecPayWay> list =onlineRegistrationServiceImpl.selectZhifuStyle();
        return list;
    }

    //查询医生信息
    @RequestMapping("appointment")
    public List<SecDoctor> appointment(String deptId){
        List<SecDoctor> list=doctorService.findDoctor(deptId);
        System.out.println(list);
        return list;
    }

    //获取医生就诊地址
    @RequestMapping("huoquaddress")
    public SecDoctor huoquaddress(String id){
        return doctorService.huoquaddress(id);
    }

    //查询预约状态
    @RequestMapping("huoquappointment")
    public String huoquappointment(String appointmenttime){
        SecDoctorAppointmenttime sd=doctorService.huoquappointment(appointmenttime);
        String statu="";
        if(sd.getAppointmentStatus().equals("开放预约")){
            statu="开放预约";
        } else if(sd.getAppointmentStatus().equals("停诊")){
            statu="停诊";
        }else {
            statu="即将开放";
        }
        System.out.println(statu);
        return statu;
    }

    //获取预约状态 时间
    @RequestMapping("huoqutime")
    public List<SecDoctorAppointmenttime> huoqutime(Integer id,HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        System.out.println(id);
        List<SecDoctorAppointmenttime> list=doctorService.huoqutime(id);
        for(SecDoctorAppointmenttime l:list){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String s = formatter.format(l.getAppointmentTime());
            String week= OnlineRegistrationController.dateToWeek(s);
            l.setWeek(week);
            l.setAppointmentTimes(s);

        }
        return list;

    }

    //获取周几
    public static String dateToWeek(String datetime) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance(); // 获得一个日历
        Date datet = null;
        try {
            datet = f.parse(datetime);
            cal.setTime(datet);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
    //获取同科室医生
    @RequestMapping("huoquadministrative")
    public List<SecDoctor> huoquadministrative(String deptname){
        List<SecDoctor> list=doctorService.huoquadministrative(deptname);
        return list;
    }

    //获取预约时间
    @RequestMapping("huoquappointmenttime")
    public List<SecDoctorAppointmenttimeTimeframe> huoquappointmenttime(Integer id){
        if(id==null){
            id=1;
        }
        List<SecDoctorAppointmenttimeTimeframe> list=doctorService.huoquappointmenttime(id);
        System.out.println(list);

        return list;
    }

    //查询预约状态
    @RequestMapping(value = "huoqustutas" )
    public String huoqustutas(Integer id, HttpServletResponse response){
        response.setContentType("text/html;charset=utf-8");
        if(id==null){
            id=1;
        }
        String status="";
        //可预约人数
        Integer sum1=doctorService.sum1(id);
        //已预约人数
        Integer sum2=doctorService.sum2(id);
        System.out.println(sum1+"loooooooo"+sum2);
        if(sum1==sum2){
            status="停诊";

            System.out.println(status);
            return status;
        }else {
            status="预约";
            return status;
        }
    }

    //获取预约时间
    @RequestMapping("findtime")
    public Time findtime(Integer id, Integer apptimeId, Integer doctorId){
        String time1=doctorService.findTime(id);
        String time2=doctorService.findTime2(apptimeId);
        String doctorName=doctorService.findDoctorName(doctorId);
        String week=OnlineRegistrationController.dateToWeek(time2);
        Time t=new Time();
        t.setYuyuetime(time1);
        t.setYuyuetime1(time2);
        t.setWeek(week);
        t.setDoctorName(doctorName);
        System.out.println(t);
        return t;


    }


}
