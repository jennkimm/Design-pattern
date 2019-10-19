package ch10.hw;

import java.lang.Comparable;

public class Student implements Comparable<Student> {
	private int height;
	private String name;
	private int studentID;
	
	Sorter sorter;
	
	public Student(String name, int studentID, int height) {
		this.name=name;
		this.studentID=studentID;
		this.height=height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public String toString() {
		return ("이름: "+this.name+", 학번: "+this.studentID+", 키: "+this.height);
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		//System.out.println("앞 키: "+height+"뒤 키: "+s.getHeight());
		if(height > s.getHeight()) {
			return 1;
		}
		else
			return -1;
		//return ((Integer)height).compareTo(s.getHeight());
	}
}
