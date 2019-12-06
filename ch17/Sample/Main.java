package ch17.Sample;

public class Main {
	public static void main(String[] args) {
		// RandomNumberGenerator 인스턴스 1 개 생성함
		// 관찰자 대상
		//NumberGenerator ng= new RandomNumberGenerator();
		//17-1
		NumberGenerator ng= new IncrementalNumberGenerator(10,50,5);
		
		/*
		 ng.execute();
		 System.out.println(ng.getNumber());
		 */
		
		//관찰자
		Observer o1=new DigitObserver();
		Observer o2=new GraphObserver();
		Observer o3=new FrameObserver(); //17-2
		
		//관찰자를 관찰대상에 추가함
		ng.addObserver(o1);
		ng.addObserver(o2);
		ng.addObserver(o3);
		
		// 관찰 대상에게 숫자 생성을 지시함
		ng.execute();
		
		/*
		// 관찰자 2개 생성함
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		// RandomNumberGenerator에 관찰자 2개를 등록함
		ng.addObserver(observer1);
		ng.addObserver(observer2);
		
		// RandomNumberGenerator의 execute( )를 이용해서 수를 생성한다
		ng.execute();
		// 난수가 발생될 때마다, 관찰자들은 각자의 방식대로 수를 ‘표시’한다.
		 
		 */
	}
}
