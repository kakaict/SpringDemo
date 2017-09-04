package com.ict.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.PlayerDao;
import com.ict.model.Player;


/**
 *
 *khaitq on 3 sept. 2017
 */

@Service
public class PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	public Player findByName(String name){
		return playerDao.findByName(name);
	}
}


