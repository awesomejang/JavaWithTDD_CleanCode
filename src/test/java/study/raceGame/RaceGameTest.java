package study.raceGame;

public class RaceGameTest {
	public void playGame() {
		InputView inputView = InputView.getGameInfo(); // 게임시작
		for (int i = 0; i < inputView.getPlayers().length; i++) {
			System.out.println(inputView.getPlayers()[i]);
		}
	}
	
}
