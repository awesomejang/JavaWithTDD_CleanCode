package study.baseball;

public class playGame {
	
	private String targetNumber;
	private String inputNumber;
	
	public playGame(String inputNumber) {
		this.inputNumber = inputNumber;
		this.targetNumber = "214";
	}
	
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
