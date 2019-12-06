package ch04.hw.tv;

import java.util.*;

import ch04.hw.framework.Factory;
import ch04.hw.framework.Product;


public class TVFactory extends Factory{
	private Vector ModelNos = new Vector();
	
	protected Product createProduct(String model) {
		return new TV_SeoHyunKim(model);
	}
	
	protected void registerProduct(Product product) {
		TV_SeoHyunKim model = (TV_SeoHyunKim)product;
        ModelNos.add(model.getModelNo());
	}
	
	 public Vector getDatabase() {
	    return ModelNos;
	 }
	 
	 public void printAllModelNumbers() {
		 Iterator it= ModelNos.iterator(); 
		 
		 while(it.hasNext()) { 
			 System.out.println(it.next());
		 }
	 }
	 
	 
	
}
