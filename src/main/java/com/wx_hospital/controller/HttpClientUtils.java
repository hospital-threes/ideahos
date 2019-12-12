package com.jz.controller;

import okhttp3.*;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * @author Administrator
 * @desc
 * @create 2019-12-06 15:52
 **/
/*@Slf4j*/
public class HttpClientUtils {


    public static final MediaType JSON = MediaType.parse("application/json;charset=utf-8");

    /**
     * get请求获取请求数据
     * @param url
     * @return
     */
    public static String httpGet(String url){
        String getData ;
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            getData = response.body().string();

        }catch (Exception e){
         /*   log.info("【发送 GET 请求出现异常】！" + e.getMessage());*/
            return "-1";
        }
        return getData;

    }


    /**
     * post请求获取请求数据
     * @param url
     * @param json
     * json数据的生成方式（可选）；
     * @return
     */
    public static String httpPost(String url, String json){
        String postData ;
        OkHttpClient httpClient = new OkHttpClient();
        RequestBody requestBody = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).post(requestBody).build();
        try {
            Response response = httpClient.newCall(request).execute();
            postData = response.body().string();
        }catch (Exception e){
          /*  log.info("【
           POST 请求出现异常】！" + e.getMessage());*/
            return "-1";
        }
        return postData;
    }


   @RequestMapping("/deconehttp")
    public  String  httpConet(){
        return  "12345";
    }




    public static void main(String[] args) {
       String loadJSON = httpGet("http://v.juhe.cn/weather/index?cityname=%E5%8C%97%E4%BA%AC&dtype=json&format=2&key=08bdb39ca01c375f3c76d12ed22b57e6");
       System.out.println(loadJSON);
        /*doHttpGet();*/

        //post方式请求自己测试即可
    }





    public static String doHttpGet() {
             // 需要访问的接口路径
             String url = "http://v.juhe.cn/weather/index?cityname=%E5%8C%97%E4%BA%AC&dtype=json&format=2&key=08bdb39ca01c375f3c76d12ed22b57e6";
            // 配置请求信息（请求时间）
            RequestConfig rc = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();
             // 获取使用DefaultHttpClient对象
             CloseableHttpClient httpclient = HttpClients.createDefault();
             // 返回结果
            String result = null;
             try {
             if (url!= null) {
             // 创建HttpGet对象，将URL通过构造方法传入HttpGet对象
             HttpGet httpget = new HttpGet(url);
            // 将配置好请求信息附加到http请求中
             httpget.setConfig(rc);
            // 执行DefaultHttpClient对象的execute方法发送GET请求，通过CloseableHttpResponse接口的实例，可以获取服务器返回的信息
            CloseableHttpResponse response = httpclient.execute(httpget);
             try {
            // 得到返回对象
             HttpEntity  entity = response.getEntity();
             if (entity != null) {
            // 获取返回结果
               /* result = EntityUtils.toString(entity);*/
                 result=EntityUtils.toString(entity,"utf-8");

             }
            } finally {
             // 关闭到客户端的连接
             response.close();
             }
             }
             } catch (ClientProtocolException e) {
             e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
            } finally {
             try {
             // 关闭http请求
             httpclient.close();
            } catch (IOException e) {
             e.printStackTrace();
            }
            }
             return result;
 }























}
