package com.webservice.rest.consumer;
import org.springframework.web.client.RestTemplate;


public class Consumer {
	
	public static void main(String[] args) {
	RestTemplate restTemplate = new RestTemplate();
	
	   String url="http://localhost:8080/RestProvider/student";
	
	   Student user=restTemplate.getForObject(url, Student.class);
	   System.out.println(user.getSname()+"++++"+user.getSage());
	
	}

}
