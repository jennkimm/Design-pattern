package ch0.quiz;

public class A {
	private int result;
	private C c = new C();

	public int add(int x, int y) {
		result = x + c.m1(y);
		return result;
	}

}
