package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserControl {

	@RequestMapping(value = "/hello" , method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public String test() {
		return "Hello";
	}
}
