package ch02.Sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// (1) Banner(220V)�� ���� ����ϴ� ���
		Banner b1=new Banner("�ֽ���");
		
		b1.showWithParen();
		b1.showWithAster();
		
		
		// (2) ����͸� ����ϴ� ���
		Print p=new PrintBanner("�輭��"); //print�� �������̽�.. ���۷��� ������ ���� ����. ��ü������ �Ұ�.. 
		
		p.printWeak();
		p.printStrong();
		
	}

}
