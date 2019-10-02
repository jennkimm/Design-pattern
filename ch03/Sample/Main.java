package ch03.Sample;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractDisplay d1=new 하위클래스(); 
		AbstractDisplay d1=new CharDisplay('c');
		
		d1.display();

		
		AbstractDisplay d2=new StringDisplay("안녕하세요.");
		d2.display();
	}
}
