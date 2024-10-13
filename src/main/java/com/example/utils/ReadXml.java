package com.example.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.example.models.initParam;
import com.example.models.servlet;
import com.example.models.servletMapping;
import com.example.models.taglib;
import com.example.models.webApp;

public class ReadXml {
	
	
	public static webApp readXmlToObject(String path) {
		
		
		
	
		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new File(path));
			
			
			NodeList list = doc.getElementsByTagName("web-app");
			
			Node webapp = list.item(0);
			
			if (webapp.getNodeType() == Node.ELEMENT_NODE){
				
				Element webappElement = (Element) webapp;
				
				NodeList nodosServlet = webappElement.getElementsByTagName("servlet");
				
				NodeList nodosServletMap = webappElement.getElementsByTagName("servlet-mappin");
				
				Node nodoTaglib = webappElement.getElementsByTagName("taglib").item(0);
				
				ArrayList<servlet> servletList = new ArrayList<>();
				ArrayList<servletMapping> servletMapList = new ArrayList<>();
				taglib taglib = null;
				
				for (int i = 0; i < nodosServlet.getLength(); i++) {
					
					ArrayList<initParam> initparamList = new ArrayList<>();
					
					if (nodosServlet.item(i).getNodeType() == Node.ELEMENT_NODE) {
						
						Element servlet = (Element) nodosServlet.item(i);
						
						String servletName = servlet.getElementsByTagName("servlet-name").item(0).getTextContent();
						String servletClass = servlet.getElementsByTagName("servlet-class").item(0).getTextContent();
						
						NodeList nodosParam = servlet.getElementsByTagName("init-param");
						
						for (int j = 0; j < nodosParam.getLength(); j++) {
							
							if (nodosParam.item(j).getNodeType() == Node.ELEMENT_NODE) {
								
								Element param = (Element) nodosParam.item(j);
								
								initparamList.add(new initParam(
										param.getElementsByTagName("param-name").item(0).getTextContent(),
										param.getElementsByTagName("param-value").item(0).getTextContent()));

							}

						}
						
						servletList.add(new servlet(servletName, servletClass, initparamList));
						
						
					}
					
				}
				
				
				
				for (int i = 0; i < nodosServletMap.getLength(); i++ ) {
					
					if (nodosServletMap.item(i).getNodeType() == Node.ELEMENT_NODE) {
						
						Element servletMap = (Element) nodosServletMap.item(i);
						
						servletMapList.add(new servletMapping(
									servletMap.getElementsByTagName("servlet-name").item(0).getTextContent(),
									servletMap.getElementsByTagName("url-pattern").item(0).getTextContent()));
					}
					
				}
				
				
				if (nodoTaglib.getNodeType() == Node.ELEMENT_NODE) {
					
					Element taglibElement = (Element) nodoTaglib;
					
					taglib x = new taglib(
							taglibElement.getElementsByTagName("taglib-location").item(0).getTextContent(),
							taglibElement.getElementsByTagName("taglib-uri").item(0).getTextContent());
							
					
					taglib = x;
				}
				
			
				
				webApp webApp = new webApp(servletList, servletMapList, taglib);
				return webApp;
				
					
					
				}
				
				
				
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	

}
