package ch03.hw;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractDisplay d1=new ����Ŭ����(); 
		AbstractDisplay d1=new CharDisplay('c');
		
		d1.display(3);

		
		AbstractDisplay d2=new StringDisplay("�ȳ��ϼ���.");
		
		d2.display(7);
		
		AbstractDisplay d3=new KimSeoHyunDisplay("�輭��", "20171046",3);
		d3.display(10);
		
		
	}
	
	
}
