package ch11.Sample;

import java.util.Iterator;
import java.util.Vector;

public class Directory extends Entry {
	private String name; // 디렉토리의 이름

	//자기 내용물을 담고 있는 변수
	private Vector directory = new Vector(); // 디렉토리 엔트리의 집합

	public Directory(String name) { // 생성자
		this.name = name;
	}

	public String getName() { // 이름을 얻는다.
		return name;
	}

	//자기 내용물에 사이즈를 모두 합쳐서 리턴하는 메소드
	public int getSize() { // 사이즈를 얻는다.
		int size = 0;
		// 자신이 가지고 있는 모든 엔트리에 대해서, getSize( )호출하여 더한다.
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			// entry는 Entry 타입으로 선언되어 있고,
			// Entry는 File이나 Directory의 부모 클래스이기 때문에 둘 다 참조할 수 있다.
			Entry entry = (Entry) it.next();
			// entry가 디렉토리인 경우에는, 다시 이 디렉토리의 getSize( )가 재귀적으로 호출된다. 
			size += entry.getSize(); 
			// => 그릇과 내용물이 동일시 된다.
		}
		return size;
	}

	public Entry add(Entry entry) { //엔트리의 추가
		// 입력인자로 들어온 Entry(File 또는 Directory 객체)를 벡터에 저장한다.
		directory.add(entry);
		return this;
	}

	protected void printList(String prefix) { // 엔트리의 일람
		System.out.println(prefix + "/" + this);
		// 자신이 가지고 있는 모든 엔트리에 대해서, printList( )호출한다.
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}
