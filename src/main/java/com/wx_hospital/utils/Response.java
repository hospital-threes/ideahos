package com.wx_hospital.utils;

/**
 * @author admin
 * @title: Response
 * @projectName guoda33333
 * @description: TODO
 * @date 2019/12/1610:47
 */
public class Response {
    private int id;
    private int orderId;
    private String orderNum;
    private Boolean response;
    private Boolean rrrr;



    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", orderNum='" + orderNum + '\'' +
                ", response=" + response +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Boolean getResponse() {
        return response;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }

    public Boolean getRrrr() {
        return rrrr;
    }

    public void setRrrr(Boolean rrrr) {
        this.rrrr = rrrr;
    }
}
