package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecUser;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {
    /**
     * 验证手机验证码
     * @param phone
     * @return
     */
    SecUser findUserByPhone(@Param("phone") String phone);
    /**
     * 验证手机验证码
     * @param phone
     * @return
     */
    int zhuce(@Param("phone")String phone);
}