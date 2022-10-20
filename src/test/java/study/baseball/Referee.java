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
		//strike > 0 && ball != 0
		if(total == 0) {
			form += "NOTHING";
		}
		
		if(ball > 0) {
			form += ball + "볼";
		}
		
		if(ball > 0 && strike > 0) {
			form += " " + strike + "스트라이크";
		}else if(ball == 0 && strike > 0) {
			form += strike + "스트라이크";
		}
		
		return form;
	}
	
}

