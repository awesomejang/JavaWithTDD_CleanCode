package study.raceGame;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class RacePlayers {

	private List<Car> racePlayers;
	
	public RacePlayers(List<Car> racePlayers) {
		this.racePlayers = racePlayers; 
	}
	
	public List<Car> getRacePlayers() {
		return this.racePlayers;
	}
	
	public String getWinners() {
		StringJoiner winners = new StringJoiner(",");
		int winnerLocation = getWinnerLocation();
		for(Car car : racePlayers) {
			if(car.getLocation().length() == winnerLocation) {
				winners.add(car.getName());
			}
		}
		return winners.toString();
	}
	
	public int getWinnerLocation() {
		int winnerLocation = 0;
		for(Car car : racePlayers) {
			winnerLocation = Math.max(winnerLocation, car.getLocation().length());
		}
		return winnerLocation;
	}
	
}
