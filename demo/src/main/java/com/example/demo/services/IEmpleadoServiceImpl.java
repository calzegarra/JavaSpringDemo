package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.EmpleadoBean;
import com.example.demo.factory.IEmpleadoFactory;

@Service
public class IEmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	private IEmpleadoFactory emp;
	
	@Override
	public void RegistraEmpleado(EmpleadoBean empleado) {
		emp.RegistraEmpleado(empleado);
		
	}

}
