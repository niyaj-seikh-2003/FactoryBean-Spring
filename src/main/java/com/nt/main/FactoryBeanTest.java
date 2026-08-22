package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sneans.Vehicle;

public class FactoryBeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Vehicle v=ctx.getBean("vehicle",Vehicle.class);
		v.journey("Odisha","Hyderabad");
		ctx.close();
	}

}
