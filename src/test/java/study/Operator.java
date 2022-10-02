package study;

import java.util.function.BiFunction;

public enum Operator {
	
	PLUS("+", (first, second) -> first + second), 
	MINUS("-", (first, second) -> first - second), 
	MULTIPLY("*", (first, second) -> first - second), 
	DIVIDE("/", (first, second) -> first / second);
	
	private final String symbol;
	private final BiFunction<Integer, Integer, Integer> operation;
	
	Operator(String symbol, BiFunction<Integer, Integer, Integer> operation) {
		this.symbol = symbol;
		this.operation = operation;
	}
	
	public int operate(int first, int second) {
		return operation.apply(first, second);
	}
	
	public static Operator findOperator(String symbol) {
		return Operator.valueOf(symbol);
	}
	
	
}
