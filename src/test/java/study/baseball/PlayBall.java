package study.baseball;

import java.util.List;

public class PlayBall {

	private List<Integer> computerNumbers;
	private List<Integer> playerNumbers;
	//private Integer computerNumber;
	//private Integer playerNumber;
	
	public PlayBall(List<Integer> playerNumbers) {
		this.computerNumbers = NumberGenerator.createRandomNumbers();
		this.playerNumbers = playerNumbers;
	}

	public List<Integer> getComputerNumbers() {
		return computerNumbers;
	}

	public List<Integer> getPlayerNumbers() {
		return playerNumbers;
	}

}
