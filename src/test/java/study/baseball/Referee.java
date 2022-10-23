package study.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Referee {

	public String playGame(List<Integer> computerNumbers, List<Integer> playerNumbers) {
		int totalCount = Judgement.totalCount(computerNumbers, playerNumbers);
		int strikeCount = Judgement.totalStrike(computerNumbers, playerNumbers);
		
		return createResultForm(totalCount, strikeCount);
	}
	
	
	private List<Integer> StringToInteger(String target) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < target.length(); i++) {
			list.add(Integer.valueOf(target.charAt(i)));
		}
		return list;
	}
	
	private String createResultForm(int totalCount, int strikeCount) {
		String form = "";
		
		int ballCount = totalCount - strikeCount;
		
		if(totalCount == 0) {
			form += "NOTHING";
		}
		
		if(ballCount > 0) {
			form += ballCount + "볼";
		}
		
		if(ballCount > 0 && strikeCount > 0) {
			form += " " + strikeCount + "스트라이크";
		}else if(ballCount == 0 && strikeCount > 0) {
			form += strikeCount + "스트라이크";
		}
		
		return form;
	}
	
}

