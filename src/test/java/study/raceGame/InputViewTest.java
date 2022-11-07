package study.raceGame;

import java.util.Scanner;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputViewTest {
	
	@Test
	void InputViewTest() {
		InputView inputView = InputView.getGameInfo();
		Assertions.assertThat(inputView.getCntGame()).isEqualTo(4);
	}
}
