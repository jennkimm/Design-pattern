package ch03.hw;

public class KimSeoHyunDisplay extends AbstractDisplay{
	private String name;
	private String studentId;
	private int grade;
	
	//생성자
	public KimSeoHyunDisplay(String name, String studentId, int grade) {
		this.name=name;
		this.studentId=studentId;
		this.grade=grade;
	}
	
	// 하위 클래스에 구현을 맡기는 추상메소드(1)
	protected void open() {
		System.out.println("===============================");
		System.out.println("덕성여대 컴퓨터공학과");
	}

	// 하위 클래스에 구현을 맡기는 추상메소드(2)
	public void print() {
		System.out.println("이름: "+name+" 학번: "+studentId+" 학년: "+grade);
	}

	// 하위 클래스에 구현을 맡기는 추상메소드(3)
	public void close() {
		System.out.println("템플릿 메소드 패턴 숙제입니다.");
		System.out.println("===============================");
	}
		
	

}
