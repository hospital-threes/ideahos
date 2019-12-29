package com.wx_hospital.hosUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/****************************************************
 *
 **************************************************/
@Slf4j
public class AppletPayUtil {

    /**
     * 根据 临时登录凭证获取openId
     * 文档:https://developers.weixin.qq.com/miniprogram/dev/api/code2Session.html
     *
     * @param code
     * @return
     * @author majker
     */
    public static String getOpenIdByCode(String code) {

        System.out.println("获取code成功!{},"+ code);
        //登录凭证校验
        //
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + WxProgramPayConfig.APPID + "&secret=" + WxProgramPayConfig.SECRET + "&js_code=" + code + "&grant_type=authorization_code";
        //发送请求给微信后端
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        InputStream inputStream = null;
        CloseableHttpResponse httpResponse = null;
        StringBuilder result = new StringBuilder();
        String openId = null;
        try {
            httpResponse = httpClient.execute(httpGet);
            HttpEntity entity = httpResponse.getEntity();
            System.out.println("HttpEntity是：：：："+entity);
            System.out.println("entity.getContent的值是+++"+entity.getContent());
            inputStream = entity.getContent();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                //这里需要使用fastjson来提取一下内容
                System.out.println("fastjson提取的内容是++++++++"+line);
                JSONObject jsonObject = JSON.parseObject(line);
                openId = jsonObject.getString("openid");
                String sessionKey = jsonObject.getString("session_key");

                System.out.println("openId={},sessionKey={},"+ openId+","+ sessionKey);

            }
        } catch (IOException e) {
            System.out.println("获取openId失败" + e.getMessage());
        }
        return openId;

    }
}
