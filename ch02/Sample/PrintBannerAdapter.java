package ch02.Sample;

//����� �̿��� �����
public class PrintBannerAdapter extends Banner implements Print {
	
	//Banner Ŭ������ ���� ���ڰ� �ִ� �����ڸ� �־, �ڽĵ� �ݵ�� ��������� �Ѵ�.
	public PrintBannerAdapter(String string) {
		super(string); //������ �ȿ����� super�� �θ�����ڸ� �ǹ�.
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		//Banner ��ü�� showWithParen() �� ȣ���Ѵ�
		showWithParen(); //Banner ���� ��ӹ��� �޼ҵ带 ȣ����
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		//Banner ��ü�� showWithAster() �� ȣ���Ѵ�
		 showWithAster(); //Banner ���� ��ӹ��� �޼ҵ带 ȣ����
	}

}
