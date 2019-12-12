package com.wx_hospital.service;


import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecReport;

import java.util.List;

/**
 * @author Administrator
 * @desc
 * @create 2019-12-10 15:36
 **/

public interface JianchaService {
    List<SecReport> seclectReport(Integer id);

    SecPatient JiuzenPerson(Integer id);

    JiuzhenPersonVo Xingqing(Integer id, Integer reportId);
}
