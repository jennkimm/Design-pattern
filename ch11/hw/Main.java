package ch11.hw;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("MyDocuments","20190901","SeohyunKim");
			Directory datadir = new Directory("MyData","20191001","SeohyunKim");
			Directory picdir = new Directory("MyPictures","20191101","SeohyunKim");
			
			rootdir.add(new File("�輭��0.doc","20190901", 1000,"SeohyunKim"));
			
			rootdir.add(datadir);
			
			datadir.add(new File("�輭��1.doc","20191001", 1500,"SeohyunKim"));
			datadir.add(new File("�輭��2.java","20191001", 2000,"SeohyunKim"));
			
			datadir.add(picdir);
			
			picdir.add(new File("�輭��3.gif","20191101",2500,"SeohyunKim"));
			picdir.add(new File("�輭��4.jpg","20191101",3000,"SeohyunKim"));
			picdir.add(new File("�輭��5.png","20191101",3500,"SeohyunKim"));
			
			rootdir.printList("");
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
