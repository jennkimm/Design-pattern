package ch10.hw;

public class QuickSorter implements Sorter {
	 Comparable[] data;
	    public void sort(Comparable[] data) {
	        this.data = data;
	         
	        //����ð� �����ؼ� ���
	        long startTime = System.nanoTime();
	        
	        qsort(0, data.length - 1);
	        
	        long endTime=System.nanoTime();
	        long estimatedTime=endTime-startTime;
	        double seconds=estimatedTime/1000000000.0;
	        System.out.println("execution time= "+seconds+" secs");
	        System.out.println("");

	        
	    }
	    
	    private void qsort(int pre, int post) {
	        int saved_pre = pre;
	        int saved_post = post;
	        Comparable mid = data[(pre + post) / 2];
	        
	        
	        do {
	        	// mid���� ū data�� ���ö����� pre�� ���������� �̵���Ų��.
	            while (data[pre].compareTo(mid) > 0 && pre <= saved_post) {
	                pre++;
	            }
	            
	            // mid���� ���� data�� ���ö����� post�� �������� �̵���Ų��. 
	            while (mid.compareTo(data[post]) > 0 && post>= saved_pre) {
	                post--;
	            }
	            
	            if (pre <= post) {
	                Comparable tmp = data[pre];
	                data[pre] = data[post];
	                data[post] = tmp;
	                pre++;
	                post--;
	            }
	        } while (pre <= post);
	        
	        
	        if (saved_pre < post) {
	            qsort(saved_pre, post);
	        }
	        if (pre < saved_post) {
	            qsort(pre, saved_post);
	        }
	        
	    }
}
