package ch01.hw;

//å���̿� ���� å�� ��Ÿ���� Ŭ����
public class Book {
 //��� �޼ҵ忡�� ������ �ʴ� �޼ҵ�� �Ӽ��̶�� ��. 
 private String name = ""; // å�� �̸��� �����Ѵ�.
 private String author=""; // å�� ���ڸ� �����Ѵ�.
 

	// ���ڿ��� �Է� ���ڷ� �޾Ƽ� �ڽ��� �Ӽ��� name�� �����Ѵ�.
 //������
 public Book(String name, String author) {
	 //���� ��ü�� �Ӽ��� ���� �־��
     this.name = name;
     this.author=author;
 }

	// �ڽ��� �̸��� ��ȯ�ϴ� �޼ҵ�
 public String getName() {
     return name;
 }
 
	// �۰��� ��ȯ�ϴ� �޼ҵ�
 public String getAuthor() {
	 return author;
 }
}