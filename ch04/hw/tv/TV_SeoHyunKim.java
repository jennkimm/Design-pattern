package ch04.hw.tv;

import ch04.hw.framework.*;

public class TV_SeoHyunKim extends Product {
	
	private String modelNo;

	public TV_SeoHyunKim(String modelNo) {
		this.modelNo=modelNo;
	}
	
	public void use() {
		System.out.println("�𵨹�ȣ "+modelNo+"�� TV�� ����մϴ�.");
	}
	
	public String getModelNo() {
		return modelNo;
	}
	
}
