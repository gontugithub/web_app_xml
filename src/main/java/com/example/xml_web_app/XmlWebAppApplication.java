package com.example.xml_web_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.utils.ReadXml;
import com.example.utils.writeXml;

@SpringBootApplication
public class XmlWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlWebAppApplication.class, args);
		
		String xmlpath = "src/main/resources/static/web_app.xml";
		String pathtxt = "src/main/resources/static/salida.txt";

		
		ReadXml read = new ReadXml();
		writeXml write = new writeXml();
		
		write.writeWebAppToTxt(read.readXmlToObject(xmlpath), pathtxt);
		
		
		
		
		
	}

}
