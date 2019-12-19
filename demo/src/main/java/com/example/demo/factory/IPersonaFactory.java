package com.example.demo.factory;

import com.example.demo.entities.PersonaBean;

public interface IPersonaFactory {

	public void DemoRegistra(String nombre);
	
	public String Registra(String persona);
	
	public void RegistraPersona(PersonaBean persona);
	public void RegistraPersonaFoto(PersonaBean persona);
}
