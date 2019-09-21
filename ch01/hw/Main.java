package ch01.hw;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("20171046 김서현");
		
		//책꽃이 테스트
		//책꽃이 생성
		BookShelf bs1=new BookShelf();
		
		//5권의 책을 꽃는다
		bs1.appendBook(new Book("자료구조론","박우창"));
		bs1.appendBook(new Book("소프트웨어분석설계","최승훈"));
		bs1.appendBook(new Book("프로그래머수학","이주영"));
		bs1.appendBook(new Book("컴퓨터동작원리","유견이"));
		bs1.appendBook(new Book("컴퓨터그래픽스","이경미"));
		
		System.out.println("책의 갯수: "+bs1.getLength());
		
		Iterator it=bs1.iterator();
		
		//***책꽃이를 직접 접근하지 않음***
		while(it.hasNext()) {
			Book book=(Book)it.next(); //오브젝트타입, 다운캐스팅
			System.out.println("책이름: "+book.getName()+", 작가: "+book.getAuthor());
		}
		
	}
}


