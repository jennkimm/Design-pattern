package ch01.Sample;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//�׽�Ʈ
		Book b1=new Book("å�̸�1");
		System.out.println(b1.getName());
		
		//å���� �׽�Ʈ
		BookShelf bs1=new BookShelf();
		/*BookShelf bs1=new BookShelf(10);*/
		bs1.appendBook(new Book("å0"));
		bs1.appendBook(new Book("å1"));
		bs1.appendBook(new Book("å2"));
		bs1.appendBook(new Book("å3"));
		
		System.out.println(bs1.getLength());
		
		//System.out.println(bs1.getBookFrom(0).getName());
		
		//iterator ������ �������� ����
		/*
		int size=bs1.getLength(); //�޼ҵ� ��� ȣ������ �ʾ� �� ����~
		for(int i=0;i<size;i++) {
			System.out.println(bs1.getBookFrom(i).getName());
		}
		*/
		
		//iterator ���� ����
		//Ʋ�� �ڵ�: �θ� Ÿ���� ��ü�� �ڽ� Ÿ���� ��ü�� �������� �ϱ� ����
		//BookShelfIterator it = bs1.iterator();
		//�Ųٷδ� �� = �ڽ� Ÿ���� ��ü�� �θ�Ÿ���� ��ü�� �������� �ϴ� ���� ��
		
		//�Ѵٸ���
		//�� �� �Ϲ����� Ÿ��. �θ�Ÿ������ �س����� �ڽ� �� �ƹ��ų� ����ų �� �����ϱ�
		Iterator it=bs1.iterator();
		//BookShelfIterator it2=(BookShelfIterator)bs1.iterator();
		
		//***å���̸� ���� �������� ����***
		while(it.hasNext()) {
			Book book=(Book)it.next(); //������ƮŸ��, �ٿ�ĳ����
			System.out.println(book.getName());
		}
		
		//Stack �� ����ü. iterator ���� ����Ǿ� �ִ�.
		Stack s1=new Stack();
		s1.iterator();
		
	}
}


