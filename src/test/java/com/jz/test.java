package com.jz;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.*;

/**
 * @ClassName: test
 * @Author: JiangZe
 * @Description:
 * @Version: 1.0
 * @Date: 2019/12/4 9:32
 */
public class test {
    @Test
    public void contextLoads() throws IOException {
        File path = new File("D:\\kaoshi\\bj\\2019-12-04\\0900.txt");//定义一个file对象，用来初始化FileReader
        readFile(path);
        FileReader reader = new FileReader(path);//定义一个fileReader对象，用来初始化BufferedReader
        BufferedReader bReader = new BufferedReader( new InputStreamReader(new FileInputStream(path),"UTF-8") );//new一个BufferedReader对象，将文件内容读取到缓存

        StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
        String s = "";
        while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
            System.out.println(s);
        }
        bReader.close();
        String str = sb.toString();
        System.out.println(str );
    }

    public static String readFile(File file){
        if(file.isDirectory()){
            System.out.println(file.getAbsolutePath());
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                readFile(files[i]);
            }
        }else{
            System.out.println(file.getName());
            return file.getName();
        }
        return "";
    }



    @Test
    public void doGetTestOne() {
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Get请求
        HttpGet httpGet = new HttpGet("http://localhost:8081/deconehttp");

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
