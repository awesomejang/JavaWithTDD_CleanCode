package study.baseball.plusCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
[]주어진 문자열을 특정 구분자 기준으로 분리한다.
 	[]커스텀 구분자를 존재를 인식한다.
[]커스텀 구분자가 있다면 해당 구분자로 문자열을 분리한다.
[] nullOR공백이 입력될 경우 0을 리턴한다.
[] 하나의 숫자를 전달할 경우 해당 값을 리턴한다.
[] 음수&문자를 전달할 경우 RuntimeException을 발생시킨다.

[x]구분된 숫자를 총합하여 리턴한다.
 *
 *
 *구분자는 여러개일 수 있다.
 */
public class CalculatorTest {
	
	class Calculator {
		public int sum(int[] arrayToSum) {
			int sumResult = 0;
			for (int i = 0; i < arrayToSum.length; i++) {
				sumResult += arrayToSum[i];
			}
			return sumResult;
		}
	}
	
	@Test
	void 숫자배열_총합을리턴한다() {
		// given 
		int[] arrayToSum = {3,1,2};
		
		// when
		int sumResult = new Calculator().sum(arrayToSum);
		
		// then
		Assertions.assertThat(sumResult).isEqualTo(6);
	}
}
