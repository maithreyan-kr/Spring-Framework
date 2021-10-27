package com.mighty.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(appConfig.class);
		
		Iphone pro = factory.getBean(Iphone.class);
		pro.config();
	}
	
	
}
