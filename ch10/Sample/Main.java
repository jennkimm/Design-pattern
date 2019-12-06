package ch10.Sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		if(args.length==2) {
			
			System.out.println(args[0]);
			System.out.println(args[1]);
			
			// 명령행 인자(문자열) 2개를 정수로 바꿈
			int seed1 = Integer.parseInt(args[0]);
			int seed2 = Integer.parseInt(args[1]);
			
		} else {
			System.out.println("사용법: 숫자 2개를 인자로 넣으세요.");
			System.exit(0);
		}
		*/
		
		//시드를 다르게 해야 서로 다른 결과가 나온다.(Winning Strategy)
		Player p1=new Player("김서현", new WinningStrategy(100));
		Player p2=new Player("최승훈", new ProbStrategy(150));
		
		//상수가 어디에 만들어져있는 상수인지를 앞에 붙여줘야 한다.
		//handvalue 값을 정수형으로 하면 배열인덱스로 활용가능.
		
	    //Hand h1=Hand.getHand(Hand.HANDVALUE_PAA); //보자기
	    //System.out.println(h1.toString());
	    
	    //Hand h2=Hand.getHand(Hand.HANDVALUE_GUU); //주먹
		//System.out.println(h2.toString());
		
		
		for(int i=0;i<1000;i++) {
			
			Hand h1=p1.nextHand();
			//System.out.println(h1.toString());
		
			Hand h2=p2.nextHand();
			//System.out.println(h2.toString());
		
			if(h1.isStrongerThan(h2)) {
				//System.out.println("h1 이 h2를 이겼습니다.");
				p1.win();
				p2.lose();
			}
		
			else if (h1.isWeakerThan(h2)) {
				//System.out.println("h1 이 h2에게 졌습니다.");
				p2.win();
				p1.lose();
			}
		
			else {
				//System.out.println("h1과 h2가 비겼습니다.");
				p1.even();
				p2.even();
			}
		}

     	System.out.println("Result: ");
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
	
