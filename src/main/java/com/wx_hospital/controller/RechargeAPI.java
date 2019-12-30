package com.wx_hospital.controller;

import com.wx_hospital.hosUtils.AppletPayUtil;
import com.wx_hospital.hosUtils.IdGen;
import com.wx_hospital.hosUtils.Render;
import com.wx_hospital.pojo.RechargeDto;
import com.wx_hospital.service.imp.PayService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/****************************************************
 *
 *
 *
 **************************************************/

@RestController
@RequestMapping("/m/recharge")
public class RechargeAPI {

    @Autowired
    private PayService payService;

    @ApiOperation(value = "创建充值订单", notes = "创建充值订单")
    /*@PostMapping("/creat")*/
    @RequestMapping("/create")
    public Object order(@RequestBody RechargeDto rechargeDto) throws Exception {
        System.out.println("rechargeDto.getRechargeMoney()的内容是:        "+rechargeDto.getRechargeMoney());
        /**
         微信小程序支付
         */
        //获取code
        String code = rechargeDto.getCode();
        System.out.println("用户的code是：       "+code);
        //调用接口获取openId
        String openId = AppletPayUtil.getOpenIdByCode(code);
        System.out.println("用户的openId是：        "+openId);
        /*
            生成订单....，这里只创建了订单号
         */
        //订单号  uuid
        String outTradeNo= IdGen.uuid();
        System.out.println("生成的订单号是："+outTradeNo);
        return Render.ok(payService.unifiedOrder(outTradeNo,rechargeDto.getRechargeMoney(),openId));
    }
    @RequestMapping("/back")
    public void back(){

    }
}
