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
			
		}
		return createResultForm(strike, ball);
	}
	
	//private void judgeBallorStrike

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
