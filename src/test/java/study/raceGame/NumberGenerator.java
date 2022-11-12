package study.raceGame;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {

	private static final int min = 0;
	private static final int max = 9;

	public static int createRandomNumbers() {
		int randomNumber = ThreadLocalRandom.current().ints(min, max).findAny().getAsInt();
		return randomNumber;
	}
}
