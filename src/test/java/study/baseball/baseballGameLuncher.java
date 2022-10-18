package study.baseball;

import java.util.Scanner;

public class baseballGameLuncher {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		//String playerNumber = kb.next();
		
		//PlayBall playBall = new PlayBall(playerNumber);
		String gameResult = "";
		
		while(!gameResult.equals("3스트라이크")) {
			// 받고
			// 생성 
			// 
			// gameStart();
			// gameResult = play.()~; 입력받고 ~ 비교 
			
			
			System.out.print("숫자를 입력해 주세요 : ");
			String playerNumber = kb.next();
			PlayBall playBall = new PlayBall(playerNumber);
			gameResult = new Referee(playBall).playGame();
		}
		// if() ~
		
		
	}
	
}
