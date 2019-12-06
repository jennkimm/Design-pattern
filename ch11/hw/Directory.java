package ch11.hw;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
	private String name; // ���丮�� �̸�
	
	private String date;
	
	private String author;

	private Vector directory = new Vector(); // ���丮 ��Ʈ���� ����

	public Directory(String name) { // ������
		this.name = name;
	}
	
	Directory(String name, String date, String author){
		this.name=name;
		this.date=date;
		this.author=author;
	}

	public String getName() { // �̸��� ��´�.
		return name;
	}
	
	public String getDate() { // ��¥�� ��´�.
		return date;
	}
	
	public String getAuthor() { // �۰��� ��´�.
		return author;
	}

	public int getSize() { // ����� ��´�.
		int size = 0;
		// �ڽ��� ������ �ִ� ��� ��Ʈ���� ���ؼ�, getSize( )ȣ���Ͽ� ���Ѵ�.
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			// entry�� Entry Ÿ������ ����Ǿ� �ְ�,
			// Entry�� File�̳� Directory�� �θ� Ŭ�����̱� ������ �� �� ������ �� �ִ�.
			Entry entry = (Entry) it.next();
			// entry�� ���丮�� ��쿡��, �ٽ� �� ���丮�� getSize( )�� ��������� ȣ��ȴ�. 
			size += entry.getSize(); 
			// => �׸��� ���빰�� ���Ͻ� �ȴ�.
		}
		return size;
	}
	
	public int getCount() { // �ڱ� �Ʒ� ���Ե� ��� ���� ������ �� ��ȯ
		int count=0;
		
		Iterator it = directory.iterator();
		
		while (it.hasNext()) {
			// entry�� Entry Ÿ������ ����Ǿ� �ְ�,
			// Entry�� File�̳� Directory�� �θ� Ŭ�����̱� ������ �� �� ������ �� �ִ�.
			Entry entry = (Entry) it.next();
			// entry�� ���丮�� ��쿡��, �ٽ� �� ���丮�� getSize( )�� ��������� ȣ��ȴ�. 
			count += entry.getCount(); 
			// => �׸��� ���빰�� ���Ͻ� �ȴ�.
		}
		return count;
	}

	public Entry add(Entry entry) { // ��Ʈ���� �߰�
		// �Է����ڷ� ���� Entry(File �Ǵ� Directory ��ü)�� ���Ϳ� �����Ѵ�.
		directory.add(entry);
		return this;
	}

	protected void printList(String prefix) { // ��Ʈ���� �϶�
		System.out.println(prefix + "/" + this);
		// �ڽ��� ������ �ִ� ��� ��Ʈ���� ���ؼ�, printList( )ȣ���Ѵ�.
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}
