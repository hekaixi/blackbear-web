package com.blackbear.service;

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
	
	public void testMybatis(){
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
}
