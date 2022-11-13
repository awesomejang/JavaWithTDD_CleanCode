package study.raceGame;

import java.util.Arrays;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class RacePlayersTest {

	private RacePlayers racePlayers;
	
	@BeforeAll
	void setRacePlayers() {
		Car carA = new Car("A");
		carA.RunLocation();
		
		Car carB = new Car("B");
		carB.RunLocation();
		carB.RunLocation();
		
		Car carC = new Car("C");
		carC.RunLocation();
		carC.RunLocation();
		carC.RunLocation();
		
		Car carD = new Car("D");
		carD.RunLocation();
		carD.RunLocation();
		carD.RunLocation();
		
		List<Car> players =  Arrays.asList(carA, carB, carC, carD);
		racePlayers = new RacePlayers(players);
	}
	
	@Test
	void getWinnerTest() {
		String winners = racePlayers.getWinners();
		
		Assertions.assertThat(winners).isEqualTo("C,D");
	}
	
	@Test
	void getWinnerLocationTest() {
		int winnerLocation = this.racePlayers.getWinnerLocation();
		
		Assertions.assertThat(winnerLocation).isEqualTo(3);
	}
}
