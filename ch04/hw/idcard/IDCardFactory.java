package ch04.hw.idcard;

import java.util.Hashtable;

import ch04.hw.idcard.IDCard;
import ch04.hw.framework.Factory;
import ch04.hw.framework.Product;
import ch04.hw.idcard.*;
import java.util.*;

public class IDCardFactory extends Factory {
	private Hashtable database = new Hashtable();
    private int serial = 100;
    
    protected synchronized Product createProduct(String owner) {
        return new IDCard_SeoHyunKim(owner, serial++);
    }
    
    protected void registerProduct(Product product) {
        IDCard_SeoHyunKim card = (IDCard_SeoHyunKim)product;
        database.put(card.getOwner(), new Integer(card.getSerial()));
    }
    
    public Hashtable getDatabase() {
        return database;
    }

}
