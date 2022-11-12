package study.raceGame;

import java.util.ArrayList;
import java.util.List;

public class RaceGame {
	List<Car> players = new ArrayList<>();

	public RaceGame(String[] carNames) {
		readyToGame(carNames);
	}

	public void playGame(int cntGame) {
		ResultView.printRaceResultStart();
		for (int i = 0; i < cntGame; i++) {
			moveCars();
		}
	}

	private void readyToGame(String[] carNames) {
		for (String carName : carNames) {
			this.players.add(new Car(carName));
		}
	}
	
	private void moveCars() {
		for(Car car : this.players) {
			if(car.isCarRun()) {
				car.RunLocation();
			}
		}
		printRaceState();
	}
	
	private void printRaceState() {
		ResultView.printRaceProcess(this.players);
	}
}
