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
	
	private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap(Stream.of(values()) // values() -> Operator객체의 요소 순차적으로 리턴
																						  .collect(Collectors.toMap(Operator::getSymbol, Operator::name)));
	
	private String getSymbol() {
		return this.symbol;
	}
	
	public int operate(int first, int second) {
		return operation.apply(first, second);
	}
	
	public static Operator findOperator(String symbol) {
		String operatorName = CODE_MAP.get(symbol);
		if(operatorName == null) throw new IllegalStateException("해당 기호는 지원하지 않습니다. [" + symbol + "]");
		return Operator.valueOf(operatorName);
	}
}
