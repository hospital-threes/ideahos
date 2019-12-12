package com.wx_hospital.utils;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.InputStream;

/**
 * @program: demo
 * @description:
 * @author: 罗子鉴
 * @create: 2019-10-17 17:37
 **/
//@PropertySource(value = "classpath:ftp.properties")
//@SpringBootConfiguration
public class FtpUtils {
    //@Value("${ftp.host}")
    private static String host = "192.168.177.130";
    //@Value("${ftp.port}")
    private static int port=21;
    //@Value("${ftp.username}")
    private static String username ="ftpuser";
    //@Value("${ftp.password}")
    private static String password = "ftpuser";

    public static void uploadFile(String pathname, String remote, InputStream is) {
        //创建FTPClient对象
        FTPClient client = new FTPClient();
        try {
            //链接ftp服务
            client.connect(host, port);

            //登录ftp服务器
            client.login(username, password);

            //判断pathname是否存在,//切换ftp服务的工作目录
            if (!client.changeWorkingDirectory(pathname)) {

                client.makeDirectory(pathname); //创建工作目录

                client.changeWorkingDirectory(pathname);
            }

            client.enterLocalPassiveMode();

            //设置上传的文件类型
            client.setFileType(FTP.BINARY_FILE_TYPE);

            //完成文件上传
            client.storeFile(remote, is);

            client.logout(); //退出
            client.disconnect(); //断开链接

            System.out.println("============================");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}

