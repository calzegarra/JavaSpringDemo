package com.example.demo.connection;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.CommandCall;

/**
 * NOMBRE     : As400Connection
 * FECHA      : 6 de Diciembre del 2019    
 * DESCRIPCION: Programa de JAVA que se encarga de invocar a un programa en CL
 *              del AS400 
 * */

public class As400Connection {

	public static void main(String[] args) {
		String server = "10.9.2.121";
		String user = "DDSWWWCZM";
		String pass= "chris@02";
		String ClCommand ="CALL PGM(WWWSRCCZM/SAVE)";
		
		AS400 system = new AS400(server,user);
		System.out.println("El objeto As400 ya fue creado");
		
		CommandCall comando = new CommandCall(system);
		System.out.println("Objeto del Comando ya fue creado exitosamente! :3");
		
		try {
			System.out.println("Ejecutando el comando "+ClCommand);
			if (comando.run(ClCommand)) {
				System.out.println(ClCommand + " ejecuto mágicamente.");
				
				AS400Message[] mensajeList = comando.getMessageList();
				if(mensajeList.length > 0) {
					System.out.println(", mensajes desde el comando ");
					System.out.println(" ");
					
					for (int i = 0; i < mensajeList.length; i++) {
					//	System.out.print  (mensajeList[i].getID());
						System.out.print  ("Mensaje Final");
						System.out.print  (": ");
						System.out.println(mensajeList[i].getText());		
					}
				}
			}else {
				System.out.println("falló pues!! D:");
			}
		} catch (Exception e) {
			System.out.println("Comando " + comando.getCommand() + " presento problemas!! D:");
			e.printStackTrace();
		}
		//cerramos lo que abrimos antes ( ͡° ͜ʖ ͡°)
		system.disconnectService(AS400.COMMAND);
		System.out.println("Conexion al comando remoto, se esta desconectando, adiosin 8)");
		System.exit(0);
		
		
	}
}
