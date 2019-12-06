package ch04.A2.idcard;
import ch04.A2.framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
	//(key, value) 쌍을 저장함
    private Hashtable database = new Hashtable();
    private int serial = 100;
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        //제품을 등록 (key, value) => (이름, 시리얼번호)
        //시리얼 번호: 기본 자료형 int => integer 객체로  바꿔줌
        database.put(card.getOwner(), new Integer(card.getSerial())); // int -> integer 로 바뀜
    }
    public Hashtable getDatabase() {
        return database;
    }
}
