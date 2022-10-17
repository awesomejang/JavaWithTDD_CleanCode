package study.baseball;

public class playGame {
	
	private String targetNumber;
	private String inputNumber;
	
	public playGame(String inputNumber) {
		this.inputNumber = inputNumber;
		this.targetNumber = "214";
	}
	
	/**
	public String compareNumber() {
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < targetNumber.length(); i++) {
				char target = targetNumber.charAt(i);
			for (int j = 0; j < inputNumber.length(); j++) {
				if(target == inputNumber.charAt(j)) {
					if(i == j) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		
		return createResultForm(strike, ball);
	}
	*/
}
