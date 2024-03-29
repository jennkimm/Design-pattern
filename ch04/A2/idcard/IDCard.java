package ch04.A2.idcard;

import ch04.A2.framework.*;

public class IDCard extends Product {
    private String owner;
    private int serial;
    
    IDCard(String owner, int serial) {
    	super(owner, serial);
        System.out.println(owner + "(" + serial + ")" + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println(owner + "(" + serial + ")" + "의 카드를 사용합니다.");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
