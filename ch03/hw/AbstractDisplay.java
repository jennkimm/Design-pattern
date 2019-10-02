package ch03.hw;

// �߻� Ŭ���� AbstractDisplay
public abstract class AbstractDisplay {
	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(1)
	protected abstract void open();

	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(2)
	public abstract void print();

	// ���� Ŭ������ ������ �ñ�� �߻�޼ҵ�(3)
	public abstract void close();

	// �߻� Ŭ�������� �����ϰ� �ִ� �޼ҵ� display
	// �������� �帧(�޽��� ȣ�� ����)�� �����Ѵ�. ==> ���ø��޼ҵ�
	// final == �ڽ��� �������̵� ���ϰ� �Ѵ� why? ū �帧�� �ڽ��� ���ǵ��̰� �Ϸ���!
	public final void display(int times) {
		// �켱 open�ϰ�...
		//open,print,close �߻�޼ҵ�μ�, ��� �ϴ��� ������ �Ǿ����� �ʴ� ==> ������ ����Ŭ������ �Ѵ�.
		//��ü���� �帧�� ������ �Ǿ��ִ�.
		open();

		// times�� print�� �ݺ�
		for (int i = 0; i < times; i++) {
			print();
		}
		
		// ���������� close�Ѵ�. 
		close();
	}
}
