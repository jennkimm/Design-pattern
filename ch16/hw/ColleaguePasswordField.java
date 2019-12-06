package ch16.hw;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;

import javax.swing.*;
import javax.swing.event.*;

public class ColleaguePasswordField extends JPasswordField implements KeyListener, Colleague{
	private Mediator mediator;
	
	public ColleaguePasswordField(String text, int columns) { // 생성자
		super(text, columns);
	}

	// 입력 인자로 들어온 Mediator를 멤버 변수인 mediator에 할당함
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// TextFiled 클래스에서 물려받은 setEnabled(boolean)를 호출하여 유효/무효를 설정한다.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled);
		// enabled가 true이면, 배경색을 흰색으로, enabled가 false이면 배경색을 회색으로 칠한다.
		// white, ligthGray: Color 클래스에 선언되어 있는 상수
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//mediator.colleagueChanged(this);  // 문자열이 변하면 Mediator에게 통지한다.
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		mediator.colleagueChanged(this);  // 문자열이 변하면 Mediator에게 통지한다.
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//mediator.colleagueChanged(this);  // 문자열이 변하면 Mediator에게 통지한다.
	}

	/*
	// TextListener 인터페이스에 정의되어 있는 메소드
	// TextField의 값이 바뀔 때마다, TextEvent가 발생되고, 이 메소드가 자동으로 호출된다.
	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged(this);  // 문자열이 변하면 Mediator에게 통지한다.
	}
*/

	
}
