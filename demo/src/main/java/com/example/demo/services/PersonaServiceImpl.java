package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PersonaBean;
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

	@Override
	public String Registra(String persona) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void RegistraPersona(PersonaBean persona) {
		per.RegistraPersona(persona);
		
	}

	@Override
	public void RegistraPersonaFoto(PersonaBean persona) {
		per.RegistraPersonaFoto(persona);
		
	}

	
}
