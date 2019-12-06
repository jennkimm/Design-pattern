package ch11.Sample;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Entry f1=new File("파일1",100);
		Entry f2=new File("파일2",200);
		Entry f3=new File("파일3",300);
		
		//System.out.println(f1.getName());
		//System.out.println(f1.getSize());
		//f1.printList();
		
		Entry d1= new Directory("디렉토리1");
		
		d1.add(f1);
		d1.add(f2);
		d1.add(f3);
		
		System.out.println(d1.getSize());
		
		}
		
		catch (FileTreatmentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
