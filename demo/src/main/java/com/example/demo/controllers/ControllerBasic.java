package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.configuration.Paginas;
import com.example.demo.entities.usuario;
import com.example.demo.model.Post;
import com.example.demo.services.IPersonaService;

@Controller
@RequestMapping("/home")
public class ControllerBasic {
	
    @Autowired   
	private IPersonaService per;
    
	@GetMapping(path = {"/post","/"})
	public String saludar(Model modelo) {
		
		List<usuario> usu = new ArrayList<usuario>();
		usu.add(new usuario(2012123l,"Juanma12","Juan Manuel Pedrozzi"));
		usu.add(new usuario(2012456l,"Julioce45","Julio Cesar Maturana"));
		usu.add(new usuario(2012789l,"Santilu87","Santiago Luis Carvajal"));
		per.DemoRegistra("si lees esto, funciona de ptm!");
		
		modelo.addAttribute("usu",usu);
		modelo.addAttribute("cafe",this.getPost());
		
	   return "index";  
	}
	
	public List<Post> getPost(){
		ArrayList<Post> cafe = new ArrayList<>();
		cafe.add(new Post(1, " Se consigue haciendo pasar durante 25-30 segundos un chorro de agua "
				+ "caliente a presión a través de una capa de 7 gramos fina y prensada de café molido. "
				+ "El resultado es un concentrado de no más de 30 ml de puro placer gustativo.", 
				"http://localhost:8080/img/c1.png",
				new Date(), "Cafe expreso"));
		cafe.add(new Post(2, "El cappuccino tiene muchos fans, tanto en Italia como en el resto del mundo. "
				+ "Su preparación corresponde aproximadamente a 150 ml de bebida, compuesta por un espresso "
				+ "(30 ml) partes iguales de leche y crema de leche. Un gran deleite para el paladar.",
				"http://localhost:8080/img/cafe.jpg", 
				new Date(), "Cappuccino"));
		cafe.add(new Post(3, "El Café moka es fácil de preparar y produce un café con cuerpo y rico en aromas,"
				+ " aunque en el mercado se pueden encontrar muchas formas y estilos diferentes. Para que salga "
				+ "perfecto, la mezcla deberá molerse no demasiado fina y ponerse a fuego lento. ", 
				"http://localhost:8080/img/moka.jpg", 
				new Date(), "Mokaccino"));
		cafe.add(new Post(4, "Se consume en todo el Oriente Medio y se prepara con café molido muy fino. La "
				+ "tradición prevé la utilización de un molinillo de latón para obtener un polvo muy fino, como"
				+ " el azúcar impalpable. Se bebe en tacitas pequeñas y bajas.                    "
                 , "http://localhost:8080/img/turko.jpg",new Date(), "Cafe Turco"));

		return cafe; 
  
	}
	
     /**Ejemplo de Model and View (Modelo y vista)**/
//	@GetMapping(path= {"/publico"})
//	public ModelAndView post() {
//	 
//		ModelAndView mav = new ModelAndView(Paginas.HOME);
//		mav.addObject("cafe",this.getPost());
//		return mav;
//	} 

	@GetMapping(path={"/detalle","/detalle/{post}"})
	public ModelAndView getPostIndividual(
			                              @RequestParam(defaultValue = "1",name = "id", required = false)
	                                      @PathVariable(required = true, name = "post") int id) {
		
		ModelAndView mav = new ModelAndView(Paginas.POST);
		List<Post> postfiltrado = this.getPost().stream().
				filter( (p)->{ 
					return p.getId() == id;
				}).collect(Collectors.toList());
		
		mav.addObject("post",postfiltrado.get(0));
		return mav;
	}
	   
	@GetMapping("/postNew")
	public ModelAndView getForm() {
		return new ModelAndView("form").addObject("post",new Post());
	}  
	  
	@PostMapping("/addNewPost")
	public String addNewPost(Post post, Model model) {
		List<Post> cafe = this.getPost();
		cafe.add(post);
		model.addAttribute("cafe", cafe);

		return "index";
	}
	
 }	

