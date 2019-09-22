package ch02.Sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (1) Banner(220V)를 직접 사용하는 경우
		Banner b1=new Banner("최승훈");
		
		b1.showWithParen();
		b1.showWithAster();
		
		
		// (2) 어댑터를 사용하는 경우
		Print p=new PrintBanner("김서현"); //print는 인터페이스.. 레퍼런스 변수만 생성 가능. 객체생성은 불가.. 
		
		p.printWeak();
		p.printStrong();
		
	}

}
