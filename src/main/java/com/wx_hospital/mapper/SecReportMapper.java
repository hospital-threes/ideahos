package com.wx_hospital.mapper;

import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecReportMapper {
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
    JiuzhenPersonVo Xingqing(@Param("reportId") Integer reportId);
}