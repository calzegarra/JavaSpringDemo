package com.example.demo.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller 
public class ControllerFileUpload {
	
	private InputStream fotoSave;
	public static String uploadDirectory = System.getProperty("user.dir") + "/uploads";
	
	@RequestMapping("/ejem")
	public String UploadPage(Model model) {
		return "uploadView"; 
	}
	
	@RequestMapping("/upload")
	public String upload(Model model, @RequestParam("files") MultipartFile[] files) {
		StringBuilder fileNames = new StringBuilder();
		for (MultipartFile file: files) {
			Path fileNameAndPath = Paths.get(uploadDirectory,file.getOriginalFilename());
			
			System.out.println(fileNameAndPath.toString());
			fileNames.append(file.getOriginalFilename());
			try {
				//To load image 
//				BufferedImage originalImage = ImageIO.read(new File(fileNameAndPath.toString()));
//				System.out.println(originalImage.toString());
				
		      //ImageIO.write(originalImage, "jpg", new File("c:\\image\\mypic_new.jpg")); 
				
		      //InputStream is1 = new FileInputStream(new File("C:\\Users\\c.zegarra\\git\\JavaSpringDemo\\demo\\uploads\\db.png")); 
			    InputStream is2 = new FileInputStream(new File(fileNameAndPath.toString())); 
			    fotoSave = is2;		    
			    System.out.println(is2.toString());
			    
				Files.write(fileNameAndPath, file.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		model.addAttribute("msg","Archivos exitosamente subidos " + fileNames.toString());
		return "uploadstatusview";
	}
}
