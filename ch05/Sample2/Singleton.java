package ch05.Sample2;

//�̱��� ���� 2��° ���
public class Singleton {
	private static Singleton s=null;
	
	private Singleton() {
		System.out.println("�ν��Ͻ��� �����մϴ�.");
		slowdown(); //���� �� �ð��� ���� �ɸ��� ��
	}
	
	//synchronized �� ������ �ϳ��� ������ 
	public static synchronized Singleton getInstance() {
		if(s==null) { //Ŭ���̾�Ʈ�� getInstance()�� ó�� ȣ���ߴ��� �˻�	
			s=new Singleton();
		}
		return s;
	}
	
	//�ð��� ���� �ɸ��� �ϴ� �޼ҵ�
	private void slowdown() {
		//CPU�� �ݳ��ϰ� ���� �ܴ�.
		//�׻� �����߻����ɼ��� ���Ƽ� try-catch ������ �ѷ������ �Ѵ�.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
