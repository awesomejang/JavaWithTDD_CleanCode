package study.baseball;

public class PlayBall {

	private String computerNumber;
	private String playerNumber;
	
	public PlayBall(String playerNumber) {
		this.computerNumber = String.valueOf(NumberGenerator.createRandomNumbers());
		this.playerNumber = playerNumber;
	}

	public String getComputerNumber() {
		return computerNumber;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

}
