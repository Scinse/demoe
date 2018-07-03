package com.aoest.Yutong_Email.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class HolleWorldcontroller {
	   @ResponseBody
	   @GetMapping("/index.html")
	   public String hello() {
		   return "hello !";
	   }

}
