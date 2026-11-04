package fr.insa.ws.soap;

import jakarta.xml.ws.Endpoint;

public class CalculatorApplication{
	// 0.0.0.0 = listen on all network interfaces, so the service is reachable from outside a Docker container
	public static String host = "0.0.0.0";
	public static short port = 8089;

	public void demarrerService() {
		// Endpoint.publish only supports http (https throws IllegalArgumentException)
		String url = "http://"+host+":"+port+"/";
		Endpoint.publish(url, new Calculator());
	}
	
	public static void main(String[] args) {
		new CalculatorApplication().demarrerService();
		System.out.println("Service started");
	}
}