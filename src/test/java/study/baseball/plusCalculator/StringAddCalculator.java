package study.baseball.plusCalculator;

import java.util.regex.Pattern;

import org.junit.platform.commons.util.StringUtils;

public class StringAddCalculator {
	
	private static final Pattern numberRegExp = Pattern.compile("^[0-9]*$");
	
	public int calculate(String inputNumber) {
		int sumResult = 0;
		
		if(StringUtils.isBlank(inputNumber)) {
			return 0;
		}
		
		if(inputNumber.length() == 1) { // 하나의 숫자일 경우
			return Integer.parseInt(inputNumber);
		}
		
		Separator separator = new Separator();
		
		for(String number : separator.parseToNumbers(inputNumber)) {
			isMinusNumber(number); 
			sumResult += Integer.parseInt(number);
		}
		return sumResult;
	}
	
	
	private void isMinusNumber(String number) {
		if(!numberRegExp.matcher(number).find()) {
			throw new RuntimeException("입력값에 음수가 있습니다.");
		}
	}
}
