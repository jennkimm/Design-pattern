package ch01.Sample;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
     // å������ å�� �����ϱ� ���� Book �迭�� �����Ѵ�.
	//private Book[ ] books;  //�迭 ������ �����ϰ�, ������ �Ҵ���� �ʾҴ�.
	private ArrayList<Book> books;
	
	private int last = 0; // ������ å�� ���� ��ġ�� �����Ѵ�.

    public BookShelf(/*int maxsize*/) {
        //this.books = new Book[maxsize]; // ���⼭ �迭 ������ ������ �������.
        books=new ArrayList<Book>();
    }

	 // �Է������� index�� �ش��ϴ� å�� ��ȯ�ϴ� �޼ҵ�
    //public Book getBookFrom(int index) {
    //����ü�� iterator�� ������ ���ۿ� ����. ���� ������ �ϴϱ�
    public Book getBookAt(int index) {
    	return books.get(index);
        //return books[index];
    }

	// å���̿� å�� �ȴ� �޼ҵ�
    public void appendBook(Book book) {
    	books.add(book);
        //this.books[last] = book;
        //last++;
    }

	// å������ å ������ ��ȯ�ϴ� �޼ҵ�
    public int getLength() {
    	return books.size();
        //return last;
    }
    

	// �ڽ��� Iterator�� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
    
    public Iterator iterator() {
		// �ڽ��� ���ڷ� �Ͽ� BookShelfIterator ��ü�� �����Ͽ� ��ȯ�Ѵ�.
        return new BookShelfIterator(this);  //this: ���� å����
    }
    
}









