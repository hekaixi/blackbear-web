package com.blackbear.service;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blackbear.entity.PicDomain;
import com.blackbear.entity.UserBean;
import com.blackbear.hibernate.dao.BaseDao;
import com.blackbear.myBatisMapper.UserMapper;

@Service
public class TestService {
//	@Resource MemCachedClient memCache;
	
	@Resource BaseDao dao;
	
	@Resource UserMapper userMapper;
	public void testMemcache(){
//		memCache.set("testMemcache", "success!!!");
//		System.out.println("获取："+memCache.get("testMemcache"));
//		System.out.println("执行业务层方法...");
	}
	
	public void testService(){
		System.out.println("进入业务层方法...");
	}
	
	public void testMybatisAddFun (){
		System.out.println("mybatis 添加测试...");
		UserBean user = new UserBean(23, "jiuqiyuliang");
		userMapper.save(user);
		System.out.println("mybatis 测试结束");
	}
	@Transactional
	public void testHibernate(){
		System.out.println("hibernate save...");
		PicDomain p = new PicDomain();
		p.setId(2);
		p.setUrl("33333");
//		dao.saveOrUpdate(p);
		dao.save(p);
	}

	public void testMybatisUpdateFun() {
		System.out.println("mybatis map修改测试...");
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("name", "hekx");
		map.put("age", 25);
		map.put("id", 5);
		userMapper.updateByMap(map);
		System.out.println("mybatis 测试结束");
	}
}
