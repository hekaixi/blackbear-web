package com.blackbear.aop;

public class Logger {
	public void beforeRun(){
        System.out.println("AOP running before function");
    }

    public void afterRun(){
        System.out.println("AOP running after function");
    }
}
