package study.raceGame;



import org.junit.jupiter.api.Test;

public class CarTest {
	
	class Car {
		private final int LIMIT_NAME_LENGTH = 5; 
		
		private String name;
		private String location;
		
		public Car(String name) {
			if(name.length() > LIMIT_NAME_LENGTH) {
				throw new IllegalArgumentException("자동차의 이름은 " + LIMIT_NAME_LENGTH + "자를 초과 할 수 없습니다.");
			}
			this.name = name;
			this.location = "";
		}
		
		private boolean isOverToLimitNameLength(String inputName) {
			if(inputName.length() > LIMIT_NAME_LENGTH) {
				return true;
			}
			return false;
		}
	}
	
	@Test
	void isOverToLimitNameLengthTest() {
		// given
		String inputName = "abcdef";
		
		// when 
		boolean result = ;
		
		
	}
}
