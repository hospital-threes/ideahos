package com.wx_hospital.mapper;


import com.wx_hospital.pojo.SecFirstDepartment;

import java.util.List;

public interface SecFirstDepartmentMapper {
    /**
     * 查询一级科室-
     *
     * @return
     */
    List<SecFirstDepartment> selectFirstdepartment();
}