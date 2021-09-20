package com.curso.bookstore.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoriaDomain {
	
		@RequestMapping("/")
		@ResponseBody
		public String hello() {
			return "hello world";
		
	}
}
