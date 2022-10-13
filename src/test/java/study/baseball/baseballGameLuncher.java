package study.baseball;

import java.util.Scanner;

public class baseballGameLuncher {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");
		String inputNumber = kb.next();
		
		System.out.println(new playGame(inputNumber).compareNumber());
		///
	}
	
}
