package com.wx_hospital.utils;

import redis.clients.jedis.Tuple;

import java.util.List;
import java.util.Set;

/**
 * @program: member
 * @description: redis工具接口
 * @author: 罗子鉴
 * @create: 2019-04-28 14:57
 **/
public interface JedisClient {

    /**  保存数据
     * @param key
     * @param value
     * @return
     */
    String set(String key, String value);

    /**把value追加到key的原值上
     *  @param key
     *  @param value
     * @return
     */
    Long append(String key, String value);

    /**  获取数据
     * @param key
     * @return
     */
    String get(String key);

    /**  判断值是否存在
     * @param key
     * @return
     */
    Boolean exists(String key);

    /** 设置值的存在时间
     * @param key
     * @return
     */
    Long expire(String key, int seconds);

    /**  返回这个key的剩余时间
     * @param key
     * @return
     */
    Long ttl(String key);

    /**  使值自增1
     * @param key
     * @return
     */
    Long incr(String key);

    /**  删除
     * @param key
     * @return
     */
    Long del(String key);



    /** 链表数据保存头部
     *  @param key
     *  @param key
     *  @return
     */
    Long lpush(String key, String value);

    /** 链表数据保存尾部
     *  @param key
     *  @param key
     *  @return
     */
    Long rpush(String key, String value);

    /** 返回链表的所有数据
     *  @param key
     *  @param start
     *  @param end
     *  @return
     */
    List<String> lrange(String key, long start, long end);


    /** 返回链表的最后一个数据
     *  @param key
     *  @return
     */
    String lpop(String key);
    /** 从key链表中删除 value值 count为删除个数  Count>0 从表头删除  Count<0 从表尾删除
     *  @param key
     *  @param count
     *  @param value
     */
    Long lrem(String key, long count, String value);

    /** 返回链表的长度
     *  @param key
     */
    Long llen(String key);






    /**  集合数据保存
     * @param key
     * @param members
     * @return
     */
    Long sadd(String key, String... members);

    /**  集合数据删除
     * @param key
     * @param members
     * @return
     */
    Long srem(String key, String... members);

    /**  判断元素member是否在集合中存在
     * @param key
     * @param member
     * @return
     */
    Boolean sismember(String key, String member);

    /** 返回集合中的所有数据
     *  @param key
     */
    Set<String> smembers(String key);

    /** 返回集合的长度
     *  @param key
     */
    Long scard(String key);




    /** 添加元素
     *
     * @param key
     * @param score
     * @param member
     * @return
     */
    Long zadd(String key, double score, String member);

    /** 集合(升续)排序后,取score在[min,max]内的元素,
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    Set<String> zrangeByScore(String key, double min, double max);

    /** 把集合降序排列,取名字[start,stop]之间的元素
     *
     * @param key
     * @param max
     * @param min
     * @return
     */
    Set<String> zrevrangeByScore(String key, double max, double min);

    /**
     * 把集合降序排列,取名字[start,stop]之间的元素 还有数量
     * @param key
     * @param max
     * @param min
     * @return
     */
    Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min);


    /** 返回元素个数
     *
     * @param key
     * @return
     */
    Long zcard(String key);


    /**  哈希数据保存
     * @param key
     * @param field
     * @param value
     * @return
     */
    Long hset(String key, String field, String value);

    /**  哈希数据获取
     * @param key
     * @param field
     * @return
     */
    String hget(String key, String field);

    /**  删除哈希数据
     * @param key
     * @param field
     * @return
     */
    Long hdel(String key, String... field);

    /**  判断值是否存在
     * @param key
     * @param field
     * @return
     */
    Boolean hexists(String key, String field);

    /** 返回哈希key中所有的field
     * @param key
     * @return
     */
    Set<String> hkeys(String key);

    /** 返回哈希key中所有的value
     *
     * @param key
     * @return
     */
    List<String> hvals(String key);

}

