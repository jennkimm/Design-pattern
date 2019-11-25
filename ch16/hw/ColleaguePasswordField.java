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
	
	public ColleaguePasswordField(String text, int columns) { // ������
		super(text, columns);
	}

	// �Է� ���ڷ� ���� Mediator�� ��� ������ mediator�� �Ҵ���
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// TextFiled Ŭ�������� �������� setEnabled(boolean)�� ȣ���Ͽ� ��ȿ/��ȿ�� �����Ѵ�.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled);
		// enabled�� true�̸�, ������ �������, enabled�� false�̸� ������ ȸ������ ĥ�Ѵ�.
		// white, ligthGray: Color Ŭ������ ����Ǿ� �ִ� ���
		setBackground(enabled ? Color.white : Color.lightGray);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//mediator.colleagueChanged(this);  // ���ڿ��� ���ϸ� Mediator���� �����Ѵ�.
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		mediator.colleagueChanged(this);  // ���ڿ��� ���ϸ� Mediator���� �����Ѵ�.
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//mediator.colleagueChanged(this);  // ���ڿ��� ���ϸ� Mediator���� �����Ѵ�.
	}

	/*
	// TextListener �������̽��� ���ǵǾ� �ִ� �޼ҵ�
	// TextField�� ���� �ٲ� ������, TextEvent�� �߻��ǰ�, �� �޼ҵ尡 �ڵ����� ȣ��ȴ�.
	public void textValueChanged(TextEvent e) {
		mediator.colleagueChanged(this);  // ���ڿ��� ���ϸ� Mediator���� �����Ѵ�.
	}
*/

	
}
