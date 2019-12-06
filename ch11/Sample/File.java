package ch11.Sample;

public class File extends Entry {
	private String name;

	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	
	public int getSize() {
		return size;
	}

	protected void printList(String prefix) {
		//this 는 있으나 없으나 똑같다. 
		System.out.println(prefix + "/" + this);
	}
}
