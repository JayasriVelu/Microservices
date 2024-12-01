package com.example.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="client-service")
public interface HelloServiceProxy {
	
	@RequestMapping("/rest/hello/server")
	public String gethello();

}
