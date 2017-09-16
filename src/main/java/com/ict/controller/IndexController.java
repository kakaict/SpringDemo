package com.ict.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ict.service.TeamService;


/**
 *
 *khaitq on 17 sept. 2017
 */


@Controller
public class IndexController {
	
	
	@Autowired
	private TeamService teamService;

	@RequestMapping("/hi/{name}")
	public String getIndex(Map model, @PathVariable String name) {
		
		model.put("name", name);

		model.put("teams",teamService.findAll());
		
		return "index";
	}
}


