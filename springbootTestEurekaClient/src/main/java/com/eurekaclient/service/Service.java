package com.eurekaclient.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {

	@RequestMapping("/service/{name}")
	public String helloService(@PathVariable String name) {
		return "(i'm client1)hello : " + name + "!";
	}
}
