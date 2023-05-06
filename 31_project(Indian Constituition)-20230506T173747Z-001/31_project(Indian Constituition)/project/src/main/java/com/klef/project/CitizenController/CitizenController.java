package com.klef.project.CitizenController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.klef.project.CitizenService.CitizenService;
import com.klef.project.domain.Citizen;
import com.klef.project.domain.Login;


@Controller
public class CitizenController {
	
	@Autowired
	private CitizenService myservice;
	
	@GetMapping("/index")
	public String GetForm(Model model) {
		model.addAttribute("Citizen", new Citizen());
		return  "index";
		
	}
	@PostMapping("/registration")
	public String PostForm(@ModelAttribute Citizen citizen,BindingResult result,Model model) {
		    return "registration";
		
	}
	@GetMapping("/login")
	public String GetloginForm(Model model) {
		 return "login";  
	}
		
	@GetMapping("/website")
	public String Getweb(Model model) {
		return  "website";	
	}
	@GetMapping("/amendments")
	public String Getamd(Model model) {
		return  "amendments";	
	}
	@GetMapping("/logout")
	public String Getlogout(Model model) {
		return  "logout";	
	}
	@GetMapping("/features")
	public String Getfeatures(Model model) {
		return  "features";	
	}
	@GetMapping("/premable")
	public String Getpremable(Model model) {
		return  "premable";	
	}
	@GetMapping("/events")
	public String Getevents(Model model) {
		return  "events";	
	}
	@GetMapping("/members")
	public String Getmem(Model model) {
		return  "members";	
	}
	@GetMapping("/logoutweb")
	public String Getlogoutweb(Model model) {
		return  "logoutweb";	
	}

	
}

