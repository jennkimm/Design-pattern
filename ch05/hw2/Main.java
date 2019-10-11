package ch05.hw2;

import ch05.hw2.framework.*;
import ch05.hw2.idcard.IDCardFactorySeohyunKim1;
import ch05.hw2.idcard.IDCardFactorySeohyunKim2;
import ch05.hw2.idcard.IDCard;

public class Main extends Thread{
	public Main(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		//IDCardFactorySeohyunKim1 테스트하기
		IDCardFactorySeohyunKim1 idfac1=IDCardFactorySeohyunKim1.getInstance();// getInstance가 static으로 만들어짐
		IDCardFactorySeohyunKim1 idfac2=IDCardFactorySeohyunKim1.getInstance();// getInstance가 static으로 만들어짐

		if(idfac1==idfac2) {
			System.out.println("factory1과 factory2는 같은 인스턴스 입니다.");
		}

		else
		{
			System.out.println("factory1과 factory2는 다른 인스턴스 입니다.");
		}
		
		//IDCardFactorySeohyunKim2 테스트하기
		new Main("최승훈").start();
		new Main("김서현").start();
		new Main("강지연").start();
		
	}
	
	//Main 스레드 객체가 할 일
		public void run() {
			IDCardFactorySeohyunKim2 idfac3=IDCardFactorySeohyunKim2.getInstance();
			System.out.println(getName()+": idfac3의 주소 ="+idfac3);
		}
}