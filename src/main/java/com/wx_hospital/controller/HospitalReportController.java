package com.wx_hospital.controller;

import com.wx_hospital.pojo.*;
import com.wx_hospital.service.HospitalReportService;

import com.wx_hospital.utils.poiReadExcelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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
     *
     * @param id
     * @return
     */
    @RequestMapping("/seclectReport")
    @ResponseBody
    public List<SecReport> seclectReport(Integer id) {//用户id
        List<SecReport> list = hospitalReportServiceImpl.seclectReport(id);
        return list;
    }

    /**
     * 检查报告详情（对应用户id查询）
     *
     * @param reportId
     * @return
     */
    @RequestMapping("/Xingqing")
    @ResponseBody
    public JiuzhenPersonVo Xingqing(Integer reportId) {//用户id(获取session的id)

        JiuzhenPersonVo user = hospitalReportServiceImpl.Xingqing(reportId);

        return user;
    }

    /**
     * 报表excel表返回前端显示
     *
     * @param fileAddr
     * @return
     */
    @RequestMapping("/baobiao")
    @ResponseBody
    public List<ReportBaobiao> baobiao(@RequestParam("fileAddr") String fileAddr) throws IOException {//用户id(获取session的id)
        //判断文件是否存在  如果不存在则不读取返回前端
        File file = new File("D:\\wx_hospital\\reportFile");
        List<ReportBaobiao> list = null;
        try {
            if (!file.exists()) { //文件夹不存在
                return null;
            } else {//文件夹存在

                File file2 = new File("D:\\wx_hospital\\reportFile\\" + fileAddr + ".xlsx");
                if (!file2.exists()) {
                    return null;
                } else {
                    String path = "D:\\wx_hospital\\reportFile\\" + fileAddr + ".xlsx";
                    list = poiReadExcelInfo.Res(path);//传的前端获取对应的地址（活的最后再改）
                }

            }
        } catch (Exception exc) {//捕获异常
            exc.toString();
            return null;
        }

        return list;
    }


}

