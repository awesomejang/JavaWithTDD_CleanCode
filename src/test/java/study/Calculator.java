package study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
	
	private int result;
	private Operator currentOperator;
	private static final String regExp = "^[0-9]*$";
	
	public int calculate(String[] values) {
		result = 0;
		for(String input : values) {
			calculateProcess(input);
		}
		return result;
	}
	
	private void calculateProcess(String input) {
		if(isNumber(input)) {
			runOperate(Integer.parseInt(input));
			return;
		}
		currentOperator = Operator.findOperator(input);
	}
	
	private boolean isNumber(String input) {
		return Pattern.matches(regExp, input);
	}
	
	private void runOperate(int input) {
		if(currentOperator == null) {
			result = input;
			return;
		}
		result = currentOperator.operate(result, input);
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
		//String[] values = value.split(" ");
		String[] values = new Formula(value).splitFormula();
		
		Calculator cal = new Calculator();
		System.out.println(cal.calculate(values));
	}

}
