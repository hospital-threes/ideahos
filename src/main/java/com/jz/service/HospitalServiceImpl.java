package com.jz.service;

import com.jz.mapper.HospitalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @desc tiny sun
 * @create 2019-12-10 15:37
 **/
@Service
public class HospitalServiceImpl implements  HospitalService {
    @Autowired
    private HospitalDao dao;


}
