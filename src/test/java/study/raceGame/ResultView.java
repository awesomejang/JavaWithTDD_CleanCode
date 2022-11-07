package study.raceGame;

import java.util.List;

import study.raceGame.CarTest.Car;

public class ResultView {
	public static void printRaceResult(String winners) {
		System.out.println(winners + "가 최종 우승했습니다.");
		/**
		String[] winnerArray = winners.split(",");
		if(winnerArray.length == 1)  {
			System.out.println(winnerArray[0] + "가 최종 우승했습니다.");
		}else {
			for(String winner : winnerArray) {
				System.out.println();
			}
		}
		 */
	}
	
	public static void printRaceProcess(List<Car> players) {
		
	}
}
