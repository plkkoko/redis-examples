package com.lovely.redis.pong;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * 连接redis 
 * @author SimpleWu
 */
public class Pong {
	/**
	 * 连接redis并且测试是否连接成功
	 * Jedis jedis = new Jedis(host, port)
	 * host ip地址
	 * port 端口号
	 */
	@Test
	public void testPong(){
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		System.out.println("是否爆炸 ：" + jedis.ping());
	}
}
