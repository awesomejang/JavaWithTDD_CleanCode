package study.baseball;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RefereeTest {
	
	@DisplayName("야구게임 결과에 대한 텍스트를 리턴한다.")
	@Test
	void playGameTest() {
		//given
		Referee referee = new Referee();
		List<Integer> computerNumbers = Arrays.asList(3,4,5);
		
		// when 
		String threeStrike = referee.playGame(computerNumbers, Arrays.asList(3,4,5));
		String oneStrikeTwoBall = referee.playGame(computerNumbers, Arrays.asList(3,5,4));
		String nothing = referee.playGame(computerNumbers, Arrays.asList(7,8,9));
		
		// then
		Assertions.assertThat(threeStrike).isEqualTo("3스트라이크");		
		Assertions.assertThat(oneStrikeTwoBall).isEqualTo("2볼 1스트라이크");		
		Assertions.assertThat(nothing).isEqualTo("NOTHING");		
	}

}
