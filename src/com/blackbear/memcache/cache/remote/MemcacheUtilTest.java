package com.blackbear.memcache.cache.remote;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

public class MemcacheUtilTest {
     
   public static void main(String[] args) {
	   
	   ApplicationContext ctx = new FileSystemXmlApplicationContext(new String[]{"resources/applicationContext.xml","resources/applicationContext_memcache.xml"});
	   
//	   SockIOPool s =SpringContextHolder.getBean("memcachedPool"); 
//	   System.out.println("s="+s.getInitConn());
	   
	   MemCachedClient mc = (MemCachedClient) ctx.getBean("memCachedClient");
	   
	   mc.set("xjf", "tyr");
	   //开始设值
//	   mc.set("name", "string");
//	   mc.set("int", 5);
//	   mc.set("double", 5.5);
//	   mc.set("student", "student01");
//	   String stu = (String)mc.get("student");
//	   System.out.println("获取存入的Key:"+stu);
//	   UserBean UserBean = new UserBean();
//	   UserBean.setAge(21);
//	   UserBean.setName("名字");
//	   
//	   mc.set("UserBean", UserBean);
//	   
//	   
//	   List<UserBean> data = new ArrayList<UserBean>();
//	   for(int i=0;i<3;i++)
//	   {
//		   UserBean xUserBean = new UserBean();
//		   xUserBean.setAge(i);
//		   xUserBean.setName("test_"+i);
//		   data.add(xUserBean) ;
//	   }
//	   mc.set("data", data);
//	   
//	  try{
//	   Thread.sleep(50);
//	   
////	   //开始取值
//	   String name =(String) mc.get("name");
//	   int i = (Integer) mc.get("int");
//	   double d = (Double) mc.get("double") ;
//	   UserBean b = (UserBean) mc.get("UserBean") ;
//	   data =  (List<UserBean>) mc.get("data") ;
//	   
//	   System.out.println("字符串："+name);
//	   System.out.println("数字型："+i);
//	   System.out.println("双精度："+d);
//	   System.out.println("UserBean  toString ："+b.toString());
//	   
//	   System.out.println("data  toString ："+data.toString());
//	   
	   //开始删除值
//	   System.out.println("开始删除 ：》》》》》》》》》");
//	   mc.delete("name");
//	   mc.delete("int");
//	   mc.delete("double");
//	   mc.delete("UserBean");
	    
//	   String name_d =(String) mc.get("name");
//	   int i_d = (Integer) mc.get("int");
//	   double d_d = (Double) mc.get("double") ;
//	   UserBean b_d = (UserBean) mc.get("UserBean") ;
//	   
//	   System.out.println("字符串："+name_d);
//	   System.out.println("数字型："+i_d);
//	   System.out.println("双精度："+d_d);
//	   System.out.println("UserBean  toString ："+b_d.toString());
//	  }catch(Exception e){
//	   e.printStackTrace();
//	  }
	 }
}