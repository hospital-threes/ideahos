package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.SecUserMapper;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecUser;
import com.wx_hospital.service.PersonalCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public SecUser userLogin(String phone) {

        SecUser secUser = secUserMapper.findUserByPhone(phone);

        if(secUser==null){

            int i = secUserMapper.zhuce(phone);
            if (i>0){
                secUser = secUserMapper.findUserByPhone(phone);
            }
        }
        return secUser;
    }

    /**
     * 获取默认就诊人信息
     * @param userId
     * @return
     */
    @Override
    public SecPatient getDefaultPatient(Integer userId) {
        return null;
    }
}

