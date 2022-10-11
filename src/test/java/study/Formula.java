package study;

import org.junit.platform.commons.util.StringUtils;

public class Formula {
	
	//private String formula;
	private String[] formula;
	private final String splitMark = "";
	
	public Formula(String formula) {
		if(StringUtils.isBlank(formula)) {
			throw new IllegalStateException("입력 값이 공백입니다.");
		}
		this.formula = formula.split(splitMark);
	}
	
	
	public String[] getFormula() {
		return this.formula;
	}
	
	/**
	public String[] splitFormula() {
		return this.formula.split(" ");
	}
	*/
}
