package com.example.demo.conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB2Conexion {

	private static Connection DB2CONX = null;
	
	public static Connection getConnection() {
		try {
			if(DB2CONX == null) {
				String Driver = "com.ibm.as400.access.AS400JDBCDriver";
				String Url = "jdbc:as400://10.9.2.121";
				String usr = "DDSWWWCZM"; 
				String pwd = "chris@02";
				Class.forName(Driver);
				DB2CONX = DriverManager.getConnection(Url,usr,pwd); 
				System.out.println("Conectando a la DB2..");
			}
			
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return DB2CONX;
	}
}
