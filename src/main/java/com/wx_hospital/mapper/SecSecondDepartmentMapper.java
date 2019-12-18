package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecSecondDepartment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecSecondDepartmentMapper {
    //查询科室管理
    List<SecSecondDepartment> SelectFirDep(@Param("hospitalId") Integer hospitalId);



}