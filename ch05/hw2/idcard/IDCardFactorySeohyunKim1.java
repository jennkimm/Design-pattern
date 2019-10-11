package ch05.hw2.idcard;

import ch05.hw2.framework.Product;

import ch05.hw2.idcard.IDCard;

import java.util.Vector;

import ch05.hw2.framework.*;

public class IDCardFactorySeohyunKim1 extends Factory {
		// Vector는 배열과 비슷하지만 전체 크기가 정해져 있지 않고
		// 원소를 추가하면 필요한 경우 크기가 늘어난다.
	    private Vector owners = new Vector();
	    
	    //속성에서 미리 생성하는 방식
	    private static IDCardFactorySeohyunKim1 idcardfactory=new IDCardFactorySeohyunKim1();
	    
	    private IDCardFactorySeohyunKim1(){
	    	System.out.println("인스턴스를 생성합니다.");
	    }

		// 이 공장의 제품인 IDCard를 생산한다.
	    protected Product createProduct(String owner) {
	        return new IDCard(owner);
	    }

		// 생산된 제품의 owner를 등록(추가)한다.
	    protected void registerProduct(Product product) {
	        // product 를 IDCard로 형변환해야, getOwner()를 호출할 수 있다.
			owners.add(((IDCard)product).getOwner());
	    }
	    
	    public Vector getOwner() {
	        return owners;
	    }
	    
	    public static IDCardFactorySeohyunKim1 getInstance() {
	    	return idcardfactory;
	    }

}
