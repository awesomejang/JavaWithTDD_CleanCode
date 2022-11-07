package study.raceGame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class NumberGeneratorTest {
	
	//NumberGenerator numberGenerator = new NumberGenerator();
	
	private static final int min = 0;
	private static final int max = 9;
	
	//@Test
	@RepeatedTest(value =  50, name = "랜덤숫자가 설정한 범위에 있는지 테스트")
	void createRandomNumberTest() {
		int randomNumber = NumberGenerator.createRandomNumbers();
		System.out.println(randomNumber);
		Assertions.assertThat(randomNumber >= min && randomNumber <= max).isTrue();
		//Assertions.assertThat(randomNumber).is
		
		
	}
}
