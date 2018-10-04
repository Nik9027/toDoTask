package com.emirates.toDoTaskServiceApp.restController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/toDoTask")
	public String home() {
		
		return "index";
	}
	@RequestMapping("/")
	public String home1() {
		
		return "index";
	}
}
