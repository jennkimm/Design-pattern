package ch03.hw;

// 추상 클래스 AbstractDisplay
public abstract class AbstractDisplay {
	// 하위 클래스에 구현을 맡기는 추상메소드(1)
	protected abstract void open();

	// 하위 클래스에 구현을 맡기는 추상메소드(2)
	public abstract void print();

	// 하위 클래스에 구현을 맡기는 추상메소드(3)
	public abstract void close();

	// 추상 클래스에서 구현하고 있는 메소드 display
	// 전반적인 흐름(메시지 호출 순서)를 결정한다. ==> 템플릿메소드
	// final == 자식이 오버라이드 못하게 한다 why? 큰 흐름은 자식이 못건들이게 하려고!
	public final void display(int times) {
		// 우선 open하고...
		//open,print,close 추상메소드로서, 어떻게 하는지 결정이 되어있지 않다 ==> 구현은 하위클래스가 한다.
		//전체적인 흐름은 결정이 되어있다.
		open();

		// times번 print를 반복
		for (int i = 0; i < times; i++) {
			print();
		}
		
		// 마지막으로 close한다. 
		close();
	}
}
