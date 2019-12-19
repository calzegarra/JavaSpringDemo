package com.example.demo.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.example.demo.conexionSQL.OracleConexion;
import com.example.demo.entities.PersonaBean;

@Repository
public class PersonaFactoryImpl implements IPersonaFactory {

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

			String qry = "INSERT INTO bddemo.tbpersona VALUES ('" + persona.getNombre() + "', " + "'"
					+ persona.getApellido() + "', " + persona.getCedula() + "," + "'" + persona.getFecNacimiento()
					+ "',?)";

			LOG.info(qry);
			stm.executeUpdate(qry);

			ora.close();
			LOG.info("Registro exitoso");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void RegistraPersonaFoto(PersonaBean persona) {

		Connection ora = OracleConexion.getConnection();
		String SQLQuery = "INSERT INTO bddemo.tbpersona "
				        + "(NOMBRE,APELLIDO,CEDULA,FECHANACIMIENTO,IMAGEN) VALUES(?,?,?,?,?)";
		PreparedStatement ps = null;

		try {
			ps = ora.prepareStatement(SQLQuery);
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setInt(3, persona.getCedula());
			ps.setString(4, persona.getFecNacimiento());
			ps.setBlob(5, persona.getFotoSave());
			ps.executeUpdate();
			
		} catch (SQLException sql) {
			sql.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
