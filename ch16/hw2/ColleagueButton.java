package ch16.hw2;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;

	public ColleagueButton(String caption) { // caption==��ư�� ��Ÿ���� ����
		super(caption); // �θ������ =  Button // super(caption);�� ������ ���ھ��� �θ�����ڰ� �������
	}

	// �Է� ���ڷ� ���� Mediator�� ��� ������ mediator�� �Ҵ���
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}

	// Button Ŭ�������� �������� setEnabled(boolean)�� ȣ���Ͽ� ��ȿ/��ȿ�� �����Ѵ�.
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled); // setEnabled( )�� �θ��� Button Ŭ�����κ��� �������� �޼ҵ��̴�. // this.�� �տ� ����
	}
}
