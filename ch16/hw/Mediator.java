package ch16.hw;

// ��ī������� ǥ���ϴ� �������̽�
public interface Mediator {
	// mediator�� �����ϴ� ����� �����ϴ� �޼ҵ�
	public abstract void createColleagues();

	// �� ����� ����㡯�� ��û�� �� ȣ���ϴ� �޼ҵ�
	// ���� ��ư�̳� �ؽ�Ʈ �ʵ��� ���°� ��ȭ���� ��, �� �޼ҵ尡 ȣ��ȴ�.
	public abstract void colleagueChanged(Colleague colleague); //�θ�Ÿ������ Colleague ����. 
	
}
