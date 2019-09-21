package ch01.hw;

public class BookShelfIteratorBackward implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIteratorBackward(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
		this.index=bookShelf.getLength()-1; //�ε����� ���������� �ʱ�ȭ
	}

	// å���̿� ������ å�� �� �ִ��� �˻��ϴ� �޼ҵ�
    public boolean hasNext() {
		// ���� å ��ȣ�� 0���� ũ��,
	    // å���̿� ���ƴٴ� å�� �� �ִ� ���̹Ƿ� true�� ��ȯ�Ѵ�.
        if (index >= 0) { //equal�� �־���ϴ��� ������ϴ��� üũ
            return true;
        } else {
            return false;
        }
    }

	// ���� å�� �������� �� �� ȣ��Ǵ� �޼ҵ�
	// ��ȯ���� Object Ÿ���̴�. 
	//  - Object�� ��� Ŭ������ �θ� Ŭ�����̹Ƿ� ��� �ڽ��� ����ų �� �ִ�.  
	//  - ��, ��� Ÿ���� ��ü�� ��ȯ�� �� �ִ�.
	//  - ������ ��ȯ�Ǵ� ��ü�� Book Ÿ���̹Ƿ�, �ùٸ� ��ȯ������ ����� ���̴�.
    public Object next() {
        // �� Iterator�� ����Ű�� å������ getBookAt(index)�� �̿��ؼ�
		// index å��ȣ�� �ش��ϴ� å�� ���ͼ� book�� �����Ѵ�.
		Book book = bookShelf.getBookAt(index);
        // ���� å��ȣ�� 1 ���ҽ�Ų��.
		index--;
		// ���� å�� ��ȯ�Ѵ�.
        return book;
    }

}
