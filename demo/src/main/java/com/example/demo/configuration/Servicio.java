package com.example.demo.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Servicio {

	/**
	 * @author c.zegarra
	 * @return Convierte la informacion tipo File en Bytes para que ingresen a la 
	 * base de datos. Recibe data tipo File.
	 * **/
	
	public static byte[] getBytesFromFile(File file) throws IOException {
		if (file != null) {
			InputStream is = new FileInputStream(file);
		//	InputStream is = new FileInputStream("C:\\Users\\c.zegarra\\Desktop\\download.jpg");
		                                        	
			byte[] bytes = new byte[(int) file.length()];

			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length
					&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}

			is.close();
			return bytes;
		} else {
			return null;
		}
	}
}
