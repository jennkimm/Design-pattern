package ch22.hw.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    // ����� ����
    private Stack commands = new Stack();
    
    // redo �� ���� �ι�° ����
    private Stack deletedCommands= new Stack();
    
    // ����
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }
    
    // �߰�
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    
    // ������ ����� ����
    public void undo() {
        if (!commands.empty()) {
           // �����ߴ� ��� ���
           deletedCommands.push(commands.peek());
           commands.pop();
        } 
        
    }
    
    public void redo() {
    	if(!deletedCommands.empty()) {
    		commands.push(deletedCommands.peek());
    		deletedCommands.pop();
    	}
    }
    
    // ���� ����
    public void clear() {
        commands.clear();
    }
}
