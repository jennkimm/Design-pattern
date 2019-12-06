package ch04.hw;

import ch04.hw.framework.*;
import ch04.hw.idcard.IDCardFactory;
import ch04.hw.tv.TVFactory;

public class Main {
    public static void main(String[] args) {
    	
    	System.out.println("20171046 �輭��");
    
        Factory factory = new IDCardFactory();
        
        //idcard�� �����Ѵ�
        Product card1 = factory.create("�ֽ���");
        Product card2 = factory.create("�輭��");
        
        //card�� ����Ѵ�
        card1.use();
        card2.use();
        
        Factory factory2 = new TVFactory();
        
        //tv�� �����Ѵ�
        Product tv1=factory2.create("20171046");
        Product tv2=factory2.create("111");
        Product tv3=factory2.create("222");
        Product tv4=factory2.create("333");
        
        //tv�� ����Ѵ�
        tv1.use();
        tv2.use();
        tv3.use();
        tv4.use();
        
        //iterator ������ ����� modelNos�� ����Ǿ� �ִ� �� ��ȣ���� �ϳ��� ����� �ͼ� ����Ѵ�.
        ((TVFactory)factory2).printAllModelNumbers();
        
    }

	
}
