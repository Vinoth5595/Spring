package com.vino;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HappyController {
	@RequestMapping("/happy")
	public String happy() {
		System.out.println("I am in happy....");
		return "happy";
	}
}
