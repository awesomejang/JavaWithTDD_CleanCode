package study.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baseballGameLuncher {

	public static void main(String[] args) {
		final List<Integer> computerNumebers = NumberGenerator.createRandomNumbers();
		final Referee referee = new Referee();
		
		String gameResult = "";
		while(!gameResult.equals("3스트라이크")) {
			gameResult = referee.playGame(computerNumebers, askNumbers()); 
			System.out.println(gameResult);
		}
		System.out.println("3개의 숫자를 모두 맞히셨습니다.! 게임 종료");
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		
		askAfterGame();


	}
	
	public static List<Integer> askNumbers() {
		Scanner kb = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		String input = kb.next();
		
		List<Integer> playerNumbers = new ArrayList<>();
		for(String s : input.split("")) {
			playerNumbers.add(Integer.valueOf(s));
		}
		return playerNumbers;
	}
	
	public static void askAfterGame() {
		Scanner kb = new Scanner(System.in);
		Integer input = kb.nextInt();
		if(input == 1) {
			baseballGameLuncher.main(null);
		}else {
			return;
		}
	}
}
