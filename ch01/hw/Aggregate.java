package ch01.hw;

// ����ü�� �ڱ� ���ҵ��� ���ƴٴ� Iterator ��ü�� ��ȯ�ϴ� 
// iterator( ) �޼ҵ带 ������.
public interface Aggregate {
	// �� ����ü�� Iterator�� ��ȯ�ϴ� �޼ҵ� 
    public abstract Iterator iterator();
}

// interface��, ��� �޼ҵ��� body �κ��� ���� Ư���� Ŭ�����̴�.