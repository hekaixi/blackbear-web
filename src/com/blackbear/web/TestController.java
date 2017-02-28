package com.blackbear.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blackbear.service.TestService;

/**
 * 测试控制层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("test")
public class TestController {
	@Resource
	private TestService service;
	
	@RequestMapping("test")
	public String testInitView(){
		System.out.println("开始测试...");
//		service.testMemcache();
		service.testService();
		System.out.println("测试完成...");
		return "test/test";
	}
	
	@RequestMapping("test2")
	public String testMytatis(){
		System.out.println("开始测试...");
//		service.testMemcache();
		service.testMybatis();
		System.out.println("测试完成...");
		return "test/test";
	}
	
	@RequestMapping("test3")
	public String testHibernate(){
		System.out.println("开始测试...");
		service.testHibernate();
		System.out.println("测试完成...");
		return "test/test";
	}
	
}
