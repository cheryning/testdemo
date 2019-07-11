package com.foreseers.tj.http;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisClient {

	@Autowired
	private StringRedisTemplate redisTemplate;
	
	public boolean set(String key,String value) {
		try {
			redisTemplate.opsForValue().set(key, value);
		//	redisTemplate.opsForValue().set(key, value, 300, TimeUnit.SECONDS);
	//	redisTemplate.opsForHash().putIfAbsent(key, hashKey, value)
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}
	
	public String get(String key) {
		try {
			
			return redisTemplate.opsForValue().get(key);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			return null;
	}
	
	public boolean  hashset(String key,String hashkey,String value) {
		try{
			
			redisTemplate.opsForHash().putIfAbsent(key, hashkey, value);
			return true;
		}catch(Exception e) {
			return false;
		}
		
	}
	
	
	public Object hashget(String key,String hashkey) {
		
		return redisTemplate.opsForHash().get(key, hashkey);
	}
	
	public void deletekey(String key) {
		redisTemplate.delete(key);
	}
	
	

}
