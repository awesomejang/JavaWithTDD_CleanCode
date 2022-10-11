package study;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class OperatorTest {
	
	/**
	private static List<Integer> operateResultList = new ArrayList<Integer>();
	@BeforeAll
	static void initResultList() {
		operateResultList.add(15); //PLUS
		operateResultList.add(5); //MINUS
		operateResultList.add(50); //MULTIPLY
		operateResultList.add(2); //DIVIDE
	}
	*/
	
	//@ValueSource(strings = {"+", "-", "*", "/"})
	@DisplayName("제공중인 연산자를 통한 연산 테스트")
	@ParameterizedTest
	@CsvSource(value = {"+:15", "-:5", "*:50", "/:2"}, delimiter = ':')
	void operateTest(String symbol, int result) {
		Assertions.assertThat(Operator.findOperator(symbol).operate(10, 5)).isEqualTo(result);
		//Assertions.assertThat(operateResultList.contains(Operator.findOperator(symbol).operate(10, 5))).isTrue();
	}

	@DisplayName("Operator PLUS 연산 테스트")
	@Test
	void OperatorPlusTest() {
		int operateResult = Operator.PLUS.operate(10, 10);
		Assertions.assertThat(operateResult).isEqualTo(20);
	}

	@DisplayName("Operator MINUS 연산 테스트")
	@Test
	void OperatorMinusTest() {
		int operateResult = Operator.MINUS.operate(10, 5);
		Assertions.assertThat(operateResult).isEqualTo(5);
	}

	@DisplayName("Operator Multiply 연산 테스트")
	@Test
	void OperatorMultiplyTest() {
		int operateResult = Operator.MULTIPLY.operate(10, 5);
		Assertions.assertThat(operateResult).isEqualTo(50);
	}

	@DisplayName("Operator Divide 연산 테스트")
	@Test
	void OperatorDivideTest() {
		int operateResult = Operator.DIVIDE.operate(10, 5);
		Assertions.assertThat(operateResult).isEqualTo(2);
	}
}
