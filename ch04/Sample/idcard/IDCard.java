package ch04.Sample.idcard;

import ch04.Sample.framework.*;

public class IDCard extends Product {
    private String owner;

    // private�̳� public ���� ����Ǿ� ���� ������, 
    // ���� ��Ű���� ���� Ŭ�����鸸�� �� �����ڸ� ȣ���� �� �ִ�.
<<<<<<< HEAD
    public IDCard(String owner) {
=======
    IDCard(String owner) {
>>>>>>> 84c953f
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
