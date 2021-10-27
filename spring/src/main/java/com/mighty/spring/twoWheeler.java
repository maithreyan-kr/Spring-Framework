package com.mighty.spring;

import org.springframework.stereotype.Component;

@Component

public class twoWheeler implements Vehicle {
	
	public void drive() {
		
		System.out.println("Bike is running");
	}

}
