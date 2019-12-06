package ch05.Sample;

public class Main {
	
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance(); // getInstance가 static으로 만들어짐
		Singleton s2= Singleton.getInstance(); // getInstance가 static으로 만들어짐
	
		System.out.println("s1의 주소: "+s1);
		System.out.println("s2의 주소: "+s2);
	
	if(s1==s2) {
		System.out.println("s1과 s2는 주소가 같습니다.");
	}
	
	else
	{
		System.out.println("s1과 s2는 주소가 다릅니다.");
	}
	
}
}
