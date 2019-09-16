package com.vino;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/app")
	public String app() {
		System.out.println("I am in app....");
		return "index";
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("I am in home....");
		return "home";
	}
}