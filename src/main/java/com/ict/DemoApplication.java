package com.ict;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.sym.Name;
import com.ict.dao.TeamDao;
import com.ict.model.Coach;
import com.ict.model.Player;
import com.ict.model.Team;

@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
public class DemoApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	private TeamDao teamDao; 
	
	@PostConstruct
	public void init(){
		
			Set<Player> players = new HashSet<Player>();
			
			players.add(new Player("A" , "Goal keeper"));
			players.add( new Player("B" , "Attacker"));
			Coach c = new Coach("c1");
			Team team = new Team("PSG", "Paris", players, c);
			teamDao.save(team);
			
			
			Set<Player> players2 = new HashSet<Player>();
			players2.add(new Player("A" , "Goal keeper"));
			players2.add( new Player("B" , "Attacker"));
			
			Coach c2 = new Coach("c2");
			Team team2 = new Team("LONDON", "London", players2, c2);
			teamDao.save(team2);
	}
	

}
