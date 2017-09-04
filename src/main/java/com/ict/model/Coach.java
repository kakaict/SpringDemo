package com.ict.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *
 *@author khaitq on 5 sept. 2017
 */

public class Coach implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5947701195332219036L;
	
	@Id @GeneratedValue
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

}


