package com.example.demo.conexionSQL;

import java.sql.Connection;
import java.sql.SQLException;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.CommandCall;

public class AS400Conexion {

	private static CommandCall AS400CONX = null;
	
	public static CommandCall getConnection() {
		try {
			if(AS400CONX == null) {
				String server = "10.9.2.121";
				String user = "DDSWWWCZM"; 
				String pwd = "chris@02";
				AS400 system = new AS400(server,user,pwd); 
				
				AS400CONX = new CommandCall(system);
				System.out.println("Conectando al as400..");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return AS400CONX;
	}
}
