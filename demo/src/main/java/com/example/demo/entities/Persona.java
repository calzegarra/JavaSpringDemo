package com.example.demo.entities;

import java.io.File;

public class Persona {

	private Integer cedula;
	private String nombre;
	private String apellido;
	private String FecNacimiento;
	
	//Imagen (prueba y error)
	
	//1->Imagen
	private File imagen;
	private String imagenFileName;
	private String imagenContentType;
	private byte[] imagenBytes;
	
	//2->Codigo de barras
	private byte[] imagenBytesBarra;

	//3->Especificacion
	private File especificacion;
	private String especificacionFileName;
	private String especificacionContentType;
	private byte[] especificacionBytes;

	//4 Foto
	private File foto;
	private String fotoFileName;
	private String fotoContentType;
	private byte[] fotoBytes;
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
	public File getFoto() {
		return foto;
	}
	public void setFoto(File foto) {
		this.foto = foto;
	}
	public String getFotoFileName() {
		return fotoFileName;
	}
	public void setFotoFileName(String fotoFileName) {
		this.fotoFileName = fotoFileName;
	}
	public String getFotoContentType() {
		return fotoContentType;
	}
	public void setFotoContentType(String fotoContentType) {
		this.fotoContentType = fotoContentType;
	}
	public byte[] getFotoBytes() {
		return fotoBytes;
	}
	public void setFotoBytes(byte[] fotoBytes) {
		this.fotoBytes = fotoBytes;
	}
	

	
}
