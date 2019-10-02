package ch03.hw;

public class KimSeoHyunDisplay extends AbstractDisplay{
	private String name;
	private String studentId;
	private int grade;
	
	//������
	public KimSeoHyunDisplay(String name, String studentId, int grade) {
		this.name=name;
		this.studentId=studentId;
		this.grade=grade;
	}
	
	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(1)
	protected void open() {
		System.out.println("===============================");
		System.out.println("�������� ��ǻ�Ͱ��а�");
	}

	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(2)
	public void print() {
		System.out.println("�̸�: "+name+" �й�: "+studentId+" �г�: "+grade);
	}

	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(3)
	public void close() {
		System.out.println("���ø� �޼ҵ� ���� �����Դϴ�.");
		System.out.println("===============================");
	}
		
	

}
