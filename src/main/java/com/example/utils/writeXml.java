package com.example.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.example.models.webApp;

public class writeXml {
	
	
	public static void writeWebAppToTxt(webApp webapp, String path) {
		
		try {
			
			FileWriter file = new FileWriter(path);
			BufferedWriter salida = new BufferedWriter(file);
			
			
			salida.write(webapp.toString());
			salida.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	

}
