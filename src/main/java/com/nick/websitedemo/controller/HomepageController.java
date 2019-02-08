package com.nick.websitedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

	@GetMapping("/homepage")
	public String viewHomepage() {
		return "homepage";
	}
}
