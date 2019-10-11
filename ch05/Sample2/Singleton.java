package ch05.Sample2;

//싱글턴 패턴 2번째 방법
public class Singleton {
	private static Singleton s=null;
	
	private Singleton() {
		System.out.println("인스턴스를 생성합니다.");
		slowdown(); //생성 시 시간을 오래 걸리게 함
	}
	
	//synchronized 는 스레드 하나만 들어오게 
	public static synchronized Singleton getInstance() {
		if(s==null) { //클라이언트가 getInstance()를 처음 호출했는지 검사	
			s=new Singleton();
		}
		return s;
	}
	
	//시간을 오래 걸리게 하는 메소드
	private void slowdown() {
		//CPU를 반납하고 잠을 잔다.
		//항상 오류발생가능성이 높아서 try-catch 문으로 둘러싸줘야 한다.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
