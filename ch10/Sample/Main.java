package ch10.Sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		if(args.length==2) {
			
			System.out.println(args[0]);
			System.out.println(args[1]);
			
			// ����� ����(���ڿ�) 2���� ������ �ٲ�
			int seed1 = Integer.parseInt(args[0]);
			int seed2 = Integer.parseInt(args[1]);
			
		} else {
			System.out.println("����: ���� 2���� ���ڷ� ��������.");
			System.exit(0);
		}
		*/
		
		//�õ带 �ٸ��� �ؾ� ���� �ٸ� ����� ���´�.(Winning Strategy)
		Player p1=new Player("�輭��", new WinningStrategy(100));
		Player p2=new Player("�ֽ���", new ProbStrategy(150));
		
		//����� ��� ��������ִ� ��������� �տ� �ٿ���� �Ѵ�.
		//handvalue ���� ���������� �ϸ� �迭�ε����� Ȱ�밡��.
		
	    //Hand h1=Hand.getHand(Hand.HANDVALUE_PAA); //���ڱ�
	    //System.out.println(h1.toString());
	    
	    //Hand h2=Hand.getHand(Hand.HANDVALUE_GUU); //�ָ�
		//System.out.println(h2.toString());
		
		
		for(int i=0;i<1000;i++) {
			
			Hand h1=p1.nextHand();
			//System.out.println(h1.toString());
		
			Hand h2=p2.nextHand();
			//System.out.println(h2.toString());
		
			if(h1.isStrongerThan(h2)) {
				//System.out.println("h1 �� h2�� �̰���ϴ�.");
				p1.win();
				p2.lose();
			}
		
			else if (h1.isWeakerThan(h2)) {
				//System.out.println("h1 �� h2���� �����ϴ�.");
				p2.win();
				p1.lose();
			}
		
			else {
				//System.out.println("h1�� h2�� �����ϴ�.");
				p1.even();
				p2.even();
			}
		}

     	System.out.println("Result: ");
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
	
