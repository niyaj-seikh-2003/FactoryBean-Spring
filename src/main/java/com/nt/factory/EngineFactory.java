package com.nt.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.sneans.DieselEngine;
import com.nt.sneans.ElectricEngine;
import com.nt.sneans.IEngine;
import com.nt.sneans.PetrolEngine;

@Component("eFactory")
public class EngineFactory implements FactoryBean<IEngine> 
{
	@Value("${engg.type}")
	private String type;

	@Override
	public IEngine getObject() throws Exception {
		System.out.println("EngineFactory.getObject()");
		switch(type) {
		case "petrol" :
			return new PetrolEngine();
		case "diesle" :
			return new DieselEngine();
		case "electric" :
			return new ElectricEngine();
		default :
			throw new IllegalArgumentException("Invalid Engine type");
		}
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("EngineFactory.getObjectType()");
		return IEngine.class;
	}
	
	public boolean isSingleton() {
		System.out.println("EngineFactory.isSingleton()");
		return true;
	}

}
