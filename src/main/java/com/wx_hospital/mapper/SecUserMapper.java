package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecUser;
import org.apache.ibatis.annotations.Param;

public interface SecUserMapper {

    SecUser findUserByPhone(@Param("phone") String phone);

    int zhuce(@Param("phone")String phone);
}