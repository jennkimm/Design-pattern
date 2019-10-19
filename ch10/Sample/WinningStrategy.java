package ch10.Sample;

import java.util.Random;

//����Ŭ����
//����: ���� ���� �̰����� �� ���� �״�� ����.
public class WinningStrategy implements Strategy {
	
	//�������� �̰���� ������ ������
	private boolean won=false;
	
	 //�������� �´� ��
	 private Hand prevHand;
	 
	 private Random random;
	 
	 public WinningStrategy(int seed) {
		 random=new Random(seed);
	 }
	
	@Override
	public Hand nextHand() {
		//TODO Auto0generated method stub
		//���� ���� �̰����� �׶� �� ���� �״�� ����.
		if(won) {
			 return prevHand;
		 }
		
		//�׷��� ������ ���� �߻���Ų��.
		else {
			prevHand=Hand.getHand(random.nextInt(3));
			return prevHand;
		}
		
	}

	//�÷��̾ �̰���� ������ �˷��ִ� �޼ҵ�
	@Override
	public void study(boolean win) {
		// TODO Auto-generated method stub
		won=win;
	}
	
	
    
}
