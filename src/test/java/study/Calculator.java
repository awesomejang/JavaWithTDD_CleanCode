package study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
	
	private int result = 0;
	private String currentOperator;
	private static final String regExp = "^[0-9]*$";
	
	public int calculate(String[] values) {
		for(String str :  values) {
			if(!Pattern.matches(regExp, str)) { // true = 숫자, false = 문자
				currentOperator = str;
			}else {
				OperatorCalculate(currentOperator, Integer.parseInt(str));
			}
		}
		return result;
	}
	
	private void OperatorCalculate(String currentOperator, int number) {
		switch(currentOperator != null ? currentOperator: "NULL") {
			case "+": 
				  plus(number);
				  break;
			case "-": 
				  minus(number);
				  break;
			case "*": 
				  multiply(number);
		          break;
			case "/": 
				  divide(number);
                  break;
			case "NULL":  
				 result = number;
		}
	}
	
	private void plus(int number) {
		this.result += number;
	}
	
	private void minus(int number) {
		this.result -= number;
	}
	
	private void multiply(int number) {
		this.result *= number;
	}
	
	private void divide(int number) {
		this.result /= number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		String[] values = value.split(" ");
		
		Calculator cal = new Calculator();
		System.out.println(cal.calculate(values));
	}

}
