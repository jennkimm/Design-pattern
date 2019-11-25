package ch16.Sample;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener,
		Colleague {
	private Mediator mediator;

	public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) { // 생성자
		super(caption, group, state); // 그룹중에 하나만 선택될 수 있도록 함.
	}

	public void setMediator(Mediator mediator) { // Mediator를 보관
		this.mediator = mediator;
	}

	// “카운셀러가 내리는 지시”에 해당함
	public void setColleagueEnabled(boolean enabled) { 
		setEnabled(enabled);
	}

	
	// 라디오버튼의 상태가 바뀌었을 때, ItemEvent가 발생되고, 
	// 등록된 ItemListener의 이 메소드가 자동으로 호출된다.
	public void itemStateChanged(ItemEvent e) {
		// 현재 객체를 mediator 한테 뭔가 변화가 일어났다고 알려줌. 
		// this 를 넣어서 내가 변했어 이렇게 알려줘야겠다. 
		mediator.colleagueChanged(this);  // 상태가 변하면 Mediator에게 통지한다.
	}
}
