package ch05.Sample2;

public class Main extends Thread {
	
	public Main(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		// 스레드 객체 3개를 만들어서 일을 시작하도록 시킴
		// start 메소드로 일 시작하게 함
		new Main("A").start(); //자동으로 A 스레드의 run()을 실행함
		new Main("B").start(); //자동으로 B 스레드의 run()을 실행함
		new Main("C").start(); //자동으로 C 스레드의 run()을 실행함
		
	}
	
	//Main 스레드 객체가 할 일
	public void run() {
		Singleton s=Singleton.getInstance();
		System.out.println(getName()+": s의 주소 ="+s);
	}
}
