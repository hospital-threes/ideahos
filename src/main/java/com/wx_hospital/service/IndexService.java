package com.wx_hospital.service;

import com.wx_hospital.mapper.SecHospitalMapper;
import com.wx_hospital.pojo.SecHospital;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:46
 **/
public interface IndexService {
    //查询医院的首页信息
    List<SecHospital> SelectHos();
}
