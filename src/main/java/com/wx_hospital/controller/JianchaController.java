package com.wx_hospital.controller;
import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecReport;
import com.wx_hospital.service.JianchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Administrator
 * @desc tiny sun
 * @create 2019-12-10 15:35
 **/
@Controller
public class JianchaController {
    @Autowired
    private JianchaService service;

   /*检查报告（对应用户id查询）*/
    @RequestMapping("/seclectReport")
    @ResponseBody
    public  List<SecReport> seclectReport(Integer id){//用户id
        List<SecReport> list =service.seclectReport(id);
        return list;
    }


    /**/
    /*检查报告（对应用户id查询）*/
    @RequestMapping("/JiuzenPerson")
    @ResponseBody
    public SecPatient JiuzenPerson(Integer id){//用户id(获取session的id)
        SecPatient user =service.JiuzenPerson(id);
        return user;
    }


    /*检查报告详情（对应用户id查询）*/
    @RequestMapping("/Xingqing")
    @ResponseBody
    public JiuzhenPersonVo Xingqing(Integer id, Integer reportId){//用户id(获取session的id)
        JiuzhenPersonVo user =service.Xingqing(id,reportId);
        return user;
    }
}
