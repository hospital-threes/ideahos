package com.wx_hospital.controller;

import com.wx_hospital.pojo.*;
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

    /**
     * 检查报告（对应用户id查询）
     * @param id
     * @return
     */
    @RequestMapping("/seclectReport")
    @ResponseBody
    public List<SecReport> seclectReport(Integer id){//用户id
        List<SecReport> list =hospitalReportServiceImpl.seclectReport(id);
        return list;
    }

    /**
     * 检查报告详情（对应用户id查询）
     * @param reportId
     * @return
     */
    @RequestMapping("/Xingqing")
    @ResponseBody
    public JiuzhenPersonVo Xingqing(Integer reportId){//用户id(获取session的id)

        JiuzhenPersonVo user =hospitalReportServiceImpl.Xingqing(reportId);

        return user;
    }

    /**
     * 报表excel表返回前端显示
     * @param fileAddr
     * @return
     */
    @RequestMapping("/baobiao")
    @ResponseBody
    public  List<ReportBaobiao>  baobiao(@RequestParam("fileAddr") String fileAddr) {//用户id(获取session的id)
        String filepath="D:\\wx_hospital\\reporFile\\";
        //判断文件夹是否存在  不存在则创建


        //判断文件是否存在  如果不存在则不读取返回前端


        String fileAddrpath="D:\\wx_hospital\\reporFile\\"+fileAddr+".xlsx";
        List<ReportBaobiao> list = poiReadExcelInfo.Res(fileAddrpath);//传的前端获取对应的地址（活的最后再改）
        return  list;
    }

}

