package ch04.hw.tv;

import ch04.hw.framework.*;

public class TV_SeoHyunKim extends Product {
	
	private String modelNo;

	public TV_SeoHyunKim(String modelNo) {
		this.modelNo=modelNo;
	}
	
	public void use() {
		System.out.println("모델번호 "+modelNo+"인 TV를 사용합니다.");
	}
	
	public String getModelNo() {
		return modelNo;
	}
	
}
