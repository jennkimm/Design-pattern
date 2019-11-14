package ch11.Sample;

public abstract class Entry {
	public abstract String getName(); // 이름을 얻는다.

	public abstract int getSize(); // 사이즈를 얻는다.

	public Entry add(Entry entry) throws FileTreatmentException {
		// 이 클래스에 다른 엔트리를 추가하려고 하면, 예외를 발생시킨다.
		// "자신이 처리하지 않고, 이 메소드를 호출한 객체로 전파시킨다"라고 선언되어 있음.
		throw new FileTreatmentException(); //예외 객체를 생성
	}

	//메소드 오버로딩
	//printList는 오버로딩이 된 상태이다.
	//1) 인자가 없는 부분, 은 구현이 되어있고
	public void printList() { // 일람을 표시한다.
		//클라이언트가 인자없이 호출할때 아무것도없는 null문자열을 통해 호출. 
		printList("");
	}

	//2) 인자가 있는 부분, 추상클래스로 되어있네..?
	protected abstract void printList(String prefix); // prefix를 앞에 붙여서 일람을
														// 표시한다.

	public String toString() { // 문자열 표현
		return getName() + " (" + getSize() + ")";
	}
}
