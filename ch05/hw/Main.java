package ch05.hw;

import ch05.hw.TicketMaker;

public class Main extends Thread{
	
	public Main(String name) {
		super(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main("1234").start();
		new Main("5678").start();
		new Main("9101112").start();
		
	}
	
	public void run() {
		int tm=TicketMaker.getNextTicketNumber();
		System.out.println("티켓번호= "+tm);
	}

}
