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

    // ������
    // Colleague���� �����ؼ� ��ġ�� �Ŀ� ǥ�ø� �����Ѵ�.
    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // ���̾ƿ� �Ŵ����� ����ؼ� 4*2�� �׸��带 �����.
        setLayout(new GridLayout(4, 3));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Colleague���� ����
        createColleagues();
        
        // ��ġ
        add(checkGuest);
        add(checkLogin);
        add(checkMember);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(new Label("�ֹε�Ϲ�ȣ:"));
        add(textNum);
        add(buttonOk);
        add(buttonCancel);
        // ��ȿ/��ȿ�� �ʱ� ����
        colleagueChanged(checkGuest);
        // ǥ��
        pack();
        setVisible(true);
    }

    // Colleague���� �����Ѵ�.
    public void createColleagues() {
        // ����
        checkGuest = new ColleagueCheckbox("Guest", true);
        checkLogin = new ColleagueCheckbox("Login", false);
        checkMember = new ColleagueCheckbox("Memeber", false);
        
        //������ư�׷����
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
        
        // Mediator�� ��Ʈ
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        checkMember.setMediator(this);
        
        textUser.setMediator(this);
        textPass.setMediator(this);
        textNum.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        
        // Listener�� ��Ʈ
        checkGuest.addActionListener(checkGuest);
        checkLogin.addActionListener(checkLogin);
        checkMember.addActionListener(checkMember);
        
        textUser.addKeyListener(textUser);  
        textPass.addKeyListener(textPass);
        textNum.addKeyListener(textNum);
        
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    // Colleague�κ����� ������ �� Colleague�� ��ȿ/��ȿ�� �����Ѵ�.
    public void colleagueChanged(Colleague c) {
        if (c.equals(checkGuest) || c.equals(checkLogin) || c.equals(checkMember)) {
        	if (checkGuest.isSelected()) {             // Guest ���
                textUser.setColleagueEnabled(false);
                textPass.setColleagueEnabled(false);
                textNum.setColleagueEnabled(false);
                buttonOk.setColleagueEnabled(true);
            } 
            
            else if(checkMember.isSelected()) {    // Member ���
            	textUser.setColleagueEnabled(true);
            	userpassChanged2();
            }
            
            else {                                 // Login ���
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
    
    // textUser �Ǵ� textPass�� ������ �־���.
    // ��Colleague�� ��ȿ/��ȿ�� �����Ѵ�.
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
            		//���� �̿��� ���ڸ� �Է��ϸ� ���ڸ� �Է��ϴ� ���� ���ڸ� �Է����� ����� ���â
            		if(!Character.isDigit(textNum.getText().charAt(index))){
            			if(JOptionPane.showConfirmDialog(null,"���ڸ� �Է� ����","���",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
            				int last_index=textNum.getText().length();
            				textNum.setText(textNum.getText().substring(0,last_index-1));
            				textNum.setCaretPosition(last_index-1);
            			}
            		}
            			
            		//�ֹε�Ϲ�ȣ�� 13�ڸ��̰�, 7��° ���ڰ� 3�Ǵ� 4�̸�, ok ��ư Ȱ��ȭ
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
    	//OK��ư�� ������
    	if(e.getSource()==buttonOk) {
    		//username�� ����
    		int len=textUser.getText().length();
    		char [] ch=new char[len];
    		for(int i=0;i<textUser.getText().length();i++) {
    			ch[i] = textUser.getText().charAt(i);
    		}
    		
    		int cnt=0; //username�� �� �ҹ��� ���ĺ� �Ǵ� ������ ���� ����
    		
    		for(int i=0;i<textUser.getText().length();i++) {
    			//�� ���ڰ� �� �ҹ��� �Ǵ� �����̸� cnt 1����.
    			if(Character.isUpperCase(ch[i])||Character.isDigit(ch[i])||Character.isLowerCase(ch[i])) {
    				cnt++;
    			}
    		}
    		
    		//cnt �� username ���̶� ���������� ��� ���
    		if(cnt!=textUser.getText().length()) {
    			if(JOptionPane.showConfirmDialog(null,"�������� ���� username �Դϴ�","���",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
        			textUser.setText("");
        			textUser.setCaretPosition(0);
    			}
    		}
    		
    		else {
    			System.out.println("" + e);
    	        System.exit(0);
    		}
    	}
    	
    	//Cancel ��ư�� ������
    	if(e.getSource()==buttonCancel) {
    		System.out.println("" + e);
    		System.exit(0);
    	}
    }
}
