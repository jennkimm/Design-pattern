package ch05.hw;

public class TicketMaker {
	private static TicketMaker tm=null;
	
	public static int ticket=1000;
	
	private TicketMaker() {
		System.out.println("�ν��Ͻ��� �����մϴ�.");

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
