package com.redis.example;

import redis.clients.jedis.Jedis;

public class RedisExample {

	public static void main(String[] args) {
		
		String id="1";
		
		try {
			
		      //Connecting to Redis server on localhost 
		      Jedis jedis = new Jedis("localhost"); 
		      System.out.println("Connection to server sucessfully"); 
		      //check whether server is running or not 
		      jedis.set(id, "okan");
		      System.out.println("Server is running: "+jedis.ping()); 
		      System.out.println(jedis.get("1"));
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
