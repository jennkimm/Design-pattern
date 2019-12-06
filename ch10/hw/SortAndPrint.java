package ch10.hw;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }
    
    public void execute() {
    	System.out.println("���� ��: ");
        print();
        sorter.sort(data);
        System.out.println("���� ��: ");
        print();
    }
    
    public void print() {
        for (int i = 0; i < data.length; i++) {
        	System.out.println(data[i].toString());
        }
        System.out.println("");
    }
}
