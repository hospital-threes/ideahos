package com.wx_hospital.service;

import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecReport;
import com.wx_hospital.pojo.SecUser;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:44
 **/
public interface HospitalReportService {
    /**
     * 检查报告（对应用户id查询）
     * @param id
     * @return
     */
    List<SecReport> seclectReport(Integer id);
    /**
     * 检查报告详情（对应用户id查询）
     * @param reportId
     * @return
     */
    JiuzhenPersonVo Xingqing(Integer reportId);

}

