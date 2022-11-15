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
		System.out.println(Constant.RACING_CARNAME_ANNOUNCEMENT);
		String player = sc.next();
		System.out.println(Constant.RACING_GAMECNT_ANNOUNCEMENT);
		int cntGame = sc.nextInt();
		return new InputView(player, cntGame);
	}
}
