package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecReportMapper;
import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecReport;
import com.wx_hospital.pojo.SecUser;
import com.wx_hospital.service.HospitalReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 检查报告控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:45
 **/
@Service
public class HospitalReportServiceImpl implements HospitalReportService {
    @Autowired
    private SecReportMapper secReportMapper;

    @Override
    public List<SecReport> seclectReport(Integer id) {
        return  secReportMapper.seclectReport(id);
    }

    @Override
    public JiuzhenPersonVo Xingqing(Integer reportId) {
        return secReportMapper.Xingqing(reportId);
    }

}

