package ch16.hw;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.Button;

import javax.swing.*;
import javax.swing.event.*;

public class ColleagueButton extends JButton implements Colleague {
	private Mediator mediator;

	public ColleagueButton(String caption) {
		//JButton button=new JButton(caption);
		super(caption);
	}

	// 입력 인자로 들어온 Mediator를 멤버 변수인 mediator에 할당함
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// Button 클래스에서 물려받은 setEnabled(boolean)를 호출하여 유효/무효를 설정한다.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled); // setEnabled( )는 부모인 Button 클래스로부터 물려받은 메소드이다.
	}
}

