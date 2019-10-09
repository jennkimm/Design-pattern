package ch04.hw;

import ch04.hw.framework.*;
import ch04.hw.idcard.IDCardFactory;
import ch04.hw.tv.TVFactory;

public class Main {
    public static void main(String[] args) {
    	
    	System.out.println("20171046 김서현");
    
        Factory factory = new IDCardFactory();
        
        //idcard를 생성한다
        Product card1 = factory.create("최승훈");
        Product card2 = factory.create("김서현");
        
        //card를 사용한다
        card1.use();
        card2.use();
        
        Factory factory2 = new TVFactory();
        
        //tv를 생성한다
        Product tv1=factory2.create("20171046");
        Product tv2=factory2.create("111");
        Product tv3=factory2.create("222");
        Product tv4=factory2.create("333");
        
        //tv를 사용한다
        tv1.use();
        tv2.use();
        tv3.use();
        tv4.use();
        
        //iterator 패턴을 사용해 modelNos에 저장되어 있는 모델 번호들을 하나씩 끄집어내 와서 출력한다.
        ((TVFactory)factory2).printAllModelNumbers();
        
    }

	
}
