package com.jk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.jk.dao.TestDao;
import com.jk.model.RedisClient;
import com.jk.model.User;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;


@Service
@Transactional(readOnly=true)
public class TestServiceImpl implements  TestService{

	@Autowired
	TestDao testDao;
	
	@Autowired
	RedisClient redisClient;
	@Autowired
	private MongoTemplate mongoTemplate;
	@Override
	public List<User> queryuser() {
		return testDao.queryuser();
	}
	
	@Transactional(readOnly=false)
	public void deleteuser(String id) {
		testDao.deleteuser(id);
	}
	
	@Override
	public User queryup(String id) {
		return	 testDao.queryup(id);
	}
	
	@Transactional(readOnly=false)
	public void save(User user) {
		try {
			redisClient.set("user",JSONArray.toJSONString(user));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mongoTemplate.insert(user,"user");
		testDao.save(user);
	}
	@Transactional(readOnly=false)
	public void updateuser(User user) {
		try {
			redisClient.set("user",JSONArray.toJSONString(user));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mongoTemplate.insert(user,"user");
		testDao.updateuser(user);
	}
	
}
