package jeu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	@Test
	void test_aucune_quille() {
		for (int i=0; i<20 ; i++)
			game.roll(0);
		assertEquals(0,game.score());
	}
	
	@Test
	void test_vingt_un() {
		for(int i=0;i<20;i++)
			game.roll(1);
		assertEquals(20,game.score());
	}

}
