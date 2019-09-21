package ch01.Sample;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//테스트
		Book b1=new Book("책이름1");
		System.out.println(b1.getName());
		
		//책꽃이 테스트
		BookShelf bs1=new BookShelf();
		/*BookShelf bs1=new BookShelf(10);*/
		bs1.appendBook(new Book("책0"));
		bs1.appendBook(new Book("책1"));
		bs1.appendBook(new Book("책2"));
		bs1.appendBook(new Book("책3"));
		
		System.out.println(bs1.getLength());
		
		//System.out.println(bs1.getBookFrom(0).getName());
		
		//iterator 패턴을 적용하지 않음
		/*
		int size=bs1.getLength(); //메소드 계속 호출하지 않아 더 괜찮~
		for(int i=0;i<size;i++) {
			System.out.println(bs1.getBookFrom(i).getName());
		}
		*/
		
		//iterator 패턴 적용
		//틀린 코드: 부모 타입의 객체를 자식 타입의 객체가 받으려고 하기 때문
		//BookShelfIterator it = bs1.iterator();
		//거꾸로는 됨 = 자식 타입의 객체를 부모타입의 객체가 받으려고 하는 것은 됨
		
		//둘다맞음
		//좀 더 일반적인 타입. 부모타입으로 해놓으면 자식 중 아무거나 가르킬 수 있으니까
		Iterator it=bs1.iterator();
		//BookShelfIterator it2=(BookShelfIterator)bs1.iterator();
		
		//***책꽃이를 직접 접근하지 않음***
		while(it.hasNext()) {
			Book book=(Book)it.next(); //오브젝트타입, 다운캐스팅
			System.out.println(book.getName());
		}
		
		//Stack 은 집합체. iterator 패턴 적용되어 있다.
		Stack s1=new Stack();
		s1.iterator();
		
	}
}


