package com.example.demo.connection;
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
			ResultSet rs = stmt.executeQuery("SELECT EMPNO FROM VISION2.EMPLOYEE");
			
			System.out.println("Al parecer todo sale de PTM");
	        while (rs.next()) {
	        	 String empNo = rs.getString(1);
		          System.out.println("Número de empleado = " + empNo);
		        }
			
	        conn.close();
	        System.out.println("Consagrate papu, todo Ok ( ͡° ͜ʖ ͡°)");
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
