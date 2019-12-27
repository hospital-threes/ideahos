package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecFirstDepartmentMapper;
import com.wx_hospital.mapper.SecSecondDepartmentMapper;
import com.wx_hospital.pojo.SecFirstDepartment;
import com.wx_hospital.pojo.SecSecondDepartment;
import com.wx_hospital.service.SectionIntroduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 科室介绍-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 13:06
 **/
@Service
public class SectionIntroduceServiceImpl implements SectionIntroduceService {
    @Autowired
    private SecSecondDepartmentMapper secSecondDepartmentMapper;
    @Autowired
    private SecFirstDepartmentMapper secFirstDepartmentMapper;

    @Override
    public List<SecSecondDepartment> SelectFirDep() {
        return secSecondDepartmentMapper.SelectFirDep();
    }
}

