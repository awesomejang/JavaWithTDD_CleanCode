package study;

import java.util.Collections;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operator {
	
	PLUS("+", (first, second) -> first + second), 
	MINUS("-", (first, second) -> first - second), 
	MULTIPLY("*", (first, second) -> first * second), 
	DIVIDE("/", (first, second) -> first / second);
	
	private final String symbol;
	private final BiFunction<Integer, Integer, Integer> operation;
	
	Operator(String symbol, BiFunction<Integer, Integer, Integer> operation) {
		this.symbol = symbol;
		this.operation = operation;
	}
	
	private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap(Stream.of(values()).collect(Collectors.toMap(Operator::getSymbol, Operator::name)));
	
	private String getSymbol() {
		return this.symbol;
	}
	
	public int operate(int first, int second) {
		System.out.println("first = " + first + "se = " + second);
		return operation.apply(first, second);
	}
	
	public static Operator findOperator(String symbol) {
		return Operator.valueOf(CODE_MAP.get(symbol));
	}
	
	
}
