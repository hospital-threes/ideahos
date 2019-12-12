package com.wx_hospital.utils;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Tuple;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * @program: member
 * @description: redis接口工具类
 * @author: 罗子鉴
 * @create: 2019-04-28 14:56
 **/

@Component
public class JedisClientPool implements JedisClient {

    @Resource
    private JedisPool jedisPool;

    /**  保存数据
     * @param key
     * @param value
     * @return
     */
    @Override
    public String set(String key, String value) {

        Jedis jedis = jedisPool.getResource();

        String result = jedis.set(key, value);

        jedis.close();

        return result;
    }
    /**把value追加到key的原值上
     *  @param key
     *  @param value
     * @return
     */
    @Override
    public Long append(String key, String value) {

        Jedis jedis = jedisPool.getResource();

        Long result = jedis.append(key, value);

        jedis.close();
        return result;
    }
    /**  获取数据
     * @param key
     * @return
     */
    @Override
    public String get(String key) {
        Jedis jedis = jedisPool.getResource();

        String result = jedis.get(key);

        jedis.close();
        return result;
    }
    /**  判断值是否存在
     * @param key
     * @return
     */
    @Override
    public Boolean exists(String key) {
        Jedis jedis = jedisPool.getResource();

        Boolean result = jedis.exists(key);

        jedis.close();
        return result;
    }
    /** 设置值的存在时间
     * @param key
     * @return
     */
    @Override
    public Long expire(String key, int seconds) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.expire(key, seconds);

        jedis.close();
        return result;
    }
    /**  返回这个key的剩余时间
     * @param key
     * @return
     */
    @Override
    public Long ttl(String key) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.ttl(key);

        jedis.close();
        return result;
    }
    /**  使值自增1
     * @param key
     * @return
     */
    @Override
    public Long incr(String key) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.incr(key);

        jedis.close();
        return result;
    }
    /**  删除
     * @param key
     * @return
     */
    @Override
    public Long del(String key) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.del(key);

        jedis.close();
        return result;
    }
    /** 链表数据保存头部
     *  @param key
     *  @param key
     *  @return
     */
    @Override
    public Long lpush(String key, String value) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.lpush(key, value);

        jedis.close();
        return result;
    }
    /** 链表数据保存尾部
     *  @param key
     *  @param key
     *  @return
     */
    @Override
    public Long rpush(String key, String value) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.rpush(key, value);

        jedis.close();
        return result;
    }
    /** 返回链表的所有数据
     *  @param key
     *  @param start
     *  @param end
     *  @return
     */
    @Override
    public List<String> lrange(String key, long start, long end) {
        Jedis jedis = jedisPool.getResource();

        List<String> result = jedis.lrange(key, start,end);

        jedis.close();
        return result;
    }

    @Override
    public String lpop(String key) {
        Jedis jedis = jedisPool.getResource();

        String lpop = jedis.lpop(key);

        jedis.close();

        return lpop;
    }

    /** 从key链表中删除 value值 count为删除个数  Count>0 从表头删除  Count<0 从表尾删除
     *  @param key
     *  @param count
     *  @param value
     */
    @Override
    public Long lrem(String key, long count, String value) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.lrem(key, count,value);

        jedis.close();
        return result;
    }
    /** 返回链表的长度
     *  @param key
     */
    @Override
    public Long llen(String key) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.llen(key);

        jedis.close();
        return result;
    }
    /**  集合数据保存
     * @param key
     * @param members
     * @return
     */
    @Override
    public Long sadd(String key, String... members) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.sadd(key, members);

        jedis.close();
        return result;
    }
    /**  集合数据删除
     * @param key
     * @param members
     * @return
     */
    @Override
    public Long srem(String key, String... members) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.srem(key, members);

        jedis.close();
        return result;
    }
    /**  判断元素member是否在集合中存在
     * @param key
     * @param member
     * @return
     */
    @Override
    public Boolean sismember(String key, String member) {
        Jedis jedis = jedisPool.getResource();

        Boolean result = jedis.sismember(key, member);

        jedis.close();
        return result;
    }
    /** 返回集合中的所有数据
     *  @param key
     */
    @Override
    public Set<String> smembers(String key) {
        Jedis jedis = jedisPool.getResource();

        Set<String> result = jedis.smembers(key);

        jedis.close();
        return result;
    }
    /** 返回集合的长度
     *  @param key
     */
    @Override
    public Long scard(String key) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.scard(key);

        jedis.close();
        return result;
    }
    /** 添加元素
     *
     * @param key
     * @param score
     * @param member
     * @return
     */
    @Override
    public Long zadd(String key, double score, String member) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.zadd(key, score,member);

        jedis.close();
        return result;
    }
    /** 集合(升续)排序后,取score在[min,max]内的元素,
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    @Override
    public Set<String> zrangeByScore(String key, double min, double max) {
        Jedis jedis = jedisPool.getResource();

        Set<String> result = jedis.zrangeByScore(key, min,max);

        jedis.close();
        return result;
    }
    /** 把集合降序排列,取名字[start,stop]之间的元素
     *
     * @param key
     * @param max
     * @param min
     * @return
     */
    @Override
    public Set<String> zrevrangeByScore(String key, double max, double min) {
        Jedis jedis = jedisPool.getResource();

        Set<String> result = jedis.zrevrangeByScore(key, max,min);

        jedis.close();
        return result;
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min) {
        Jedis jedis = jedisPool.getResource();

        Set<Tuple> result = jedis.zrevrangeByScoreWithScores(key, max,min);

        jedis.close();

        return result;
    }



    /** 返回元素个数
     *
     * @param key
     * @return
     */
    @Override
    public Long zcard(String key) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.zcard(key);

        jedis.close();
        return result;
    }
    /**  哈希数据保存
     * @param key
     * @param field
     * @param value
     * @return
     */
    @Override
    public Long hset(String key, String field, String value) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.hset(key, field,value);

        jedis.close();
        return result;
    }

    /**  哈希数据获取
     * @param key
     * @param field
     * @return
     */
    @Override
    public String hget(String key, String field) {
        Jedis jedis = jedisPool.getResource();

        String result = jedis.hget(key, field);

        jedis.close();
        return result;
    }
    /**  删除哈希数据
     * @param key
     * @param field
     * @return
     */
    @Override
    public Long hdel(String key, String... field) {
        Jedis jedis = jedisPool.getResource();

        Long result = jedis.hdel(key, field);

        jedis.close();
        return result;
    }
    /**  判断值是否存在
     * @param key
     * @param field
     * @return
     */
    @Override
    public Boolean hexists(String key, String field) {
        Jedis jedis = jedisPool.getResource();

        Boolean result = jedis.hexists(key, field);

        jedis.close();
        return result;
    }
    /** 返回哈希key中所有的field
     * @param key
     * @return
     */
    @Override
    public Set<String> hkeys(String key) {
        Jedis jedis = jedisPool.getResource();

        Set<String> result = jedis.hkeys(key);

        jedis.close();
        return result;
    }
    /** 返回哈希key中所有的value
     *
     * @param key
     * @return
     */
    @Override
    public List<String> hvals(String key) {
        Jedis jedis = jedisPool.getResource();

        List<String> result = jedis.hvals(key);

        jedis.close();
        return result;
    }

}

