package com.jz.controller;

import com.jz.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Administrator
 * @desc tiny sun
 * @create 2019-12-10 15:35
 **/
@Controller
public class Hospitalcon {
    @Autowired
    private HospitalService  service;

}
