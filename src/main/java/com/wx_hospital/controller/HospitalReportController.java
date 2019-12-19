package com.wx_hospital.controller;

import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.ReportBaobiao;
import com.wx_hospital.pojo.SecReport;
import com.wx_hospital.pojo.SecUser;
import com.wx_hospital.service.HospitalReportService;
import com.wx_hospital.utils.poiReadExcelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ideahos
 * @description: 检查报告-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 11:56
 **/
@Controller
@RequestMapping("hospitalReport")
public class HospitalReportController {

    @Autowired
    private HospitalReportService hospitalReportServiceImpl;

    /*检查报告（对应用户id查询）*/
    @RequestMapping("/seclectReport")
    @ResponseBody
    public List<SecReport> seclectReport(Integer id){//用户id
        List<SecReport> list =hospitalReportServiceImpl.seclectReport(id);
        return list;
    }


    /**/
    /*检查报告（对应用户id查询）*/
    @RequestMapping("/JiuzenPerson")
    @ResponseBody
    public SecUser JiuzenPerson(Integer id){//用户id(获取session的id)
        SecUser user =hospitalReportServiceImpl.JiuzenPerson(id);
        return user;
    }


    /*检查报告详情（对应用户id查询）*/
    @RequestMapping("/Xingqing")
    @ResponseBody
    public JiuzhenPersonVo Xingqing(Integer id, Integer reportId, String fileAddr){//用户id(获取session的id)
        System.out.println(fileAddr+"______________________________________");
        JiuzhenPersonVo user =hospitalReportServiceImpl.Xingqing(id,reportId);
        return user;
    }

    //*报表excel表返回前端显示*//*
    @RequestMapping("/baobiao")
    @ResponseBody
    public  List<ReportBaobiao>  baobiao(@RequestParam("fileAddr") String fileAddr) {//用户id(获取session的id)
        String fileAddrpath="D:\\"+fileAddr+".xlsx";
        List<ReportBaobiao> list = poiReadExcelInfo.Res(fileAddrpath);//传的前端获取对应的地址（活的最后再改）
        return  list;
    }

}

