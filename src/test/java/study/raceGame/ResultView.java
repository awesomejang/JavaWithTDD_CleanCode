package study.raceGame;

public class ResultView {
	public static void PrintResult(String winners) {
		System.out.println(winners + "가 최종 우승했습니다.");
		/**
		String[] winnerArray = winners.split(",");
		if(winnerArray.length == 1)  {
			System.out.println(winnerArray[0] + "가 최종 우승했습니다.");
		}else {
			for(String winner : winnerArray) {
				System.out.println();
			}
		}
		 */
	}
}
