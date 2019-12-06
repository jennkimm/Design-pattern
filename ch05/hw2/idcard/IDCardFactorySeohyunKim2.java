package ch05.hw2.idcard;

import java.util.Vector;

import ch05.hw2.framework.Product;
import ch05.hw2.idcard.IDCard;
import ch05.hw2.framework.*;

public class IDCardFactorySeohyunKim2 extends Factory {
		// Vector�� �迭�� ��������� ��ü ũ�Ⱑ ������ ���� �ʰ�
		// ���Ҹ� �߰��ϸ� �ʿ��� ��� ũ�Ⱑ �þ��.
	    private Vector owners = new Vector();
	    
	    private static IDCardFactorySeohyunKim2 idcardfactory2 = null;
	    
	    private IDCardFactorySeohyunKim2() {
	    	System.out.println("�ν��Ͻ��� �����մϴ�.");
	    	slowdown();
	    }

		// �� ������ ��ǰ�� IDCard�� �����Ѵ�.
	    protected Product createProduct(String owner) {
	        return new IDCard(owner);
	    }

		// ����� ��ǰ�� owner�� ���(�߰�)�Ѵ�.
	    protected void registerProduct(Product product) {
	        // product �� IDCard�� ����ȯ�ؾ�, getOwner()�� ȣ���� �� �ִ�.
			owners.add(((IDCard)product).getOwner());
	    }
	    
	    public Vector getOwners() {
	        return owners;
	    }
	    
	  //synchronized �� ������ �ϳ��� ������ 
	    public static synchronized IDCardFactorySeohyunKim2 getInstance() {
	    	if(idcardfactory2==null) {
	    		idcardfactory2=new IDCardFactorySeohyunKim2();
	    	}
	    	
	        return idcardfactory2;
	    }
	    
	    public void slowdown() {
	    	//CPU�� �ݳ��ϰ� ���� �ܴ�.
			//�׻� �����߻����ɼ��� ���Ƽ� try-catch ������ �ѷ������ �Ѵ�.
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }

}
