package com.wx_hospital.service;

import com.wx_hospital.pojo.SecFirstDepartment;
import com.wx_hospital.pojo.SecSecondDepartment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @program: ideahos
 * @description:科室管理
 * @author: 罗子鉴
 * @create: 2019-12-13 13:05
 **/
public interface SectionIntroduceService {
    //查询科室管理
    List<SecSecondDepartment> SelectFirDep();

}

