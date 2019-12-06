package ch17.Sample;

public class Main {
	public static void main(String[] args) {
		// RandomNumberGenerator �ν��Ͻ� 1 �� ������
		// ������ ���
		//NumberGenerator ng= new RandomNumberGenerator();
		//17-1
		NumberGenerator ng= new IncrementalNumberGenerator(10,50,5);
		
		/*
		 ng.execute();
		 System.out.println(ng.getNumber());
		 */
		
		//������
		Observer o1=new DigitObserver();
		Observer o2=new GraphObserver();
		Observer o3=new FrameObserver(); //17-2
		
		//�����ڸ� ������� �߰���
		ng.addObserver(o1);
		ng.addObserver(o2);
		ng.addObserver(o3);
		
		// ���� ��󿡰� ���� ������ ������
		ng.execute();
		
		/*
		// ������ 2�� ������
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		// RandomNumberGenerator�� ������ 2���� �����
		ng.addObserver(observer1);
		ng.addObserver(observer2);
		
		// RandomNumberGenerator�� execute( )�� �̿��ؼ� ���� �����Ѵ�
		ng.execute();
		// ������ �߻��� ������, �����ڵ��� ������ ��Ĵ�� ���� ��ǥ�á��Ѵ�.
		 
		 */
	}
}
