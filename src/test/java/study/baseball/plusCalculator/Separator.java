package study.baseball.plusCalculator;

import java.util.regex.Pattern;

public class Separator {

	private static final Pattern customSeparator = Pattern.compile("//");
	
	public String[] parseToNumbers(String inputNumber) {
		String separators = ",|:";
		if(isCustomSeparatorExist(inputNumber)) {
			separators = changeToCustomSeparator(inputNumber);
			inputNumber = inputNumber.substring(CustomConstant.CUSTOM_SEPARATOR_NUMBER_START_INDEX);
		}
		return inputNumber.split(separators);
		
	}
	
	private boolean isCustomSeparatorExist(String input) {
		return customSeparator.matcher(input).find();
	}
	
	private String changeToCustomSeparator(String inputNumber) {
		return String.valueOf(inputNumber.charAt(CustomConstant.CUSTOM_SEPARATOR_INDEX));
	}
}
