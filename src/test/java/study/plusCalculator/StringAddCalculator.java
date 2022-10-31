package study.plusCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.platform.commons.util.StringUtils;

public class StringAddCalculator {
	
	private static final Pattern numberRegExp = Pattern.compile("^[0-9]*$");
	private static final Pattern customSeparator = Pattern.compile("//");
	
	public int splitAndSum(String inputNumber) {
		int sumResult = 0;
		String separators = ",|:";
		
		if(StringUtils.isBlank(inputNumber)) {
			return 0;
		}
		
		if(inputNumber.length() == 1) { // 하나의 숫자일 경우
			return Integer.parseInt(inputNumber);
		}
		
		if(isCustomSeparatorExist(inputNumber)) {
			separators = String.valueOf(inputNumber.charAt(2));
			inputNumber = inputNumber.substring(5);
		}
		
		String[] numbers = inputNumber.split(separators);
		
		//String[] numbers = splitToSeparator(inputNumber);
		sumResult = calculate(numbers);
		
		return sumResult;
	}
	
	/**
	private String[] splitToSeparator(String input) {
		return input.split(separators);
	}
	*/
	
	private int calculate(String[] numbers) {
		int sumResult = 0;
		for(String number : numbers) {
			isMinusNumber(number); 
			sumResult += Integer.parseInt(number);
		}
		return sumResult;
	}
	
	private boolean isCustomSeparatorExist(String input) {
		return customSeparator.matcher(input).find();
	}
	
	private void isMinusNumber(String number) {
		if(!numberRegExp.matcher(number).find()) {
			throw new RuntimeException("입력값에 음수가 있습니다.");
		}
	}
}
