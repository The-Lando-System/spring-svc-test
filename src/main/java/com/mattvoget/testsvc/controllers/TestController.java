package com.mattvoget.testsvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mattvoget.testsvc.model.TestModel;
 
@Controller
public class TestController {
	@RequestMapping("/hello")
	@ResponseBody
	public TestModel sayHello() {
		return new TestModel();
	}
	
	@RequestMapping("/world")
	@ResponseBody
	public TestModel sayWorld() {
		return new TestModel("World","This is a stupid decsription");
	}
	
//	@RequestMapping("/world")
//	@ResponseBody
//	public String sayWorld() {
//		return "adksfksldjf";
//	}
}