package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecFirstDepartment;
import com.wx_hospital.pojo.SecSecondDepartment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ideahos
 * @description: 预约挂号控制层
 * @author: 罗子鉴
 * @create: 2019-12-12 15:24
 **/
@Controller
public class SecRegistrationController {


    /**
     * 查询一级科室信息
     *
     * @param hospitalId
     * @return
     */
    @ResponseBody
    @RequestMapping("findFirstDepartmentByHospitalId")
    public List<SecFirstDepartment> findFirstDepartmentByHospitalId(Integer hospitalId) {


        return null;
    }

    /**
     * 查询二级科室信息
     *
     * @param firstDepartmentId
     * @return
     */
    @ResponseBody
    @RequestMapping("findSecondDepartmentByFirstDepartmentId")
    public List<SecSecondDepartment> findSecondDepartmentByFirstDepartmentId(Integer firstDepartmentId) {
        return null;
    }

}

