package com.example.demo.entities;

import java.math.BigDecimal;

public class PersonaBean {
 
	private String cedula;
	private String nombre;
	private String apellido;
	private String fecNacimiento;
	private BigDecimal idImagen;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
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
		return fecNacimiento;
	}
	public void setFecNacimiento(String fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	public BigDecimal getIdImagen() {
		return idImagen;
	}
	public void setIdImagen(BigDecimal idImagen) {
		this.idImagen = idImagen;
	}

	
	
	
	
}
