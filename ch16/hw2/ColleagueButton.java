package ch16.hw2;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;

	public ColleagueButton(String caption) { // caption==버튼에 나타나는 글자
		super(caption); // 부모생성자 =  Button // super(caption);이 없으면 인자없는 부모생성자가 만들어짐
	}

	// 입력 인자로 들어온 Mediator를 멤버 변수인 mediator에 할당함
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// Button 클래스에서 물려받은 setEnabled(boolean)를 호출하여 유효/무효를 설정한다.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled); // setEnabled( )는 부모인 Button 클래스로부터 물려받은 메소드이다. // this.이 앞에 생략
	}
}
