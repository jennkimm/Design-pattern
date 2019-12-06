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
		//IDCardFactorySeohyunKim1 �׽�Ʈ�ϱ�
		IDCardFactorySeohyunKim1 idfac1=IDCardFactorySeohyunKim1.getInstance();// getInstance�� static���� �������
		IDCardFactorySeohyunKim1 idfac2=IDCardFactorySeohyunKim1.getInstance();// getInstance�� static���� �������

		if(idfac1==idfac2) {
			System.out.println("factory1�� factory2�� ���� �ν��Ͻ� �Դϴ�.");
		}

		else
		{
			System.out.println("factory1�� factory2�� �ٸ� �ν��Ͻ� �Դϴ�.");
		}
		
		//IDCardFactorySeohyunKim2 �׽�Ʈ�ϱ�
		new Main("�ֽ���").start();
		new Main("�輭��").start();
		new Main("������").start();
		
	}
	
	//Main ������ ��ü�� �� ��
		public void run() {
			IDCardFactorySeohyunKim2 idfac3=IDCardFactorySeohyunKim2.getInstance();
			System.out.println(getName()+": idfac3�� �ּ� ="+idfac3);
		}
}