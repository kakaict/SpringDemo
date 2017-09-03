package com.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.TeamDao;
import com.ict.model.Team;


/**
 *
 *khaitq on 3 sept. 2017
 */

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;
	
	public List<Team> findAll(){
		return teamDao.findAll();
	}
	
	public Team findByName(String name){
		return teamDao.findByName(name);
	}
}


