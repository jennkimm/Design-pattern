package ch02.Sample;

// 어댑터 역할을 하는 클래스
public class PrintBanner extends Banner implements Print {
	
	//바로 부모의 인자없는 생성자가 호출이 되게 됨.
	public PrintBanner(String string) {
		//super 는 인자있는 생성자가 호출이 됨.
		//super(string);
		//인자있는 생성자 호출하는 문장은 항상 첫 문장으로 호출해주어야 함.
	}

	// Banner로부터 상속받은 showWithParen()을 호출한다.
	public void printWeak() {
		showWithParen();
	}

	// 상속받은 showWithAster( )를 호출한다.
	public void printStrong() {
		showWithAster();
	}
}
