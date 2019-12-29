package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecSecondDepartment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecSecondDepartmentMapper {
    /**
     * 科室介绍页面信息
     *
     * @return
     */
    List<SecSecondDepartment> SelectFirDep(Integer hospitalId);



}