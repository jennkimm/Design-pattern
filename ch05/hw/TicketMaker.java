package ch05.hw;

public class TicketMaker {
	private static TicketMaker tm=null;
	
	public static int ticket=1000;
	
	private TicketMaker() {
		System.out.println("인스턴스를 생성합니다.");

	}
	
	public static synchronized int getNextTicketNumber() {
		if(tm==null) {
			tm=new TicketMaker();
		}
		else {
			ticket++;
		}
		return ticket;
	}

	
}
