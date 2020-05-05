package suman;

import java.util.ArrayList;

import java.util.Scanner;

public class Batsman {

	public static void main(String[] args) {
		
		String batsman = "";
		int score = 0;
		int noOfBatsman = 0;
		
		Scanner sc = new Scanner(System.in);
		
		noOfBatsman = Integer.parseInt(sc.nextLine());
		
		int[] scores = new int[noOfBatsman];
		ArrayList<Score> scoreList = new ArrayList<Score>();
		
		
		for(int i=0 ; i<noOfBatsman; i++) {
			
			String batsmanNscore = sc.nextLine();
			String[] bastsmanNscoreArray = batsmanNscore.split(",");
			
			batsman = bastsmanNscoreArray[0];
			
			
			score = Integer.parseInt(bastsmanNscoreArray[1]);
			
			
			
			scores[i] = score;
			
			Score scoreObj = new Score(batsman, score);
			scoreList.add(scoreObj);
			
			
		}
		
		Score scoreObj = new Score();
		int maxScore = scoreObj.maximumScore(scores, noOfBatsman);
		int index = scoreObj.findIndex(scores, maxScore, noOfBatsman);
		
		System.out.println(scoreList.get(index));

	}

}

class Score{
	public String batsman;
	public int score;
	
	public Score() {
		super();
	}
	
	public Score(String batsman, int score) {
		super();
		this.batsman = batsman;
		this.score = score;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public int maximumScore(int[] scores, int noOfBatsman) {
		
		int maxScore = scores[0];
		
		for(int i=0 ; i<noOfBatsman ; i++) {
			if(scores[i] > maxScore) 
				maxScore = scores[i];
				
		}
		
		return maxScore;
		
	}
	
	public int findIndex(int[] scores, int maxScore, int noOfBatsman) {
		
		int index = 0;
		
		for(int i=0; i<noOfBatsman; i++) {
			if(maxScore == scores[i])
				index = i;
		}
		
		return index;
	}

	@Override
	public String toString() {
		return batsman;
	}
	
	
	
}

