package ch05.Sample;

//싱글턴 패턴 적용하기
public class Singleton {
	//(3) 현재 클래스의 인스턴스를 미리 하나 만들어 놓는다.
	private static Singleton s=new Singleton(); //클래스가 메모리에 로드될 때 실행됨
		//(1)생성자를 프라이빗으로 한다.
		private Singleton() {
			System.out.println("인스턴스를 생성합니다.");
		}
	
		//(2)현재 클래스의 인스턴스를 얻어갈 메소드를 만든다.
		public static Singleton getInstance() {
			return s; //항상 내부적으로 만들어진 s를 리턴받기 때문에 하나만 만들어 질 수밖에 없다.
		}

}
