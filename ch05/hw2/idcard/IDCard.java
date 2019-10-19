package ch05.hw2.idcard;

import ch05.hw2.framework.*;

public class IDCard extends Product {
    private String owner;

    // private�̳� public ���� ����Ǿ� ���� ������, 
    // ���� ��Ű���� ���� Ŭ�����鸸�� �� �����ڸ� ȣ���� �� �ִ�.
    IDCard(String owner) {
        System.out.println(owner + "�� ī�带 ����ϴ�.");
        this.owner = owner;
    }
    
    public void use() {
        System.out.println(owner + "�� ī�带 ����մϴ�.");
    }
    
    public String getOwner() {
        return owner; 
    }

}