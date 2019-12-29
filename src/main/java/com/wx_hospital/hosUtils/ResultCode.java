package com.wx_hospital.hosUtils;

import java.io.Serializable;

/****************************************************
 *
 *  响应码
 *
 * @author majker
 * @date: 2019/3/10
 * @version 1.0
 **************************************************/
public enum ResultCode implements Serializable {
    /**
     * 成功
     */
    SUCCESS(200, "成功"),
    /**
     * 发生异常
     */
    EXCEPTION(500, "发生异常"),
    NO_AUTH(401, "请重新登录"),
    FORBIDDEN(403, "未认证"),
    NULL(403, "禁止"),
    NOT_BIND(1234, "请先绑定手机号"),
    NOT_FOUND(404, "未找到相应文件");

    ResultCode(int value, String msg) {
        this.val = value;
        this.msg = msg;
    }

    public int val() {
        return val;
    }

    public String msg() {
        return msg;
    }

    private int val;
    private String msg;
}