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

	// �Է� ���ڷ� ���� Mediator�� ��� ������ mediator�� �Ҵ���
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// Button Ŭ�������� �������� setEnabled(boolean)�� ȣ���Ͽ� ��ȿ/��ȿ�� �����Ѵ�.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled); // setEnabled( )�� �θ��� Button Ŭ�����κ��� �������� �޼ҵ��̴�.
	}
}

