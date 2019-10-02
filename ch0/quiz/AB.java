package ch0.quiz;

public class AB {
	public static void main(String args[]) {
		int temp, temp2;
		A objecta = new A();
		temp = objecta.add(10, 20);
		temp2 = B.m2(100);

		System.out.println("temp = " + temp);
		System.out.println("temp2 = " + temp2);
	}

}
