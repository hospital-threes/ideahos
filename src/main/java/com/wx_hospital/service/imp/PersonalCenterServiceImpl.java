package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecPayWayMapper;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.service.PersonalCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 个人中心-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:57
 **/
@Service
public class PersonalCenterServiceImpl implements PersonalCenterService {
    @Autowired
    private SecPayWayMapper secPayWayMapper;


    @Override
    public List<SecPatient> selectpatient(Integer id) {
        return secPayWayMapper.selectpatient(id);
    }

    @Override
    public int UpdateMoren(Integer id) {
        return secPayWayMapper.UpdateMoren(id);
    }

    @Override
    public SecPatient selectHuixiapatient(Integer id) {
        return secPayWayMapper.selectHuixiapatient(id);
    }

    @Override
    public SecPatient selectUser(Integer id) {
        return secPayWayMapper.selectUser(id);
    }







}

