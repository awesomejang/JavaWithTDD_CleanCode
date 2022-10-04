package study;

class op {
	public int t;
	
	public op(int t) {
		this.t = t;
	}
	
	public int getT() {
		return this.t;
	}
}
public class Main {
	public static op oop = new op(5);
	
	public static void main(String[] args) {
		System.out.println(oop.getT());
		
		//System.out.println(Operator.valueOf("PLUS").name());
	}
}
