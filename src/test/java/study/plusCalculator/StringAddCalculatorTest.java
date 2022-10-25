package study.plusCalculator;

import static org.assertj.core.api.Assertions.in;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

/**
 * 
[]주어진 문자열을 특정 구분자 기준으로 분리한다.
 	[]커스텀 구분자를 존재를 인식한다.
[]커스텀 구분자가 있다면 해당 구분자로 문자열을 분리한다.
[x] nullOR공백이 입력될 경우 0을 리턴한다.
[x] 하나의 숫자를 전달할 경우 해당 값을 리턴한다.
[] 음수&문자를 전달할 경우 RuntimeException을 발생시킨다.

[x]구분된 숫자를 총합하여 리턴한다.
 *
 *
 *구분자는 여러개일 수 있다.
 */

public class StringAddCalculatorTest {
	
	class StringAddCalculator {
		public int splitAndSum(String inputNumber) {
			int sumResult = 0;
			
			if(StringUtils.isBlank(inputNumber)) {
				return 0;
			}
			
			if(inputNumber.length() == 1) { // 하나의 숫자일 경우
				return Integer.parseInt(inputNumber);
			}
			return sumResult;
		}
	}
	
	@Test
	void splitAndSum_하나의숫자() {
		// when
		int sumResult = new StringAddCalculator().splitAndSum("1");
		// then
		Assertions.assertThat(sumResult).isEqualTo(1);
	}
	
	@Test
	void splitAndSum_공백입력() {
		int sumResult = new StringAddCalculator().splitAndSum("");
		Assertions.assertThat(sumResult).isEqualTo(0);
		
		sumResult = new StringAddCalculator().splitAndSum(null);
		Assertions.assertThat(sumResult).isEqualTo(0);
		
	}
}
