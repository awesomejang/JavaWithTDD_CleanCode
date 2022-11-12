package study.raceGame;

import java.util.ArrayList;
import java.util.List;

public class RaceGame {
	List<Car> players = new ArrayList<>();

	public RaceGame(String[] carNames) {
		readyToGame(carNames);
	}

	public void playGame(int cntGame) {
		for (int i = 0; i < cntGame; i++) {
			
		}
	}

	private void readyToGame(String[] carNames) {
		for (String carName : carNames) {
			this.players.add(new Car(carName));
		}
	}
	
	private void moveCars() {
		ResultView resultView = new ResultView();
		for(Car car : this.players) {
			if(car.isCarRun()) {
				car.RunLocation();
			}
		}
	}
}
