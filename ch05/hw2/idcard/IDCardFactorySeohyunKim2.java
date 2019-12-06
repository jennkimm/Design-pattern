package ch05.hw2.idcard;

import java.util.Vector;

import ch05.hw2.framework.Product;
import ch05.hw2.idcard.IDCard;
import ch05.hw2.framework.*;

public class IDCardFactorySeohyunKim2 extends Factory {
		// Vector는 배열과 비슷하지만 전체 크기가 정해져 있지 않고
		// 원소를 추가하면 필요한 경우 크기가 늘어난다.
	    private Vector owners = new Vector();
	    
	    private static IDCardFactorySeohyunKim2 idcardfactory2 = null;
	    
	    private IDCardFactorySeohyunKim2() {
	    	System.out.println("인스턴스를 생성합니다.");
	    	slowdown();
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
	    
	    public Vector getOwners() {
	        return owners;
	    }
	    
	  //synchronized 는 스레드 하나만 들어오게 
	    public static synchronized IDCardFactorySeohyunKim2 getInstance() {
	    	if(idcardfactory2==null) {
	    		idcardfactory2=new IDCardFactorySeohyunKim2();
	    	}
	    	
	        return idcardfactory2;
	    }
	    
	    public void slowdown() {
	    	//CPU를 반납하고 잠을 잔다.
			//항상 오류발생가능성이 높아서 try-catch 문으로 둘러싸줘야 한다.
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }

}
