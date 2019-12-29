package com.wx_hospital.mapper;

import com.wx_hospital.pojo.HisOrder;
import com.wx_hospital.pojo.SecDoctor;
import com.wx_hospital.pojo.SecHospital;
import com.wx_hospital.pojo.SecPic;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface SecHospitalMapper {
    /**
     * 首页的信息
     * @param hospitalId
     * @return
     */
    List<SecHospital> SelectHos(@Param("hospitalId") String hospitalId);
    /**
     * 添加数据库  咨询表\订单表
     * @param hisOrder
     * @return
     */
    boolean addHisOrder(@Param("hisOrder") HisOrder hisOrder);

    /**
     * 添加数据库  咨询表\订单表
     * @param doctor
     * @param userid
     * @param phone
     * @param biaoti
     * @param text
     * @param fix
     * @param paymentStatus
     * @return
     */
    boolean addSecConsultation(@Param("doctor") SecDoctor doctor, @Param("userid") int userid,@Param("phone") String phone,@Param("biaoti") String biaoti, @Param("text") String text,@Param("fix") String fix,@Param("paymentStatus") int paymentStatus,@Param("orderId") int orderIdd);
    /**
     * 添加图片
     * @param pic
     * @return
     */
    boolean addSecPicBySecConsultation(@Param("pic")SecPic pic);

    boolean updateConsultationState(int id);
}