package com.ict.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Player implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3455083780454285271L;

	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	private String position;
	
	public Player(){
		super();
	}
	
	public Player(String name, String position){
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
