package com.jadper.player;

import com.jadper.player.model.Player;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlayerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createPlayerAndSetName() {
		String playerName = "Anna Alm";
		Player p = new Player();
		p.setName(playerName);
		assert(p.getName()==playerName);
	}

	@Test
	void createPlayerAndSetJersey() {
		int jersey = 11;
		Player p = new Player();
		p.setJersey(jersey);
		assert(p.getJersey()==jersey);
	}
	@Test
	void createPlayerAndSetTeamId() {
		int teamId = 1;
		Player p = new Player();
		p.setJersey(teamId);
		assert(p.getJersey()==teamId);
	}







}



