package ch16.hw;


import java.awt.TextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.*;
import javax.swing.event.*;

// java.awt.event.TextListener 인터페이스도 구현함
// 텍스트 필드의 내용이 바뀌었을 때, TextEvent를 처리하는 textValueChanged 메소드를 제공한다.
public class ColleagueTextField extends JTextField implements KeyListener, Colleague {
	private Mediator mediator;

	public ColleagueTextField(String text, int columns) { // 생성자
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
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		mediator.colleagueChanged(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	
}

