package com.example.demo.conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConexion {

	private static Connection OracleCon = null;
	
	public static Connection getConnection() {
	
		try {
			if (OracleCon == null) {
				String Driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String pass = "P@ssword";
				Class.forName(Driver);
				OracleCon = DriverManager.getConnection(url,user,pass);
				System.out.println("Conectando a Oracle..");
				
			}
			
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return OracleCon;
	}
}
