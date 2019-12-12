package com.example.demo.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.DemoApplication;

@Repository
public class PersonaFactoryImpl implements IPersonaFactory{

	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	
	@Override
	public void DemoRegistra(String nombre) {
		LOG.info("Buenos dias Sr. " + nombre);
		
	}
}
