package ch05.Sample2;

public class Main extends Thread {
	
	public Main(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		// ������ ��ü 3���� ���� ���� �����ϵ��� ��Ŵ
		// start �޼ҵ�� �� �����ϰ� ��
		new Main("A").start(); //�ڵ����� A �������� run()�� ������
		new Main("B").start(); //�ڵ����� B �������� run()�� ������
		new Main("C").start(); //�ڵ����� C �������� run()�� ������
		
	}
	
	//Main ������ ��ü�� �� ��
	public void run() {
		Singleton s=Singleton.getInstance();
		System.out.println(getName()+": s�� �ּ� ="+s);
	}
}
