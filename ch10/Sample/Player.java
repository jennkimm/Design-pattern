package ch10.Sample;

public class Player {
	private String name;
	//*********중요**********player가 자신의 전략을 가지고 있는 속성****************
	//타입이 strategy = 부모타입으로 선언 -> prob/ winning 전략 둘다 가질 수 있다.
	private Strategy strategy;

	private int wincount;

	private int losecount;

	private int gamecount;

//	 이름과 전략을 인자로 전달받는다.
	public Player(String name, Strategy strategy) { 
		this.name = name;
		this.strategy = strategy; 
	}

	//다음 손을 내밀때 사용. 자기가 결정하지 않고 전략한테 맡김 = !!위임!!
	public Hand nextHand() { // 전략의 지시를 받는다.
		return strategy.nextHand(); //다음에 내밀 손을 전략 객체에게 위임.
	}

	// 이겼을 때 호출되는 메소드
	public void win() { 
		strategy.study(true); //승부결과를 전략 객체에게 알려줌.
		wincount++;
		gamecount++;
	}
	
//	졌을 때 호출되는 메소드
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	
//	비겼을 때 호출되는 메소드
	public void even() { // 무승부
		gamecount++;
	}

	public String toString() {
		return "[" + name + " / 이전 성적:" + gamecount + " games, " + wincount
				+ " win, " + losecount + " lose" + "]";
	}
}
