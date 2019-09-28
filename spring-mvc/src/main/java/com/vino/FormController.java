package com.vino;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vino.bean.Reservation;

@Controller
public class FormController {
	
	@Autowired
	Reservation reservation;

	@RequestMapping("/formdemo")
	public String formDemo() {
		System.out.println("I am inside formdemo..");
		return "formdemo";
	}

	@RequestMapping("/springform")
	public String springform(Model model) {
		//Reservation reservation = new Reservation();
		model.addAttribute("reservation", reservation);
		System.out.println("I am inside springform..");
		return "springform";
	}

	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("reservation") Reservation res) {
		return "confirmation-page";
	}

	@RequestMapping("/formtest")
	public String formtest(HttpServletRequest request, Model model) {
		System.out.println("I am inside formtest..");
		model.addAttribute("message", "hello");
		System.out.println("Using HttpServletRequest :: Username : " + request.getParameter("username") + " Password : "
				+ request.getParameter("password"));
		return "formdemo";
	}

	@RequestMapping("/formreq")
	public String formreq(@RequestParam("username") String name, @RequestParam("password") String password,
			Model model) {
		System.out.println("I am inside formreq..");
		model.addAttribute("message", "hello RequestParam");
		System.out.println("Using @RequestParam :: Username : " + name + " Password : " + password);
		return "formdemo";
	}

}
