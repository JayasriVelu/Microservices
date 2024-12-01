package com.example.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/hello/server")
public class ClientResource {
	
	@GetMapping
	public String hello()
	{
		return "hello this is Jayasri";
	}

}
