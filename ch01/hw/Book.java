package ch01.hw;

//책꽂이에 꽂힐 책을 나타내는 클래스
public class Book {
 //어느 메소드에도 속하지 않는 메소드는 속성이라고 함. 
 private String name = ""; // 책의 이름을 저장한다.
 private String author=""; // 책의 저자를 저장한다.
 

	// 문자열을 입력 인자로 받아서 자신의 속성인 name에 저장한다.
 //생성자
 public Book(String name, String author) {
	 //현재 객체의 속성에 값을 넣어라
     this.name = name;
     this.author=author;
 }

	// 자신의 이름을 반환하는 메소드
 public String getName() {
     return name;
 }
 
	// 작가를 반환하는 메소드
 public String getAuthor() {
	 return author;
 }
}