package ch01.hw;

//��� Iterator �� ������ �� �޼ҵ带 ������ �������̽�
public interface Iterator {
	//���Ұ� �� �ִ��� �˻��� �� ���Ǵ� �޼ҵ�
	public abstract boolean hasNext();
	//Object ������ ������ ����: � Ÿ���� ���Ҹ� ��ȯ�� �� �𸣱� ������
	// Object �� ��� Ŭ������ �θ��̹Ƿ�,
	//Object ���� ��� Ÿ���� ��ü�� ����ų �� �ִ�.
	public abstract Object next(); // �� ���� ���Ҹ� ���� �� ���Ǵ� �޼ҵ� 
}

