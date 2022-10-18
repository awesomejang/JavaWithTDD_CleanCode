package study.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Referee {

	private PlayBall playBall;
	
	public Referee(PlayBall playBall) {
		this.playBall = playBall;
	}
	
	public String playGame() {
		Scanner kb = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		String playerInput = kb.next();
		
		PlayBall playBall = new PlayBall(StringToInteger(playerInput));
		
		List<Integer> computerNumbers = playBall.getComputerNumbers();
		List<Integer> playerNumbers = playBall.getPlayerNumbers();
		
		
		
		
		return createResultForm(computerNumbers, playerNumbers);
	}
	
	
	private List<Integer> StringToInteger(String target) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < target.length(); i++) {
			list.add(Integer.valueOf(target.charAt(i)));
		}
		return list;
	}
	
	
	
	private boolean isStrikeOrBall(char computerNumber, char playerNumbers) {
		boolean result = false;
		if(computerNumber == playerNumbers) {
			result = true;
		}
		return result;
	}
	
	
	private boolean isStrike(int i, int j) {
		boolean result = false;
		if(i == j) {
			result = true;
		}
		return result;
	}
	
	private String createResultForm(List<Integer> computerNumbers, List<Integer> playerNumbers) {
		String form = "";
		
		int total = Judgement.totalCount(computerNumbers, playerNumbers);
		int strike = Judgement.totalStrike(computerNumbers, playerNumbers);
		int ball = total - strike;
		
		if(total == 0) {
			form += "NOTHING";
		}else if(strike > 0) {
			form += ball + "볼" + " " + strike + "스트라이크";
		}else {
			form += ball + "볼";
		}
		
		return form;
	}
	
}

