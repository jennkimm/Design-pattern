package ch11.Sample;

public abstract class Entry {
	public abstract String getName(); // �̸��� ��´�.

	public abstract int getSize(); // ����� ��´�.

	public Entry add(Entry entry) throws FileTreatmentException {
		// �� Ŭ������ �ٸ� ��Ʈ���� �߰��Ϸ��� �ϸ�, ���ܸ� �߻���Ų��.
		// "�ڽ��� ó������ �ʰ�, �� �޼ҵ带 ȣ���� ��ü�� ���Ľ�Ų��"��� ����Ǿ� ����.
		throw new FileTreatmentException(); //���� ��ü�� ����
	}

	//�޼ҵ� �����ε�
	//printList�� �����ε��� �� �����̴�.
	//1) ���ڰ� ���� �κ�, �� ������ �Ǿ��ְ�
	public void printList() { // �϶��� ǥ���Ѵ�.
		//Ŭ���̾�Ʈ�� ���ھ��� ȣ���Ҷ� �ƹ��͵����� null���ڿ��� ���� ȣ��. 
		printList("");
	}

	//2) ���ڰ� �ִ� �κ�, �߻�Ŭ������ �Ǿ��ֳ�..?
	protected abstract void printList(String prefix); // prefix�� �տ� �ٿ��� �϶���
														// ǥ���Ѵ�.

	public String toString() { // ���ڿ� ǥ��
		return getName() + " (" + getSize() + ")";
	}
}
