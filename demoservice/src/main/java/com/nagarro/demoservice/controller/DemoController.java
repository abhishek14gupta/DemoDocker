package com.nagarro.demoservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("")
	public String getDemo() {
		return "Hi, Welcome to Demo Class from Docker";
	}
}
