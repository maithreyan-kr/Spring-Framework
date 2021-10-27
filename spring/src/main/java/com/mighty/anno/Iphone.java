package com.mighty.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Iphone {
	
	@Autowired
	@Qualifier("snapdragon")      // specify the one you want use qualifier
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	public void config() {
		System.out.println("A15 bionic, 12MP triple camera, 6Gb RAM");
		cpu.process();
	}

}
