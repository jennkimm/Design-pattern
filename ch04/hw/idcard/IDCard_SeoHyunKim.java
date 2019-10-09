package ch04.hw.idcard;

import ch04.hw.framework.Product;

public class IDCard_SeoHyunKim extends Product{
	 private String owner;
	    private int serial;
	    
	    IDCard_SeoHyunKim(String owner, int serial) {
	        System.out.println(owner + "(" + serial + ")" + "�� ī�带 ����ϴ�.");
	        this.owner = owner;
	        this.serial = serial;
	    }
	    
	    public void use() {
	        System.out.println(owner + "(" + serial + ")" + "�� ī�带 ����մϴ�.");
	    }
	    public String getOwner() {
	        return owner;
	    }
	    public int getSerial() {
	        return serial;
	    }
}
