package study.raceGame;

import java.util.Iterator;
import java.util.List;


public class ResultView {
	
	public static void printRaceResultStart() {
		System.out.println(Constant.RACING_RESULT_ANNOUNCEMENT);
	}
	
	public static void printRaceResult(String winners) {
		System.out.println(String.format(Constant.RACING_GAMEWINNER_FORMAT_ANNOUNCEMENT, winners));
	}
	
	public static void printRaceProcess(List<Car> players) {
		for(Car car : players) {
			System.out.println(String.format(Constant.RACING_GAMEMID_FORMAT_ANNOUNCEMENT, car.getName(), car.getLocation()));
			//System.out.println(car.getName() + " " + ":" + " " + car.getLocation());
		}
		System.out.println();
	}
}
