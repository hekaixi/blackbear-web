package com.blackbear.entity;

import java.io.Serializable;  

public class UserBean implements Serializable{  
     
   /** 
    *  
    */  
   private static final long serialVersionUID = 1L;  
 
   private String name;  
   private int age;  
   private int id;
   public UserBean(int id, int age, String name) {
	    super();
		this.id = id;
		this.age = age;
		this.name = name;
   }
   public UserBean(int age, String name) {
	   super();
	   this.age = age;
	   this.name = name;
   }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}

public String getName() {  
       return name;  
   }  
 
   public void setName(String name) {  
       this.name = name;  
   }  
 
   public int getAge() {  
       return age;  
   }  
 
   public void setAge(int age) {  
       this.age = age;  
   }  
      
   public String toString() {  
        String bean = "{name:"+this.getName()+",age:"+this.getAge()+"}";  
       return bean;  
   }  
      
 
}  