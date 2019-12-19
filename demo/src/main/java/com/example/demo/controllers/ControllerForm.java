package com.example.demo.controllers;

import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entities.PersonaBean;
import com.example.demo.genericos.UIMantenimientoController;
import com.example.demo.services.IPersonaService;

//REVISAR

@Controller
public class ControllerForm implements UIMantenimientoController {
 
	private PersonaBean Personas;
	private String nombre, apellido, fecNacimiento;
	private Integer cedula;
	//private byte[] foto;
	private InputStream fotoSave; 

	@Autowired
	private IPersonaService per;

	@RequestMapping(value = "/registraPersona", method = RequestMethod.GET)
	public String MuestraForma(HttpServletRequest solicitud) {

		return "registro";
	}
 
	/*
	@RequestMapping(value = "/registraPersona", method = RequestMethod.POST)
	public String registro(HttpServletRequest solicitud, @ModelAttribute(name = "personaBean") PersonaBean personaBean,
			Model model) throws Exception {

		Personas = new PersonaBean();

		nombre = personaBean.getNombre();
		apellido = personaBean.getApellido();
		cedula = personaBean.getCedula();
		fecNacimiento = personaBean.getFecNacimiento();
	 //	fotoSave = personaBean.getFotoSave();		

		
		if (cedula != null) {
			Personas.setNombre(nombre);
			Personas.setApellido(apellido);
			Personas.setCedula(cedula);
			Personas.setFecNacimiento(fecNacimiento);
			per.RegistraPersona(Personas);
			System.out.println("Se pudo ejecutar agregar exitosamente al men");
		}
	
		
		return "mensaje";
	}*/


	@RequestMapping(value = "/registraPersona", method = RequestMethod.POST)
	public String LeeImagen(HttpServletRequest solicitud, Model model) throws Exception {
	 
	 	String nombre = solicitud.getParameter("nombre");
		
	 	
		return null;
	}
	
	@Override
	public String iniciarControladora() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buscar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String nuevo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ver() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inactivar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ejecutar(String accion) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String guardar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String salir() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String prepararDatosMantenimiento() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String prepararDatosListado() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inicializarFiltrosListado() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String inicializarDatosMantenimiento() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
