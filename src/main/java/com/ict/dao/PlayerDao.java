package com.ict.dao;

import org.springframework.data.repository.CrudRepository;

import com.ict.model.Player;


/**
 *
 *khaitq on 3 sept. 2017
 */

public interface PlayerDao extends CrudRepository<Player, Long> {
	
	Player findByName();
}


