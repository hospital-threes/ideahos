package com.wx_hospital.mapper;

import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecReport;
import com.wx_hospital.pojo.SecUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @desc
 * @create 2019-12-10 15:38
 **/
@Mapper
public interface JianchaDao {

    List<SecReport> seclectReport(Integer id);

    SecUser JiuzenPerson(Integer id);

    JiuzhenPersonVo Xingqing(@Param("id") Integer id, @Param("reportId") Integer reportId);
}
