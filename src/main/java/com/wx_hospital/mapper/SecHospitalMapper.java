package com.wx_hospital.mapper;

import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecDoctor;
import com.wx_hospital.pojo.SecHospital;
import com.wx_hospital.pojo.SecPic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecHospitalMapper {
    //查询医院的首页信息
    List<SecHospital> SelectHos(@Param("hospitalId") String hospitalId);

    boolean addHisOrder(HisOrder hisOrder);

    boolean addSecConsultation(@Param("doctor") SecDoctor doctor, @Param("userid") int userid,@Param("phone") String phone,@Param("biaoti") String biaoti, @Param("text") String text,@Param("fix") String fix,@Param("paymentStatus") int paymentStatus,@Param("orderId") int orderIdd);

    boolean addSecPicBySecConsultation(SecPic pic);

    boolean updateConsultationState(int id);
}