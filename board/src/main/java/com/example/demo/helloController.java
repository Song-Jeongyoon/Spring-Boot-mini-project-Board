package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "hello.jsp";
	}
}
