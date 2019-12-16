package com.wx_hospital.service.imp;

import com.wx_hospital.mapper.JianchaDao;
import com.wx_hospital.pojo.JiuzhenPersonVo;
import com.wx_hospital.pojo.SecPatient;
import com.wx_hospital.pojo.SecReport;
import com.wx_hospital.pojo.SecUser;
import com.wx_hospital.service.JianchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @desc tiny sun
 * @create 2019-12-10 15:37
 **/
@Service
public class JianchaServiceImpl implements JianchaService {
    @Autowired
    private JianchaDao dao;

    @Override
    public List<SecReport> seclectReport(Integer id) {
        return  dao.seclectReport(id);
    }

    @Override
    public SecUser JiuzenPerson(Integer id) {
        return  dao.JiuzenPerson(id);
    }

    @Override
    public JiuzhenPersonVo Xingqing(Integer id, Integer reportId) {
        return dao.Xingqing(id,reportId);
    }
}
