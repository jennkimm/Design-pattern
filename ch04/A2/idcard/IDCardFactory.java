package ch04.A2.idcard;
import ch04.A2.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	//(key, value) ���� ������
    private Hashtable database = new Hashtable();
    private int serial = 100;
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        //��ǰ�� ��� (key, value) => (�̸�, �ø����ȣ)
        //�ø��� ��ȣ: �⺻ �ڷ��� int => integer ��ü��  �ٲ���
        database.put(card.getOwner(), new Integer(card.getSerial())); // int -> integer �� �ٲ�
    }
    public Hashtable getDatabase() {
        return database;
    }
}
