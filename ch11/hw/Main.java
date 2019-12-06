package ch11.hw;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("MyDocuments","20190901","SeohyunKim");
			Directory datadir = new Directory("MyData","20191001","SeohyunKim");
			Directory picdir = new Directory("MyPictures","20191101","SeohyunKim");
			
			rootdir.add(new File("±è¼­Çö0.doc","20190901", 1000,"SeohyunKim"));
			
			rootdir.add(datadir);
			
			datadir.add(new File("±è¼­Çö1.doc","20191001", 1500,"SeohyunKim"));
			datadir.add(new File("±è¼­Çö2.java","20191001", 2000,"SeohyunKim"));
			
			datadir.add(picdir);
			
			picdir.add(new File("±è¼­Çö3.gif","20191101",2500,"SeohyunKim"));
			picdir.add(new File("±è¼­Çö4.jpg","20191101",3000,"SeohyunKim"));
			picdir.add(new File("±è¼­Çö5.png","20191101",3500,"SeohyunKim"));
			
			rootdir.printList("");
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
