package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.PersonaBean;
import com.example.demo.services.IPersonaService;

@Controller
public class ControllerForm {
	
	private PersonaBean Personas;
	
	@Autowired
	private IPersonaService per;
	
	@GetMapping("/registraPersona")
	public String MuestraForma() {
		
	Personas.setNombre("");
	Personas.setApellido("");
	//Personas.setCedula();
	Personas.setApellido("");
		
    per.RegistraPersona(Personas); 
		
		
		return "registro";
	}



	


}
