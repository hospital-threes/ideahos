package com.wx_hospital.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPool;

/**
 * @program: member
 * @description: 整合redis的配置类
 * @author: 罗子鉴
 * @create: 2019-04-28 13:47
 **/
@PropertySource(value = "classpath:redisConfig.properties")
@SpringBootConfiguration
public class RedisConfiguration {

    @Value("${redis.host}")
    private String host;
    @Value("${redis.port}")
    private Integer port;

    @Bean
    public JedisPool jedisPool(){

        return new JedisPool(host,port);
    }

}

