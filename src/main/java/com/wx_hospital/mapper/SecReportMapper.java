package com.wx_hospital.mapper;

import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecReportMapper {
    List<SecReport> seclectReport(Integer id);

    JiuzhenPersonVo Xingqing(@Param("reportId") Integer reportId);
}