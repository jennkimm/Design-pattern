package ch02.Sample;

// ����� ������ �ϴ� Ŭ����
public class PrintBanner extends Banner implements Print {
	
	//�ٷ� �θ��� ���ھ��� �����ڰ� ȣ���� �ǰ� ��.
	public PrintBanner(String string) {
		//super �� �����ִ� �����ڰ� ȣ���� ��.
		//super(string);
		//�����ִ� ������ ȣ���ϴ� ������ �׻� ù �������� ȣ�����־�� ��.
	}

	// Banner�κ��� ��ӹ��� showWithParen()�� ȣ���Ѵ�.
	public void printWeak() {
		showWithParen();
	}

	// ��ӹ��� showWithAster( )�� ȣ���Ѵ�.
	public void printStrong() {
		showWithAster();
	}
}
