package ch16.hw;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.event.*;

public class LoginFrame extends JFrame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueCheckbox checkMember;
    private ColleagueTextField textUser;
    private ColleaguePasswordField textPass;
    private ColleagueTextField textNum;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    // 생성자
    // Colleague들을 생성해서 배치한 후에 표시를 실행한다.
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // 레이아웃 매니저를 사용해서 4*2의 그리드를 만든다.
        setLayout(new GridLayout(4, 3));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Colleague들의 생성
        createColleagues();
        
        // 배치
        add(checkGuest);
        add(checkLogin);
        add(checkMember);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(new Label("주민등록번호:"));
        add(textNum);
        add(buttonOk);
        add(buttonCancel);
        // 유효/무효의 초기 지정
        colleagueChanged(checkGuest);
        // 표시
        pack();
        setVisible(true);
    }

    // Colleague들을 생성한다.
    public void createColleagues() {
        // 생성
        checkGuest = new ColleagueCheckbox("Guest", true);
        checkLogin = new ColleagueCheckbox("Login", false);
        checkMember = new ColleagueCheckbox("Memeber", false);
        
        //라디오버튼그룹생성
        ButtonGroup g = new ButtonGroup();
        g.add(checkGuest);
        g.add(checkLogin);
        g.add(checkMember);
        
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleaguePasswordField("", 10);
        
        textPass.setEchoChar('*');
        
        textNum=new ColleagueTextField("", 10);
        
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
        
        // Mediator의 세트
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this);
        
        textUser.setMediator(this);
        textPass.setMediator(this);
        textNum.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        
        // Listener의 세트
        checkGuest.addActionListener(checkGuest);
        checkLogin.addActionListener(checkLogin);
        checkMember.addActionListener(checkMember);
        
        textUser.addKeyListener(textUser);  
        textPass.addKeyListener(textPass);
        textNum.addKeyListener(textNum);
        
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Colleague로부터의 통지로 각 Colleague의 유효/무효를 판정한다.
    public void colleagueChanged(Colleague c) {
        if (c.equals(checkGuest) || c.equals(checkLogin) || c.equals(checkMember)) {
        	if (checkGuest.isSelected()) {             // Guest 모드
                textUser.setColleagueEnabled(false);
                textPass.setColleagueEnabled(false);
                textNum.setColleagueEnabled(false);
                buttonOk.setColleagueEnabled(true);
            } 
            
            else if(checkMember.isSelected()) {    // Member 모드
            	textUser.setColleagueEnabled(true);
            	userpassChanged2();
            }
            
            else {                                 // Login 모드
                textUser.setColleagueEnabled(true);
                textNum.setColleagueEnabled(false);
                userpassChanged();
            }
            
        } else if (c == textUser || c == textPass || c==textNum ) {
            userpassChanged2();
        } else {
            System.out.println("colleagueChanged:unknown colleague = " + c);
        }
    }
    
    // textUser 또는 textPass의 변경이 있었다.
    // 각Colleague의 유효/무효를 판정한다.
    private void userpassChanged() {
    	if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textUser.getText().length() >= 4 && textPass.getPassword().length >= 4) {     
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } 
    	
    	else {
            textPass.setColleagueEnabled(false);
            textNum.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
    
    private void userpassChanged2() {
    	
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            
            if (textUser.getText().length() >= 0 && textPass.getPassword().length > 0) {
            	textNum.setColleagueEnabled(true);
            	
            	int index=textNum.getText().length()-1;
            	
            	if(index >= 0) {
            		//숫자 이외의 문자를 입력하면 문자를 입력하는 순간 문자를 입력하지 말라는 경고창
            		if(!Character.isDigit(textNum.getText().charAt(index))){
            			if(JOptionPane.showConfirmDialog(null,"숫자만 입력 가능","경고",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
            				int last_index=textNum.getText().length();
            				textNum.setText(textNum.getText().substring(0,last_index-1));
            				textNum.setCaretPosition(last_index-1);
            			}
            		}
            			
            		//주민등록번호가 13자리이고, 7번째 숫자가 3또는 4이면, ok 버튼 활성화
            		if(index==12 && (textNum.getText().charAt(6)=='3' || textNum.getText().charAt(6)=='4')) {
            			buttonOk.setColleagueEnabled(true);
            		}
            		
            		else {
            			buttonOk.setColleagueEnabled(false);
            		}
            		
            	}
            	
            } else {
                textNum.setColleagueEnabled(false);
                buttonOk.setColleagueEnabled(false);
            }
            
        } else {
            textPass.setColleagueEnabled(false);
            textNum.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
    	//OK버튼이 눌리면
    	if(e.getSource()==buttonOk) {
    		//username의 길이
    		int len=textUser.getText().length();
    		char [] ch=new char[len];
    		for(int i=0;i<textUser.getText().length();i++) {
    			ch[i] = textUser.getText().charAt(i);
    		}
    		
    		int cnt=0; //username중 대 소문자 알파벳 또는 숫자인 것의 갯수
    		
    		for(int i=0;i<textUser.getText().length();i++) {
    			//각 문자가 대 소문자 또는 숫자이면 cnt 1증가.
    			if(Character.isUpperCase(ch[i])||Character.isDigit(ch[i])||Character.isLowerCase(ch[i])) {
    				cnt++;
    			}
    		}
    		
    		//cnt 가 username 길이랑 같지않으면 경고문 출력
    		if(cnt!=textUser.getText().length()) {
    			if(JOptionPane.showConfirmDialog(null,"가능하지 않은 username 입니다","경고",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
        			textUser.setText("");
        			textUser.setCaretPosition(0);
    			}
    		}
    		
    		else {
    			System.out.println("" + e);
    	        System.exit(0);
    		}
    	}
    	
    	//Cancel 버튼이 눌리면
    	if(e.getSource()==buttonCancel) {
    		System.out.println("" + e);
    		System.exit(0);
    	}
    }
}
