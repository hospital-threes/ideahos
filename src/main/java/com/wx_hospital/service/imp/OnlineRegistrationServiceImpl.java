package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecPayWayMapper;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecPayWay;
import com.wx_hospital.pojo.SecUser;
import com.wx_hospital.service.OnlineRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: ideahos
 * @description: 预约挂号-业务层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:52
 **/
@Service
public class OnlineRegistrationServiceImpl implements OnlineRegistrationService {

    @Autowired
    private SecPayWayMapper secPayWayMapper;

    @Override
    public List<SecPayWay> selectZhifuStyle() {
        return secPayWayMapper.selectZhifuStyle();
    }

   /* @Override
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
    }*/
}

