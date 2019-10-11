package ch05.hw2.idcard;

import ch05.hw2.framework.Product;

import ch05.hw2.idcard.IDCard;

import java.util.Vector;

import ch05.hw2.framework.*;

public class IDCardFactorySeohyunKim1 extends Factory {
		// Vector�� �迭�� ��������� ��ü ũ�Ⱑ ������ ���� �ʰ�
		// ���Ҹ� �߰��ϸ� �ʿ��� ��� ũ�Ⱑ �þ��.
	    private Vector owners = new Vector();
	    
	    //�Ӽ����� �̸� �����ϴ� ���
	    private static IDCardFactorySeohyunKim1 idcardfactory=new IDCardFactorySeohyunKim1();
	    
	    private IDCardFactorySeohyunKim1(){
	    	System.out.println("�ν��Ͻ��� �����մϴ�.");
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
	    
	    public Vector getOwner() {
	        return owners;
	    }
	    
	    public static IDCardFactorySeohyunKim1 getInstance() {
	    	return idcardfactory;
	    }

}
