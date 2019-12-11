package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerLogin {

	@ResponseBody
	@RequestMapping("/Principal")
	public ModelAndView Login() {
		
		ModelAndView modelo = new ModelAndView();
		modelo.setViewName("Principal");
		
		return modelo;
	}
	

}
