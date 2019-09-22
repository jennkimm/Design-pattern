package ch02.hw;

import java.io.*;

public class Main {
    public static void main(String[] args) {
    	System.out.println("20171046 김서현");
    	
        FileIO f = new FileProperties(); //필요로하는 메소드가 선언된 FileIO의 객체 생성
        try {
            f.readFromFile("file.txt"); //파일을 읽어옴
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
