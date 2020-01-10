package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.entities.EmpleadoBean;
import com.example.demo.services.IEmpleadoService;

@Controller
public class ControllerEmp {

	private EmpleadoBean empleado;
	private String cedula;
	private String id;

	@Autowired
	private IEmpleadoService emp;

	@RequestMapping(value = "/formEmpleado", method = RequestMethod.GET)
	public String Principal(HttpServletRequest solicitud) {

		return "formEmp";
	}

	@RequestMapping(value = "/formEmpleado", method = RequestMethod.POST)
	public String registro(HttpServletRequest solicitud,
			@ModelAttribute(name = "empleadoBean") EmpleadoBean empleadoBean, Model model) throws Exception {

		empleado = new EmpleadoBean();

		id = "EMP2020" + empleadoBean.getCedula().substring(0, 3);
		cedula = empleadoBean.getCedula();

		if (cedula != null) {
			empleado.setId(id);
			empleado.setCedula(cedula);
			empleado.setPuesto(empleadoBean.getPuesto());
			empleado.setArea(empleadoBean.getArea());
			empleado.setUsuario(empleadoBean.getUsuario());
			empleado.setClave(empleadoBean.getClave());
			
			emp.RegistraEmpleado(empleado);
		}

		return "mensaje";
	}

}
