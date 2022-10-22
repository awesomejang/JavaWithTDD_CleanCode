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
		
		while(randomNumbers.size() < 3) {
			int randomNumber = ThreadLocalRandom.current().ints(min, max).distinct().limit(10).findAny().getAsInt();
			if(!randomNumbers.contains(randomNumber)) {
				randomNumbers.add(randomNumber);
			}
		}
		/**
		for (int i = 0; i < numberCnt; i++) {
			//randomNumbers.add(ThreadLocalRandom.current().nextInt(min, max + 1));
			randomNumbers.add(ThreadLocalRandom.current().ints(min, max).distinct().limit(10).findAny().getAsInt());
		}
		*/
		return randomNumbers;
	}
	
}
