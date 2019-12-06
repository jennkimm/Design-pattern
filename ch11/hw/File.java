package ch11.hw;

public class File extends Entry {
	private String name;

	private int size;

	private String date;
	private String author;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public File(String name, String date, int size, String author) {
		this.name=name;
		this.size=size;
		this.date=date;
		this.author=author;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDate() { // ��¥�� ��´�.
		return date;
	}
	
	public String getAuthor() { // �۰��� ��´�.
		return author;
	}

	public int getSize() {
		return size;
	}
	
	public int getCount() {
		return 1;
	}

	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}
}
