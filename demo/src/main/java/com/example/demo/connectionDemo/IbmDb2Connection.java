package com.example.demo.connectionDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * NOMBRE     : IbmDb2Connection
 * FECHA      : 6 de Diciembre del 2019    
 * DESCRIPCION: Programa de JAVA que se encarga de Interactuar con la base de datos 
 *              DB2 del AS400  
 * */
public class IbmDb2Connection {

	public static void main(String[] args) {
		try {
			System.out.println("Intentando Conectarse...");
			String Driver = "com.ibm.as400.access.AS400JDBCDriver";
			String Url = "jdbc:as400://10.9.2.121";
			Class.forName(Driver);
			Connection conn = DriverManager.getConnection(Url,"DDSWWWCZM","chris@02");
			
			System.out.println("Aqui todo bien");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT EMPNO,FIRSTNME,LASTNAME,JOB FROM VISION2.EMPLOYEE");
			
			System.out.println("Al parecer todo sale de PTM");
			
		    System.out.println("|*************************************************|" );
			System.out.println("Se convocan a los siguientes empleados: " );
	        while (rs.next()) {
	        	 String empNo = rs.getString(1);       	
	        	 String nombre = rs.getString(2).trim();
	        	 String apellido = rs.getString(3).trim();
	        	 String puesto = rs.getString(4);
	        	 
			     System.out.println("Empleado = " + nombre + " " + apellido );
			     System.out.println("Número de empleado = " + empNo );
			     System.out.println("Puesto = " + puesto );
			     System.out.println(" ");
		        }
			
	        conn.close();
	        System.out.println("Consagrate papu, todo Ok ( ͡° ͜ʖ ͡°)");
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
