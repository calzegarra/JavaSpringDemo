package com.example.demo.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.conexionSQL.OracleConexion;
import com.example.demo.entities.EmpleadoBean;

@Repository
public class EmpleadoFactoryImpl implements IEmpleadoFactory{

	private static Logger LOG = LoggerFactory.getLogger(PersonaFactoryImpl.class);
	
	@Override
	public void RegistraEmpleado(EmpleadoBean empleado) {

		Connection ora = OracleConexion.getConnection();
		PreparedStatement ps = null;
		
		try {
			
			String SQLQuery = "INSERT INTO bddemo.TBEMPLEADO "
			        + "(ID,CEDULA,PUESTO,AREA,USUARIO,CLAVE) VALUES(?,?,?,?,?,?)";
			
			ps = ora.prepareStatement(SQLQuery);
			ps.setString(1, empleado.getId());
			ps.setString(2, empleado.getCedula());
			ps.setString(3, empleado.getPuesto());
			ps.setString(4, empleado.getArea());
			ps.setString(5, empleado.getUsuario());
			ps.setString(6, empleado.getClave());
			ps.executeUpdate();
			
			LOG.info("Empleado agregado excitosamente ");		
			
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
