package ch01.hw;

public class BookShelfIteratorBackward implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIteratorBackward(BookShelf bookShelf) {
		this.bookShelf=bookShelf;
		this.index=bookShelf.getLength()-1; //인덱스를 마지막으로 초기화
	}

	// 책꽂이에 접근할 책이 더 있는지 검사하는 메소드
    public boolean hasNext() {
		// 현재 책 번호가 0보다 크면,
	    // 책꽂이에 돌아다닐 책이 더 있는 것이므로 true를 반환한다.
        if (index >= 0) { //equal이 있어야하는지 없어야하는지 체크
            return true;
        } else {
            return false;
        }
    }

	// 다음 책을 얻어오고자 할 때 호출되는 메소드
	// 반환형이 Object 타입이다. 
	//  - Object는 모든 클래스의 부모 클래스이므로 모든 자식을 가리킬 수 있다.  
	//  - 즉, 모든 타입의 객체를 반환할 수 있다.
	//  - 실제로 반환되는 객체는 Book 타입이므로, 올바른 반환형으로 선언된 것이다.
    public Object next() {
        // 이 Iterator가 가리키는 책꽂이의 getBookAt(index)를 이용해서
		// index 책번호에 해당하는 책을 얻어와서 book에 저장한다.
		Book book = bookShelf.getBookAt(index);
        // 현재 책번호를 1 감소시킨다.
		index--;
		// 얻어온 책을 반환한다.
        return book;
    }

}
