package jeu;

public class Game {
	public int tour = 1;
	public int score = 0;
	
	void roll(int nbQuilles) {
		score+=nbQuilles;
	}
	
	int score() {
		return score;
	}
	
}
