package com.ict.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * 
* khaitq on 3 sept. 2017
* 
*/

@Entity
public class Team implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3205710406920895172L;

	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	private String city;
	
	@OneToOne(cascade=CascadeType.ALL) 
	@JoinColumn(name="teamId")
	private Coach coach;
	
	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	@OneToMany(cascade=CascadeType.ALL) @JoinColumn(name="teamId")
	private Set<Player> players;
	
	public Team(){
		super();
	}
	
	public Team(String name, String city, Set<Player> players, Coach coach){
		this.city = city;
		this.name = name;
		this.players = players;
		this.coach = coach;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
}


