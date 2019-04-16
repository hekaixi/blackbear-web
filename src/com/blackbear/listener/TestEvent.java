package com.blackbear.listener;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent{

	private static final long serialVersionUID = 9134048349633233522L;

	public TestEvent(Object source) {
		super(source);
	}
	
	public String toString(){
		return "My Test Event";
	}
}
