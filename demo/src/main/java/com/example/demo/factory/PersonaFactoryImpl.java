package com.example.demo.factory;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.example.demo.conexionSQL.OracleConexion;
import com.example.demo.entities.PersonaBean;

@Repository
public class PersonaFactoryImpl implements IPersonaFactory{

	private static Logger LOG = LoggerFactory.getLogger(PersonaFactoryImpl.class);
	
	@Override
	public void DemoRegistra(String nombre) {
		LOG.info("Buenos dias Sr. " + nombre);
		
	}

	@Override
	public String Registra(String persona) {
		
		List listado = new ArrayList<>();
		listado.add(persona); 
		return null;
	}

	@Override
	public void RegistraPersona(PersonaBean persona) {
		
		try {
			
			Connection ora = OracleConexion.getConnection();
			Statement stm = ora.createStatement();
		
			String qry = "INSERT INTO bddemo.tbpersona " + 
					"VALUES ('" + persona.getNombre() +"', "
					+ "'" + persona.getApellido() +"', "
					+ persona.getCedula() + ","
					+ "'"+ persona.getFecNacimiento() +"')";
					
			LOG.info(qry);
			stm.executeUpdate(qry);
			
			ora.close();
			LOG.info("Registro exitoso");
			
		} catch (Exception e) {
		     e.printStackTrace();
		}
	}
}
