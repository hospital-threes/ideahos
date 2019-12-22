package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecPatientMapper;
import com.wx_hospital.mapper.SecUserMapper;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecUser;
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
    private SecUserMapper secUserMapper;
    @Autowired
    private SecPatientMapper secPatientMapper;

    @Override
    public SecPatient selectHuixiapatient(Integer patientId) {

        return secPatientMapper.selectHuixiapatient(patientId);
    }

    @Override
    public int UpdateMoren(Integer patientid,Integer userId) {

        return secPatientMapper.UpdateMoren(patientid,userId);
    }

    @Override
    public List<SecPatient> selectpatient(Integer id) {

        return secPatientMapper.selectpatient(id);
    }

    @Override
    public SecUser userLogin(String phone) {

        SecUser userByPhone = secUserMapper.findUserByPhone(phone);
        if(userByPhone==null){
            int zhuce = secUserMapper.zhuce(phone);
            if(zhuce>0){
                userByPhone = secUserMapper.findUserByPhone(phone);
            }
        }

        return userByPhone;
    }

    @Override
    public SecPatient getDefaultPatient(Integer userId) {

        return secPatientMapper.getDefaultPatient(userId);
    }

    @Override
    public int addPatient(SecPatient secPatient) {

        return secPatientMapper.addPatient(secPatient);
    }

    @Override
    public int updatePatient(SecPatient secPatient) {
        return secPatientMapper.updatePatient(secPatient);
    }
}

