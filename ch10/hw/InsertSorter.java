package ch10.hw;

public class InsertSorter implements Sorter {
	public void sort(Comparable[] data) {
		
		long startTime=System.nanoTime();
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) < 0) { // data[i] �� data[j] ���� ũ��
					// ���� ��ȯ�Ѵ�.
					Comparable passingplace = data[i];
					data[i] = data[j];
					data[j] = passingplace;
				}
			}
		}
		long endTime=System.nanoTime();
		
		long estimatedTime=endTime-startTime;
		
		double seconds=estimatedTime/1000000000.0;
		
		System.out.println("execution time= "+seconds+"secs");
		System.out.println("");

	}
}
