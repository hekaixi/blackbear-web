package com.blackbear.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.RequestHandledEvent;

public class RHandledEventHandler  implements ApplicationListener<RequestHandledEvent> {

	@Override
	public void onApplicationEvent(RequestHandledEvent event) {
		System.out.println("RequestHandledEvent Received");
	}

}
