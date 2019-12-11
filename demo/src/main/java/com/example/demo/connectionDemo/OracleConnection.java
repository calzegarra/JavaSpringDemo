package com.example.demo.connectionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnection {

	public static void main(String[] args) {
		
		try {
			//Paso 1: Cargar el driver de la clase
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			//Paso 2: Crear el objeto de conexion
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe","system","P@ssword");
			
			//Paso 3: Crear el objeto dle estamento
			Statement stmt = con.createStatement();
			
			//Paso 4: Ejecutar el Query(Schema.Table)
			ResultSet rs = stmt.executeQuery("select * from HR.LOCATIONS");
			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
			
			//Cerrar el objeto de conexion
			con.close();  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
