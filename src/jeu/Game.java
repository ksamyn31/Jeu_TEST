package jeu;

public class Game {
	public int tour = 1;
	public int score = 0;
	
	void roll(int nbQuilles) {
		if(nbQuilles>=0)
			score+=nbQuilles;
	}
	
	int score() {
		
		return score;
	}
	
}
