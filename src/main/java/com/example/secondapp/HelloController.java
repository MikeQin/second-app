package com.example.secondapp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/", produces = MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String say() {
		return "<h1>Hello Spring, My Second App.</h1>";
	}

}
