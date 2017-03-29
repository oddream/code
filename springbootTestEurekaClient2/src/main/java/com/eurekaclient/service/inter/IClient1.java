package com.eurekaclient.service.inter;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-client1")
public interface IClient1 {
	@RequestMapping(value = "/{name}",method = RequestMethod.GET)
	public String helloService(@PathVariable("name") String name);
}
