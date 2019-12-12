package com.wx_hospital.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AsyncService
 * @Author: JiangZe
 * @Description: 异步定时任务
 * @Version: 1.0
 * @Date: 2019/12/3 9:00
 */
@Service
public class AsyncService {
    @Async//告诉spring这是一个异步方法
    public void helloWorld(){

        try {
            Thread.sleep(5000);//睡眠5秒
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("helloWorld");
    }
}
