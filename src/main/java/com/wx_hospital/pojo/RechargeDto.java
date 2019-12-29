package com.wx_hospital.pojo;

import lombok.Data;

import java.math.BigDecimal;

/****************************************************
 *
 *  充值实体
 *
 * @version 1.0
 **************************************************/
@Data
public class RechargeDto {

    /**
     * 充值 支付类型
     * 0 微信 1 支付宝 2.公众号微信 3.微信小程序
     */
    private int payType;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 充值金额
     */
    private BigDecimal rechargeMoney;

    /**
     * 临时凭证code
     * 小程序支付调用wx.login();获取到登录临时凭证code
     */
    private String code;

    @Override
    public String toString() {
        return "RechargeDto{" +
                "payType=" + payType +
                ", userId='" + userId + '\'' +
                ", rechargeMoney=" + rechargeMoney +
                ", code='" + code + '\'' +
                '}';
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

