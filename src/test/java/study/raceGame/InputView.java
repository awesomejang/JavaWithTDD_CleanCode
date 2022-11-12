package study.raceGame;

import java.util.Scanner;

public class InputView {
	private String[] players;
	private int cntGame;
	
	private InputView(String players, int cntGame) {
		this.players = players.split(Constant.CARNAME_SPLIT_BORDER);
		this.cntGame = cntGame;
	}
	
	public String[] getPlayers() {
		return players;
	}

	public int getCntGame() {
		return cntGame;
	}

	public static InputView getGameInfo() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		String player = sc.next();
		System.out.println("시도할 회수는 몇회인가요?");
		int cntGame = sc.nextInt();
		return new InputView(player, cntGame);
	}
}
