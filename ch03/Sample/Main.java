package ch03.Sample;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AbstractDisplay d1=new ����Ŭ����(); 
		AbstractDisplay d1=new CharDisplay('c');
		
		d1.display();

		
		AbstractDisplay d2=new StringDisplay("�ȳ��ϼ���.");
		d2.display();
	}
}
