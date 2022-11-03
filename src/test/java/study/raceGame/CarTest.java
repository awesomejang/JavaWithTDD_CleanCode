package study.raceGame;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

//Car
//RaceGame

// [x] 각 자동차에 이름을 부여할 수 있다.
// 	[x] 자동차 이름은 5자를 초과할 수 없다.
// [] 경주할 자동차의 이름은 쉼표를 기준으로 구분한다.
// [] 0~9사이의 random 값을 구한 후 random 값이 4이상일 경우에 전진한다.
// [] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
//  [] 우승자는 한명 이상일 수 있다.
public class CarTest {
	
	class Car {
		private final int LIMIT_NAME_LENGTH = 5; 
		
		private String name;
		private String location;
		
		public Car(String name) {
			if(name.length() > LIMIT_NAME_LENGTH) {
				throw new IllegalArgumentException("자동차의 이름은 " +  LIMIT_NAME_LENGTH + "자를 초과 할 수 없습니다.");
			}
			this.name = name;
			this.location = "";
		} 
	}
	
	@Test
	void isOverToLimitNameLengthTest() {
		// given
		String inputName = "abcdef";
		int limitLength = new Car("TEST").LIMIT_NAME_LENGTH;
		
		// when & then
		Assertions.assertThatThrownBy(() -> {
			Car car = new Car(inputName);
		}).isInstanceOf(IllegalArgumentException.class)
		  .hasMessage("자동차의 이름은 " + limitLength + "자를 초과 할 수 없습니다.");
		
		
	}
}
