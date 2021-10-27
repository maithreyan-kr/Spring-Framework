package com.mighty.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("vaganam.xml");
		
//		Vehicle bike = (Vehicle)ac.getBean("twoWheeler");
//		bike.drive();
		
		fourWheeler c = (fourWheeler)ac.getBean("fourWheeler");
		c.drive();
		
//		Tyre t = (Tyre) ac.getBean("tyre");
//		System.out.println(t);
	}

}
