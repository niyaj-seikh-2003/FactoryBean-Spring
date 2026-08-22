package com.nt.sneans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle 
{
	@Qualifier("eFactory")
	@Autowired
	private IEngine engine;
	
	public void journey(String startPlace,String destPlace) {
		System.out.println("Journey started from::"+startPlace);
		engine.startEngine();
		
		System.out.println("--Journey is hoin on -- from "+startPlace+" to "+destPlace+"---");
		
		System.out.println("Journey stopped at::"+destPlace);
		engine.stopEngine();
	}

}
