package com.wx_hospital.service;

import com.wx_hospital.pojo.JiuzhenPersonVo;
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
    List<SecReport> seclectReport(Integer id);

    SecUser JiuzenPerson(Integer id);

    JiuzhenPersonVo Xingqing(Integer id, Integer reportId);

}

