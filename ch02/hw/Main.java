package ch02.hw;

import java.io.*;

public class Main {
    public static void main(String[] args) {
    	System.out.println("20171046 �輭��");
    	
        FileIO f = new FileProperties(); //�ʿ���ϴ� �޼ҵ尡 ����� FileIO�� ��ü ����
        try {
            f.readFromFile("file.txt"); //������ �о��
            f.setValue("Year", "2019");
            f.setValue("bornYear", "1998");
            f.setValue("StudentId", "20171046");
            f.setValue("Name", "Seohyun Kim");
            f.setValue("Location", "Seoul");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
