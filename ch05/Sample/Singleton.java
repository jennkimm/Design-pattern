package ch05.Sample;

//�̱��� ���� �����ϱ�
public class Singleton {
	//(3) ���� Ŭ������ �ν��Ͻ��� �̸� �ϳ� ����� ���´�.
	private static Singleton s=new Singleton(); //Ŭ������ �޸𸮿� �ε�� �� �����
		//(1)�����ڸ� �����̺����� �Ѵ�.
		private Singleton() {
			System.out.println("�ν��Ͻ��� �����մϴ�.");
		}
	
		//(2)���� Ŭ������ �ν��Ͻ��� �� �޼ҵ带 �����.
		public static Singleton getInstance() {
			return s; //�׻� ���������� ������� s�� ���Ϲޱ� ������ �ϳ��� ����� �� ���ۿ� ����.
		}

}
