package study.baseball;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class JudgementTest {
	
	List<Integer> computerNumbers = Arrays.asList(3,1,2);
	List<Integer> playerNumbers = Arrays.asList(3,1,2);
	List<Integer> playerNumbers2 = Arrays.asList(3,4,2);
	List<Integer> playerNumbers3 = Arrays.asList(4,7,8);
	
	@DisplayName("List를 비교하여 같은 요소의 개수를 리턴한다.")
	@Test
	void totalCountTest() {
		// when
		int totalCount = Judgement.totalCount(computerNumbers, playerNumbers);
		int totalCount2 = Judgement.totalCount(computerNumbers, playerNumbers2);
		int totalCount3 = Judgement.totalCount(computerNumbers, playerNumbers3);
		
		// then 
		Assertions.assertThat(totalCount).isEqualTo(3);
		Assertions.assertThat(totalCount2).isEqualTo(2);
		Assertions.assertThat(totalCount3).isEqualTo(0);
	}
	
	@DisplayName("List 비교하여 index가 같은 요소의 개수를 리턴한다.")
	@Test
	void totalStrike() {
		// when
		int totalStrike = Judgement.totalStrike(computerNumbers, playerNumbers);
		int totalStrike2 = Judgement.totalStrike(computerNumbers, playerNumbers2);
		int totalStrike3 = Judgement.totalStrike(computerNumbers, playerNumbers3);
		
		// then 
		Assertions.assertThat(totalStrike).isEqualTo(3);
		Assertions.assertThat(totalStrike2).isEqualTo(2);
		Assertions.assertThat(totalStrike3).isEqualTo(0);
	}
}
