package com.example.demo;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.example.demo.controllers.ControllerFileUpload;
import com.example.demo.services.IPersonaService;


@SpringBootApplication
@ComponentScan({"com.example.demo","controller"})
public class DemoApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class); 
	
	@Autowired
	private IPersonaService per;
	
	public static void main(String[] args) { 
		new File(ControllerFileUpload.uploadDirectory).mkdir();
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	per = new PersonaServiceImpl();
		per.DemoRegistra("Christopher Zegarra Mendez");
	}
	
	

}
