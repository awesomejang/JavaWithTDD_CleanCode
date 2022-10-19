package study.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Referee {

	public String playGame(List<Integer> computerNumbers, List<Integer> playerNumbers) {
		System.out.print(computerNumbers.get(0));
		System.out.print(computerNumbers.get(1));
		System.out.print(computerNumbers.get(2));
		System.out.println();
		System.out.print(playerNumbers.get(0));
		System.out.print(playerNumbers.get(1));
		System.out.print(playerNumbers.get(2));
		return createResultForm(computerNumbers, playerNumbers);
	}
	
	
	private List<Integer> StringToInteger(String target) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < target.length(); i++) {
			list.add(Integer.valueOf(target.charAt(i)));
		}
		return list;
	}
	
	private String createResultForm(List<Integer> computerNumbers, List<Integer> playerNumbers) {
		String form = "";
		
		int total = Judgement.totalCount(computerNumbers, playerNumbers);
		int strike = Judgement.totalStrike(computerNumbers, playerNumbers);
		int ball = total - strike;
		
		//System.out.println("total = " + total);
		//System.out.println("strike = " + strike);
		//System.out.println("ball = " + ball);
		
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

