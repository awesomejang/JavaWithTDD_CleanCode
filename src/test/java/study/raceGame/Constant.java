package study.raceGame;

public class Constant {

	private Constant() {};
	
	public static final String RACING_CARNAME_ANNOUNCEMENT = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
	public static final String RACING_GAMECNT_ANNOUNCEMENT = "시도할 회수는 몇회인가요?";
	public static final String RACING_GAMEWINNER_FORMAT_ANNOUNCEMENT = "%s가 최종 우승했습니다.";
	public static final String RACING_GAMEMID_FORMAT_ANNOUNCEMENT = "%s : %s";	
	//car.getName() + " " + ":" + " " + car.getLocation()
	public static final String RACING_RESULT_ANNOUNCEMENT = "실행결과";
	
	public static final int CAR_GOING_MIN_NUMBER = 4;
	public static final int CAR_NAME_MAX_LENGTH = 5;
	
	
	
	public static final String CARNAME_SPLIT_BORDER = ",";
	public static final String CAR_POSITION_INDEX = "-";
	
}
