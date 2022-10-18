package study.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {
	
	private static final int numberCnt = 3;
	private static final int min = 1;
	private static final int max = 9;
	
	public static List<Integer> createRandomNumbers() {
		List<Integer> randomNumbers = new ArrayList<>();
		for (int i = 0; i < numberCnt; i++) {
			randomNumbers.add(ThreadLocalRandom.current().nextInt(min, max + 1));
		}
		return randomNumbers;
	}
	
}
