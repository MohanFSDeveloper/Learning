package com.mohan.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	@RequestMapping(value="/welcomecontroller.do")
	public String welcome(){
		System.out.println("inside controller");
		return "index.html";
	}

}
