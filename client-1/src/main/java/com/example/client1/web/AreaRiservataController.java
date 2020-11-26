package com.example.client1.web;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AreaRiservataController {
	

	@GetMapping("/area-riservata")
	public String areaRiservata(Model model, Principal principal) {
		return "area-riservata";
	}
}
