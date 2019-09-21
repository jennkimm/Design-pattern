package ch01.hw;

//모든 Iterator 가 가져야 할 메소드를 선언한 인터페이스
public interface Iterator {
	//원소가 더 있는지 검사할 때 사용되는 메소드
	public abstract boolean hasNext();
	//Object 형으로 선언한 이유: 어떤 타입의 원소를 반환할 지 모르기 때문에
	// Object 는 모든 클래스의 부모이므로,
	//Object 형은 모든 타입의 객체를 가리킬 수 있다.
	public abstract Object next(); // 그 다음 원소를 얻어올 때 사용되는 메소드 
}

