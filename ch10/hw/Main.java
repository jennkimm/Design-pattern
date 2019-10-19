package ch10.hw;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
    	Student s1=new Student("김서현",20171046,162);
    	Student s2=new Student("강지연",20171044,168);
    	Student s3=new Student("유지원",20171067,161);
    	Student s4=new Student("박소연",20171098,158);
    	Student s5=new Student("장혜정",20171042,160);
    	
        Student[] data = {
        		s1,s2,s3,s4,s5
                   };
        
        System.out.println("<정렬 결과>");
        System.out.println("(1) by InsertSorter: ");
        SortAndPrint sap = new SortAndPrint(data, new InsertSorter());
        sap.execute();
        System.out.println();
        
        data=new Student[5];
        data[0]=s1;
        data[1]=s2;
        data[2]=s3;
        data[3]=s4;
        data[4]=s5;
        
        System.out.println("(2) by BubbleSorter: ");
        sap = new SortAndPrint(data, new BubbleSorter());
        
        sap.execute();
        System.out.println();
        
        data=new Student[5];
        data[0]=s1;
        data[1]=s2;
        data[2]=s3;
        data[3]=s4;
        data[4]=s5;
        
        
        
        System.out.println("(3) by QuickSorter: ");
        sap = new SortAndPrint(data, new QuickSorter());
        sap.execute();
        System.out.println();

       
        
        
        
    }
}
