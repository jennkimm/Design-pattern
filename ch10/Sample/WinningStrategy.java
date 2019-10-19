package ch10.Sample;

import java.util.Random;

//전략클래스
//전략: 이전 번에 이겼으면 그 손을 그대로 낸다.
public class WinningStrategy implements Strategy {
	
	//지난번에 이겼는지 졌는지 저장함
	private boolean won=false;
	
	 //지난번에 냈던 손
	 private Hand prevHand;
	 
	 private Random random;
	 
	 public WinningStrategy(int seed) {
		 random=new Random(seed);
	 }
	
	@Override
	public Hand nextHand() {
		//TODO Auto0generated method stub
		//지난 번에 이겼으면 그때 낸 것을 그대로 낸다.
		if(won) {
			 return prevHand;
		 }
		
		//그렇지 않으면 새로 발생시킨다.
		else {
			prevHand=Hand.getHand(random.nextInt(3));
			return prevHand;
		}
		
	}

	//플레이어가 이겼는지 졌는지 알려주는 메소드
	@Override
	public void study(boolean win) {
		// TODO Auto-generated method stub
		won=win;
	}
	
	
    
}
