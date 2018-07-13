package com.ict.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*
* @author khaitq on 14 juil. 2018
*/

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String getIndex() {
		
		return "home";
	}
}


