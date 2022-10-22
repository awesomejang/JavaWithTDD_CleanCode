package study.baseball;

import java.util.List;

public class Judgement {
	
	public static int totalSameNumberCount(List<Integer> computerNumbers, List<Integer> playerNumbers) {
		int totalCount = 0;
		for (int i = 0; i < playerNumbers.size(); i++) {
			if(computerNumbers.contains(playerNumbers.get(i))) {
				totalCount++;
			}
		}
		return totalCount;
	}
	
	public static int totalStrike(List<Integer> computerNumbers, List<Integer> playerNumbers) {
		int strike = 0;
		for (int i = 0; i < playerNumbers.size(); i++) {
			if(computerNumbers.get(i) == playerNumbers.get(i)) {
				strike++;
			}
		}
		return strike;			
	}
	

}
