package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entities.usuario;

@Controller
@RequestMapping("/hola")
public class ControllerBasic {
      
	@GetMapping(path = {"/saludar","/holamundo"})
	public String saludar(Model modelo) {
		
		List<usuario> usu = new ArrayList<usuario>();
		usu.add(new usuario(2012123l,"Juanma12","Juan Manuel Pedrozzi"));
		usu.add(new usuario(2012456l,"Julioce45","Julio Cesar Maturana"));
		usu.add(new usuario(2012789l,"Santilu87","Santiago Luis Carvajal"));
		
		modelo.addAttribute("usu",usu);
	   return "index";
	}
	
 }	

