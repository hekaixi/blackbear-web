package com.blackbear.listener;

import org.springframework.context.ApplicationListener;

public class TestEventHandler implements ApplicationListener<TestEvent> {

	@Override
	public void onApplicationEvent(TestEvent event) {
		System.out.println(event.toString());
	}

}
