package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.HelloMessage;


@Controller
public class HelloController {


	
	@RequestMapping(value = "/otra", method = RequestMethod.GET)
//	@ResponseBody
	public String hola(HttpServletRequest solicitud, Model modelo) {
		
		
		String nombre = solicitud.getParameter("nombre");
		
		if (nombre == null) {
			nombre = "MunDo";
		}
		
		modelo.addAttribute("message", HelloMessage.getMessage("Christopher"));
	//	modelo.addAttribute("nombre", nombre);
	//	return "<h1>"+ HelloMessage.getMessage("nombre")  +"</h1>";
		return "Hola";
	}

}
