package ch03.hw;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractDisplay d1=new 하위클래스(); 
		AbstractDisplay d1=new CharDisplay('c');
		
		d1.display(3);

		
		AbstractDisplay d2=new StringDisplay("안녕하세요.");
		
		d2.display(7);
		
		AbstractDisplay d3=new KimSeoHyunDisplay("김서현", "20171046",3);
		d3.display(10);
		
		
	}
	
	
}
