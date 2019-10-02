package ch02.Sample;

//상속을 이용한 어댑터
public class PrintBannerAdapter extends Banner implements Print {
	
	//Banner 클래스를 가면 인자가 있는 생성자만 있어서, 자식도 반드시 구현해줘야 한다.
	public PrintBannerAdapter(String string) {
		super(string); //생성자 안에서의 super는 부모생성자를 의미.
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		//Banner 객체의 showWithParen() 을 호출한다
		showWithParen(); //Banner 부터 상속받은 메소드를 호출함
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		//Banner 객체의 showWithAster() 을 호출한다
		 showWithAster(); //Banner 부터 상속받은 메소드를 호출함
	}

}
