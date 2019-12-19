package com.wx_hospital.controller;

import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.service.PersonalCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: ideahos
 * @description: 个人中心-控制层
 * @author: 罗子鉴
 * @create: 2019-12-13 12:29
 **/
@Controller
@RequestMapping("personalCenter")
public class PersonalCenterController {
    @Autowired
    private PersonalCenterService personalCenterServiceImpl;

    /**
     *  查询就诊人
     +   * @param id
     * @return
     */
    @RequestMapping("/selectPatient")
    @ResponseBody
    public List<SecPatient> selectPatient(Integer id){//用户id(获取session的id)
        List<SecPatient>  list =personalCenterServiceImpl.selectpatient(id);
        return list;
    }

    /**
     * 修改默认人
     * @param id
     * @return
     */
    @RequestMapping("/UpdateMoren")
    @ResponseBody
    public int UpdateMoren(Integer id){//patientid
        int i =personalCenterServiceImpl.UpdateMoren(id);
        return i;
    }

    /**
     * 回显就诊人（就诊信息）
     * @param id
     * @return
     */
    @RequestMapping("/selectHuixiapatient")
    @ResponseBody
    public SecPatient selectHuixiapatient(Integer id){
        SecPatient i =personalCenterServiceImpl.selectHuixiapatient(id);
        if(i==null){
            SecPatient i2 =personalCenterServiceImpl.selectUser(id);
            return i2;
        }else {
            return  i;
        }
    }

}

