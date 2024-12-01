package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String getHello()
	{
		String url = "http://client-service/rest/hello/server";
		return restTemplate.getForObject(url, String.class);
	}
}
