package ch16.hw;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class ColleagueCheckbox extends JRadioButton implements ActionListener,
		Colleague {
	private Mediator mediator;

	public ColleagueCheckbox(String caption, boolean state) { // ������
		super(caption, state); // �׷��߿� �ϳ��� ���õ� �� �ֵ��� ��.
	}

	public void setMediator(Mediator mediator) { // Mediator�� ����
		this.mediator = mediator;
	}

	// ��ī����� ������ ���á��� �ش���
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled);
	}

	public void actionPerformed(ActionEvent e) {
		mediator.colleagueChanged(this);  // ���°� ���ϸ� Mediator���� �����Ѵ�.
	}
	
	// ������ư�� ���°� �ٲ���� ��, ItemEvent�� �߻��ǰ�, 
	// ��ϵ� ItemListener�� �� �޼ҵ尡 �ڵ����� ȣ��ȴ�.
	/*
	public void itemStateChanged(ItemEvent e) {
		// ���� ��ü�� mediator ���� ���� ��ȭ�� �Ͼ�ٰ� �˷���. 
		// this �� �־ ���� ���߾� �̷��� �˷���߰ڴ�. 
		mediator.colleagueChanged(this);  // ���°� ���ϸ� Mediator���� �����Ѵ�.
	}
	*/
}
