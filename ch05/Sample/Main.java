package ch05.Sample;

public class Main {
	
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance(); // getInstance�� static���� �������
		Singleton s2= Singleton.getInstance(); // getInstance�� static���� �������
	
		System.out.println("s1�� �ּ�: "+s1);
		System.out.println("s2�� �ּ�: "+s2);
	
	if(s1==s2) {
		System.out.println("s1�� s2�� �ּҰ� �����ϴ�.");
	}
	
	else
	{
		System.out.println("s1�� s2�� �ּҰ� �ٸ��ϴ�.");
	}
	
}
}
