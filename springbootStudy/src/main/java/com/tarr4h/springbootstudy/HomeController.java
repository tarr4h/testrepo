package com.tarr4h.springbootstudy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		log.debug("hello home");
		return "forward:/index.jsp";
//		return "hello";
	}
}
