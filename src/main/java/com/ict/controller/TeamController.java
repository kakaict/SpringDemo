package com.ict.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ict.model.Team;
import com.ict.service.TeamService;

@RestController
public class TeamController {
	

	@Autowired
	private TeamService teamService;
	
	@RequestMapping("/teams/{name}")
	public Team findTeam(@PathVariable String name) {
		return teamService.findByName(name);
	}
	
	@RequestMapping("/teams/")
	public List<Team> findAll() {
		return teamService.findAll();
	}

}
 