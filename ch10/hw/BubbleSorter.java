package ch10.hw;

public class BubbleSorter implements Sorter {
	@Override
	public void sort(Comparable[] data) {
		// TODO Auto-generated method stub
		long startTime=System.nanoTime();
		for (int i = 0; i < data.length - 1; i++) {
			for(int j = 0 ; j < data.length -i -1 ; j ++) {
				if(data[j].compareTo(data[j+1]) < 0) {
					Comparable passingplace = data[j];
					data[j] = data[j+1];
					data[j+1] = passingplace;
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
