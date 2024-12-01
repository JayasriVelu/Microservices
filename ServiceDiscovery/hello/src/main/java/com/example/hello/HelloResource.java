package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/hello/client")
public class HelloResource {


	
	@Autowired
	private HelloServiceProxy helloServiceProxy;
	
	@Autowired
	private HelloService helloService;
	
	/*@GetMapping
	public String hello()
	{
		String response = helloServiceProxy.gethello();
		return response;
	}*/
	
	@GetMapping
	public String getMessage()
	{
		String response = helloService.getHello();
		return response;
	}
}
