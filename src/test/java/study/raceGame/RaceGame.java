package study.raceGame;

import java.util.ArrayList;
import java.util.List;

public class RaceGame {
	//private List<Car> players = new ArrayList<>();
	private RacePlayers racePlayers;
	
	public RaceGame(String[] carNames) {
		readyToGame(carNames);
	}
	
	private void readyToGame(String[] carNames) {
		List<Car> players = new ArrayList<>();
		for (String carName : carNames) {
			players.add(new Car(carName));
		}
		this.racePlayers = new RacePlayers(players);
	}

	public void playGame(int cntGame) {
		ResultView.printRaceResultStart();
		for (int i = 0; i < cntGame; i++) {
			moveCars();
		}
		
		ResultView.printRaceResult(racePlayers.getWinners());
		
	}

	private void moveCars() {
		for(Car car : racePlayers.getRacePlayers()) {
			if(car.isCarRun()) {
				car.RunLocation();
			}
		}
		printRaceState();
	}
	
	private void printRaceState() {
		ResultView.printRaceProcess(racePlayers.getRacePlayers());
	}
	
	/**
	private String getWinners() {
		
	}
	*/
}
