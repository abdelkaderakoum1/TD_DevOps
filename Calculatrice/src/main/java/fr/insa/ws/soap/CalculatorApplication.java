package fr.insa.ws.soap;

import jakarta.xml.ws.Endpoint;

public class CalculatorApplication{
	public static String host = "localhost";
	public static short port = 8089;
	
	public void demarrerService() {
		String url = "https://"+host+":"+port+"/";
		Endpoint.publish(url, new Calculator());
	}
	
	public static void main(String[] args) {
		new CalculatorApplication().demarrerService();
		System.out.println("Service started");
	}
}