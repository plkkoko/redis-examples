package com.lovely.redis.api;

import java.util.List;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * 使用redis API
 * 部分操作
 * api放在 resoureces文件夹api中
 * @author SimpleWu
 */
public class UseAPI {

	/**
	 * 连接失败throw JedisConnectionException
	 */
	private Jedis jedis = new Jedis("localhost", 6379);
	@Test
	public void test1() {
		System.out.println("清空当前数据库数据 :" + jedis.flushDB());

		System.out.println("新增键值对:" + jedis.set("name", "SimpleWu"));

		System.out.println("判断某个key是否存在 :" + jedis.exists("name"));

		System.out.println("删除key" + jedis.del("name"));

		System.out.println("设置key过期时间" + jedis.expire("name", 100));

		System.out.println("查询key剩余生存时间" + jedis.ttl("name"));

		System.out.println("解除key生存时间限制" + jedis.persist("name"));

		System.out.println("查询key数据类型" + jedis.type("name"));

		System.out.println("增加或覆盖数据项：" + jedis.set("hello", "hello reids"));

		System.out.println("不覆盖增加数据项(重复不插入)：" + jedis.setnx("hello", "你好啊！！！"));

		System.out.println("增加数据项并且设置有效时间:" + jedis.setex("hello", 10, "hello SimpleWu"));

		System.out.println("获取key对应的value" + jedis.get("name"));

		System.out.println("在key对应value后面扩展字符串：" + jedis.append("name", "你好吗？"));

		System.out.println("增加多个键值对:" + jedis.mset("k1", "value1", "k2", "value2"));

		@SuppressWarnings("unused")
		List<String> list = jedis.mget("k1", "k2");// 获取多个key对应的value

		System.out.println("删除多个key对应的数据项:" + jedis.del(new String[] { "k1", "k2" }));

		System.out.println("获取key对应value并且更新value" + jedis.getSet("k3", "v3"));

	}

}
