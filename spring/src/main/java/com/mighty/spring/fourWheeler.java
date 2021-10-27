package com.mighty.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


public class fourWheeler implements Vehicle {
	
	@Autowired
	private Tyre tyre;
	
	
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive( ) {
		//System.out.println("Car is running");
		System.out.println("car " + tyre);
	}

}
