package com.my.test.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("sayHello")
	public String sayHello() {
		return "success";
	}
}
