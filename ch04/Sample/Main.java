package ch04.Sample;

import ch04.Sample.framework.*;
<<<<<<< HEAD

=======
>>>>>>> 84c953f
import ch04.Sample.idcard.*;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
      //(1) IDCard 직접생산
      //IDCard id1 = new IDCard("김서현");
      //id1.use();

      //(2) IDCard를 공장을 통해서 샌산
    	Factory f1=new IDCardFactory();
    	f1.create("최승훈"); //신분증 생성 및 등록을 함.
    	//항상 직접 안하고 누구를 통해서 하는 간접화.
    	//직접 객체를 만들지 않고 공장을 통해서 만든다.
    	//클라이언트입장에서는 편하죠. 공장한테만 부탁하면 알아서 해준다.
    	
    	Product id1=f1.create("최승훈"); //신분증 생성 및 등록을 함
    	id1.use();
    	
    	f1.create("최1");
    	f1.create("최2");
    	f1.create("최3");
    	f1.create("최4");
    	f1.create("최5");
    	
    	
    	System.out.println(((IDCardFactory)f1).getOwners() );
      
      
=======

      // IDCard( ) 생성자가 public이 아니라, 아래 문장은 오류가 발생한다.	
      //IDCard card1 = new IDCard("홍길동");

		// 공장을 세운다.
        Factory factory = new IDCardFactory();
        
		// 공장을 이용해서 제품(IDCard를 생산한다) 
		Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("강감찬");

		// 생산된 제품을 사용한다.
        card1.use();
        card2.use();
        card3.use();
>>>>>>> 84c953f
    }
}
