package study.raceGame;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class RacePlayers {

	private List<Car> racePlayers;
	private int winnerLocation = 0;
	
	public RacePlayers(List<Car> racePlayers) {
		this.racePlayers = racePlayers; 
	}
	
	public List<Car> getRacePlayers() {
		return this.racePlayers;
	}
	
	public String getWinners() {
		//StringJoiner winners = new StringJoiner(",");
		int winnerLocation = getWinnerLocation();
		return racePlayers.stream().filter(car -> car.getLocation().length() == winnerLocation)
								   .map(car -> car.getName())
		                           .collect(Collectors.joining(","));
		
	}
	
	public int getWinnerLocation() {
		//int winnerLocation = 0;
		for(Car car : racePlayers) {
			winnerLocation = Math.max(winnerLocation, car.getLocation().length());
		}
		return winnerLocation;
	}
	
}
