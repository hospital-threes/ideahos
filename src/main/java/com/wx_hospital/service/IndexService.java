package com.wx_hospital.service;

import com.wx_hospital.pojo.SecHospital;

import java.util.List;

/**
 * @program: ideahos
 * @description:
 * @author: 罗子鉴
 * @create: 2019-12-13 12:46
 **/
public interface IndexService {

    /**
     * 首页的信息
     * @param hospitalId
     * @return
     */
    List<SecHospital> SelectHos(String hospitalId);
}
