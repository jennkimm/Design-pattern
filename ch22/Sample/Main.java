package ch22.Sample;

import ch22.Sample.command.Command;
import ch22.Sample.drawer.ColorCommand;
import ch22.Sample.command.*;
import ch22.Sample.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ���� ���α׷��� �۵���Ű�� Ŭ����
public class Main extends JFrame implements ActionListener,
		/*MouseMotionListener, */ WindowListener {

	// DrawCanvas ���� �ÿ� ���ڷ� �Ѱ���
	// Main �ν��Ͻ��� DrawCanvas �ν��Ͻ��� history�� �����Ѵ�.
	private MacroCommand history = new MacroCommand();

	// �׸� �׸��� ������ ��Ÿ��
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);

	// javax.swing.JButton Ŭ����
	// �׸� ������ ��� ����� ��ư
	private JButton clearButton = new JButton("clear");
	
	private JButton redButton = new JButton("red");
	private JButton greenButton = new JButton("green");
	private JButton blueButton = new JButton("blue");


	public Main(String title) {
		super(title);
		// ������ ����ϱ�
		this.addWindowListener(this);
		//canvas.addMouseMotionListener(this);
		//���콺 ��� ������ ��ü�� ���� �����ؼ� �����
		//canvas.addMouseMotionListener(���콺��Ǹ����� ��ü);
		canvas.addMouseMotionListener(new MouseMotionAdapter() { //�͸��� ����Ŭ����
			//mouseDragged �� �������̵� ��. 
			// ����ڰ� ���콺�� drag �ϸ� �� �޼ҵ尡 ȣ��ȴ�.
			public void mouseDragged(MouseEvent e) {
				// �׸��� ����� ��Ÿ���� DrawCommand ��ü�� ������ ��,
				// ���콺�� �̺�Ʈ�� ��ǥ�� e.getPoint�� �̿��ؼ� ��´�. 
				Command cmd = new DrawCommand(canvas, e.getPoint());  // e.getPoint( ) : ���콺 �̺�Ʈ�� �߻��� ��ġ�� ����
				history.append(cmd); // �̸� history�� �߰��ϰ�,
				cmd.execute(); // ���� ��ġ�� ���� ���� �׸���.
			}
		});
		clearButton.addActionListener(this);
		redButton.addActionListener(this);      
	    greenButton.addActionListener(this);    
	    blueButton.addActionListener(this);  

		// ���� ���� GUI ��ǰ�� ��ġ��
		// Box ��ü�� �̿���
		// Box: BoxLayout ��ü�� ���̾ƿ��Ŵ����� ����ϴ� ������ �����̳�
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);

		// �������� ȭ�鿡 �����ش�.
		pack();
		setVisible(true);
	}

	// clearButton�� �������� �� ȣ��Ǵ� �޼ҵ�
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			history.clear(); // history�� �����Ǿ� �ִ� ��� ����� �����
			//canvas.init();
			canvas.repaint(); // ĵ������ repaint( )�� ȣ��ȴ�.
			
		}else if(e.getSource()== redButton) {
			Command cmd=new ColorCommand(canvas, Color.blue);
			history.append(cmd);
			cmd.execute();
		}
		
		else if (e.getSource() == greenButton) {              
            Command cmd = new ColorCommand(canvas, Color.green);
            history.append(cmd);                                
            cmd.execute();                                      
        } else if (e.getSource() == blueButton) {               
            Command cmd = new ColorCommand(canvas, Color.blue); 
            history.append(cmd);                                
            cmd.execute();                                      
        }
	}

	/*
	// MouseMotionListener
	public void mouseMoved(MouseEvent e) {
	}

	// ����ڰ� ���콺�� drag �ϸ� �� �޼ҵ尡 ȣ��ȴ�.
	public void mouseDragged(MouseEvent e) {
		// �׸��� ����� ��Ÿ���� DrawCommand ��ü�� ������ ��,
		// ���콺�� �̺�Ʈ�� ��ǥ�� e.getPoint�� �̿��ؼ� ��´�. 
		Command cmd = new DrawCommand(canvas, e.getPoint());  // e.getPoint( ) : ���콺 �̺�Ʈ�� �߻��� ��ġ�� ����
		history.append(cmd); // �̸� history�� �߰��ϰ�,
		cmd.execute(); // ���� ��ġ�� ���� ���� �׸���.
	}
*/
	
	// WindowListener
	
	// â�� ���� �� �� ������ �߿�  X �簢���� ������ �� ȣ��Ǵ� �޼ҵ�
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	// WindowListener �������̽��� ����Ǿ� �ִ� ������ �޼ҵ��
	// ������ �ʿ䰡 �����Ƿ�, �� ������ �޼ҵ�� �����Ǿ� �ִ�.
	public void windowActivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	public static void main(String[] args) {
		new Main("Command Pattern Sample");
	}
}
