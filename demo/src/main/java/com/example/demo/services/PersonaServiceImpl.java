package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.factory.IPersonaFactory;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaFactory per;
	
	@Override
	public void DemoRegistra(String nombre) {
	//	per = new PersonaFactoryImpl();
		per.DemoRegistra(nombre);
		
	}

	
}
