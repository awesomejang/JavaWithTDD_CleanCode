package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	@BeforeEach
	void createCalculator() {
		calculator = new Calculator();
	}
	
	
	@DisplayName("계산 기능 정상작동 확인 테스트")
	@Test
	void calculate() {
		// given
		String[] values = new Formula("2 + 3 * 4 / 2").getFormula();
		
		//when 
		int result = calculator.calculate(values);
		
		//then 
		Assertions.assertThat(result).isEqualTo(10);
	}
	
	@DisplayName("입력값이 공백일때 IllegalstateException 발생 테스트")
	@Test
	void isNullorEmptyTest() {
		Assertions.assertThatThrownBy(() -> {
				new Formula("").getFormula();
		}).isInstanceOf(IllegalStateException.class)
		  .hasMessage("입력 값이 공백입니다.");
	}
	
	@DisplayName("약속된 사칙연산 기호가 아닐경우 IllegalstateException 발생 테스트")
	@Test
	void checkPermittedOperator() {
		Assertions.assertThatExceptionOfType(IllegalStateException.class).isThrownBy(() -> {
			String[] values = new Formula("2 + 3 * 4 ) 2").getFormula();
			calculator.calculate(values);
			}).withMessageContaining(")");
	}
}
