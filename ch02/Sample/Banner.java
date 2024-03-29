package ch02.Sample;

// 이미 존재하는 클래스
public class Banner {
	private String string;
	
	public Banner() {
		System.out.println("Banner() is called.");
	}
	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("[" + string + "]");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
