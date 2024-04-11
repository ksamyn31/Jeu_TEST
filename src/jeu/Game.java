package jeu;

public class Game {
	
	public static int tourMax=10;
	public int score = 0;
	Tab[] tabscore = new tab[t];
	
	void roll(int nbQuilles) {
		if(score % 10 == 0)
			score = nbQuilles*2;
		if(nbQuilles>=0)
			score+=nbQuilles;
		
	}
	
	int score() {
		return score;
	}
	
}
