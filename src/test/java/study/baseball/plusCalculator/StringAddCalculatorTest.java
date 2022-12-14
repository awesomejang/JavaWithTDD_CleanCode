package study.baseball.plusCalculator;

import java.util.regex.Pattern;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
[x]주어진 문자열을 특정 구분자 기준으로 분리한다.
 	[x]커스텀 구분자를 존재를 인식한다.
[]커스텀 구분자가 있다면 해당 구분자로 문자열을 분리한다.
[x] nullOR공백이 입력될 경우 0을 리턴한다.
[x] 하나의 숫자를 전달할 경우 해당 값을 리턴한다.
[x] 음수&문자를 전달할 경우 RuntimeException을 발생시킨다.

[x]구분된 숫자를 총합하여 리턴한다.
 *
 *
 *구분자는 여러개일 수 있다.
 */

public class StringAddCalculatorTest {
	
	private static final Pattern numberRegExp = Pattern.compile("^[0-9]+$");
	private StringAddCalculator stringAddCalculator = new StringAddCalculator();
	
	@Test
	void calculate_하나의숫자() {
		// when
		int sumResult = stringAddCalculator.calculate("1");
		// then
		Assertions.assertThat(sumResult).isEqualTo(1);
	}
	
	@Test
	void calculate_공백입력() {
		int sumResult = new StringAddCalculator().calculate("");
		Assertions.assertThat(sumResult).isEqualTo(0);
		
		sumResult = new StringAddCalculator().calculate(null);
		Assertions.assertThat(sumResult).isEqualTo(0);
	}
	
	@Test
	void calculate_문자를기준으로숫자를분리한다() {
		// when
		int SumResult = stringAddCalculator.calculate("1,2:3");
		
		// then
		Assertions.assertThat(SumResult).isEqualTo(6);
	}
	
	@Test
	void calculate_커스텀구분자를인식한다() {
		// given
		String input = "//;\\n1;2;3";
		// when
		int calculateResult = stringAddCalculator.calculate(input);
		// then
		Assertions.assertThat(calculateResult).isEqualTo(6);
	}
	
	@Test
	void calculate_커스텀구분자가있는문자열의합() {
		// given
		String input = "//;\\n1;2;3";
		String separator = ";";
		int customSeparatorIndex = 2; 
		
		// when
		String customSeparator = input.substring(customSeparatorIndex, input.indexOf("\\"));
		
		// then
		Assertions.assertThat(customSeparator).isEqualTo(separator);
	}
	
	@Test
	void calculate_양수가아닌다른숫자가입력되면예외발생() {
		// given 
		String minusInputs = "-1,2,3";
		// when & then
		Assertions.assertThatThrownBy(() -> {
			stringAddCalculator.calculate(minusInputs);
		}).isInstanceOf(RuntimeException.class)
		  .hasMessage("입력값에 음수가 있습니다.");
	}
}
