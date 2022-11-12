package study.raceGame;

public class Main {
	public static void main(String[] args) {
		InputView inputView = InputView.getGameInfo(); 
		
		RaceGame raceGame = new RaceGame(inputView.getPlayers());
		raceGame.playGame(inputView.getCntGame());
		//new RaceGame().playGame();
	}
}
