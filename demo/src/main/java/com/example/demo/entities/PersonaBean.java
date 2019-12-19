package com.example.demo.entities;

import java.awt.Image;
import java.io.InputStream;

public class PersonaBean {
 
	private Integer cedula;
	private String nombre;
	private String apellido;
	private String FecNacimiento;
	private InputStream fotoSave;
	private byte[] foto;  
//	private Image foto2;
	
	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	public String getApellido() {
		return apellido; 
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getFecNacimiento() {
		return FecNacimiento;
	}
	public void setFecNacimiento(String fecNacimiento) {
		FecNacimiento = fecNacimiento;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public InputStream getFotoSave() {
		return fotoSave;
	}
	public void setFotoSave(InputStream fotoSave) {
		this.fotoSave = fotoSave;
	}
	
	
	
}
