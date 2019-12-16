package com.wx_hospital.mapper;

import com.wx_hospital.pojo.SecHospital;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecHospitalMapper {
    //查询医院的首页信息
    List<SecHospital> SelectHos(@Param("hospitalId") String hospitalId);

}