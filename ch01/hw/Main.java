package ch01.hw;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("20171046 �輭��");
		
		//å���� �׽�Ʈ
		//å���� ����
		BookShelf bs1=new BookShelf();
		
		//5���� å�� �ɴ´�
		bs1.appendBook(new Book("�ڷᱸ����","�ڿ�â"));
		bs1.appendBook(new Book("����Ʈ����м�����","�ֽ���"));
		bs1.appendBook(new Book("���α׷��Ӽ���","���ֿ�"));
		bs1.appendBook(new Book("��ǻ�͵��ۿ���","������"));
		bs1.appendBook(new Book("��ǻ�ͱ׷��Ƚ�","�̰��"));
		
		System.out.println("å�� ����: "+bs1.getLength());
		
		Iterator it=bs1.iterator();
		
		//***å���̸� ���� �������� ����***
		while(it.hasNext()) {
			Book book=(Book)it.next(); //������ƮŸ��, �ٿ�ĳ����
			System.out.println("å�̸�: "+book.getName()+", �۰�: "+book.getAuthor());
		}
		
	}
}


