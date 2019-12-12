package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.IPersonaService;
import com.example.demo.services.PersonaServiceImpl;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class); 
	
	@Autowired
	private IPersonaService per;
	
	public static void main(String[] args) { 
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	per = new PersonaServiceImpl();
		per.DemoRegistra("Christopher Zegarra Mendez");
	}
	
	

}
