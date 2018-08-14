package com.blackbear.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blackbear.exception.SpringException;
import com.blackbear.service.TestService;

/**
 * 测试控制层
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("test")
public class TestController {
	@Resource
	private TestService service;

	@RequestMapping("test")
	public String testInitView() {
		System.out.println("开始测试...");
		// service.testMemcache();
		service.testService();
		System.out.println("测试完成...");
		return "test/welcome";
	}

	@RequestMapping("test2")
	public String testMytatisAddFun() {
		System.out.println("开始测试...");
		// service.testMemcache();
		service.testMybatisAddFun();
		System.out.println("测试完成...");
		return "test/test";
	}

	@RequestMapping("test4")
	public String testMytatisUpdateFun() {
		System.out.println("开始测试...");
		// service.testMemcache();
		service.testMybatisUpdateFun();
		System.out.println("测试完成...");
		return "test/test";
	}

	@RequestMapping("test3")
	public String testHibernate() {
		System.out.println("开始测试...");
		service.testHibernate();
		System.out.println("测试完成...");
		return "test/test";
	}

	@RequestMapping(value = "finalPage", method = RequestMethod.GET)
	public String finalPage() {
		return "service/redirect";
	}

	@RequestMapping(value = "redirect", method = RequestMethod.GET)
	@ExceptionHandler({SpringException.class})
	public String testRedirect(int age) {
		System.out.println("### age:"+age);
		 if( age < 10 ){
	         throw new SpringException("Given age is too low");
	      }else if( age > 80 ) {
	    	  throw new SpringException("Given age is too tall");
	      }
		return "redirect:finalPage";
	}

}
