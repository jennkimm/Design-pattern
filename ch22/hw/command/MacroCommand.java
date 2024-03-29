package ch22.hw.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 집합
    private Stack commands = new Stack();
    
    // redo 를 위한 두번째 스택
    private Stack deletedCommands= new Stack();
    
    // 실행
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }
    
    // 추가
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    
    // 최후의 명령을 삭제
    public void undo() {
        if (!commands.empty()) {
           // 삭제했던 명령 기억
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
    
    // 전부 삭제
    public void clear() {
        commands.clear();
    }
}
