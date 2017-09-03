package com.ict.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ict.model.Team;


/**
 *
 *khaitq on 3 sept. 2017
 */

public interface TeamDao extends CrudRepository<Team, Long>{
	
	List<Team> findAll();
	
	Team findByName(String name);

}


