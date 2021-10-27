package com.mighty.anno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class A15 implements MobileProcessor {
	
	public void process() {
		
		System.out.println("best CPU and GPU performance");
		
	}

}
