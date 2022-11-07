package study.raceGame;

public class Car {
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

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
}
