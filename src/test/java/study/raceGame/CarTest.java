package study.raceGame;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

	private Car car = new Car("carA");;
	private final int CAR_NAME_MAX_LENGTH = Constant.CAR_NAME_MAX_LENGTH;
	
	// https://github.com/slipp/jwp-book/issues/1 테스트코드의 생명주기에 대한 글 
	@BeforeEach
	void initCar() {
		//car = new Car("carA");
		System.out.println("init");
	}
	
	@Test
	@DisplayName("자동차의 이름은 5자를 초과할 수 없습니다.")
	void isOverToLimitNameLengthTest() {
		
		// when & then
		Assertions.assertThatThrownBy(() -> {
			Car car = new Car("MYCARA");
			
		}).isInstanceOf(IllegalArgumentException.class)
		  .hasMessage("자동차의 이름은 " + CAR_NAME_MAX_LENGTH + "자를 초과 할 수 없습니다.");
	}
	
	@Test
	@DisplayName("자동차의 진행단계를 증가시킨다.")
	void RunLocationTest() {
		for (int i = 1; i < 4; i++) {
			car.RunLocation();
			Assertions.assertThat(car.getLocation().length()).isEqualTo(i);
		}
	}
	
	List<String> list = new ArrayList();

    @Test
    public void go1() {
    	car.RunLocation();
    	System.out.println("go1 = " + car.getLocation());
        list.add("go1");
        System.out.println(list);
    }

    @Test
    public void go2(){
        list.add("go2");
        System.out.println(list);

    }

    @Test
    public void go3(){
        list.add("go3");
        System.out.println(list);

    }
    
}
