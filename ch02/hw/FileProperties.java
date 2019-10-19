package ch02.hw;

import java.io.*;
import java.util.*;


// Properties 클래스는, 이미 존재하는 클래스이다.
// FileProperties 클래스가 어댑터 역할을 한다.
public class FileProperties extends FileIO {
	
	private Properties properties=new Properties(); //properties 객체 생성
	
	//properties 의 load 메소드 호출
	//readFromFile 메소드는 자신의 일을 직접 처리하지 않고 Properties에 위임한다
	public void readFromFile(String filename) throws IOException {
		properties.load(new FileInputStream(filename)) ;
    }
	
	//properties 의 store 메소드 호출
	//writeToFile 메소드는 자신의 일을 직접 처리하지 않고 Properties에 위임한다
    public void writeToFile(String filename) throws IOException {
    	properties.store(new FileOutputStream(filename), "written by FileProperties");
    }
    
    //properties 의 setProperty 메소드 호출
  	//setVelue 메소드는 자신의 일을 직접 처리하지 않고 Properties에 위임한다
    public void setValue(String key, String value) {
    	properties.setProperty(key, value); 
    }
    
    //properties 의 getProperty 메소드 호출
  	//get Value 메소드는 자신의 일을 직접 처리하지 않고 Properties에 위임한다
    public String getValue(String key) {
        return properties.getProperty(key, ""); 
    }
    
}
