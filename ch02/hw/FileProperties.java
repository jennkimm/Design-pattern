package ch02.hw;

import java.io.*;
import java.util.*;


// Properties Ŭ������, �̹� �����ϴ� Ŭ�����̴�.
// FileProperties Ŭ������ ����� ������ �Ѵ�.
public class FileProperties extends FileIO {
	
	private Properties properties=new Properties(); //properties ��ü ����
	
	//properties �� load �޼ҵ� ȣ��
	//readFromFile �޼ҵ�� �ڽ��� ���� ���� ó������ �ʰ� Properties�� �����Ѵ�
	public void readFromFile(String filename) throws IOException {
		properties.load(new FileInputStream(filename)) ;
    }
	
	//properties �� store �޼ҵ� ȣ��
	//writeToFile �޼ҵ�� �ڽ��� ���� ���� ó������ �ʰ� Properties�� �����Ѵ�
    public void writeToFile(String filename) throws IOException {
    	properties.store(new FileOutputStream(filename), "written by FileProperties");
    }
    
    //properties �� setProperty �޼ҵ� ȣ��
  	//setVelue �޼ҵ�� �ڽ��� ���� ���� ó������ �ʰ� Properties�� �����Ѵ�
    public void setValue(String key, String value) {
    	properties.setProperty(key, value); 
    }
    
    //properties �� getProperty �޼ҵ� ȣ��
  	//get Value �޼ҵ�� �ڽ��� ���� ���� ó������ �ʰ� Properties�� �����Ѵ�
    public String getValue(String key) {
        return properties.getProperty(key, ""); 
    }
    
}
