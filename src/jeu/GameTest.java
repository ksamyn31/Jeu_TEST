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
	
	@Test
	void test_vingt_deux() {
		for(int i=0;i<20;i++)
			game.roll(2);
		assertEquals(40,game.score());
	}
	
	@Test
	void test_vingt_moins_un() {
		for(int i=0;i<20;i++)
			game.roll(-1);
		assertEquals(0,game.score());
	}
	
	@Test
	void test_dix_un_et_dix_deux() {
		for(int i=0;i<20;i++) {
			if (i<10) game.roll(1);
			else game.roll(2);
		}	
		assertEquals(30,game.score());
	}
	
	@Test
	void test_spare() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for(int i=0;i<18;i++)
			game.roll(0);
		assertEquals(18,game.score());
	}

}
