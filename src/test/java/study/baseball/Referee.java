package study.baseball;

public class Referee {

	private PlayBall playBall;
	
	public Referee(PlayBall playBall) {
		this.playBall = playBall;
	}
	
	public String playGame() {
		char[] computerNumbers = playBall.getComputerNumber().toCharArray();
		char[] playerNumbers = playBall.getPlayerNumber().toCharArray();
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < playerNumbers.length; i++) {
			for (int j = 0; j < computerNumbers.length; j++) {
				if(isStrikeOrBall(computerNumbers[i], playerNumbers[j])) {
					if(isStrike(i, j)) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		return createResultForm(strike, ball);
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
	
	private String createResultForm(int strike, int ball) {
		String form = "";
		
		if(ball > 0) {
			form += String.valueOf(ball) + "볼";
		}
		
		if(strike > 0) {
			if(form != "") form += " ";
			form += String.valueOf(strike) + "스트라이크";
		}
		
		if(form.equals("")) {
			form = "NOTHING";
		}
		return form;
	}
	
}

