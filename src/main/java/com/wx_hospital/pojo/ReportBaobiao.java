package com.wx_hospital.pojo;

/**
 * @author Administrator
 * @desc
 * @create 2019-12-13 11:09
 **/
/*报告表表excel*/
public class ReportBaobiao {
    private  String name;
    private  String jiehuo;
    private  String cankaozhi;

    public ReportBaobiao() {

    }


    public ReportBaobiao(String name, String jiehuo, String cankaozhi) {
        this.name = name;
        this.jiehuo = jiehuo;
        this.cankaozhi = cankaozhi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJiehuo() {
        return jiehuo;
    }

    public void setJiehuo(String jiehuo) {
        this.jiehuo = jiehuo;
    }

    public String getCankaozhi() {
        return cankaozhi;
    }

    public void setCankaozhi(String cankaozhi) {
        this.cankaozhi = cankaozhi;
    }
}
