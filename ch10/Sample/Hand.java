package ch10.Sample;

// 주먹, 가위, 보 3 종류의 손 배열을 가지고 있음.
// 이 셋 중 현재 손이 어떤 종류인지에 해당하는 값을 속성으로 가진다.
public class Hand {
	//자바에서 상수만드려면 변수앞에 final 붙여야함. 
	//상수명은 보통 대문자로 되어있음.
	public static final int HANDVALUE_GUU = 0; // 주먹을 나타내는 값

	public static final int HANDVALUE_CHO = 1; // 가위를 나타내는 값

	public static final int HANDVALUE_PAA = 2; // 보를 나타내는 값

	// hand는 가위바위보의 손을 나타내는 3개의 인스턴스를 가지고 있는 배열
	// 복수 이름을 붙이는게 좋음
	// 묵,찌,빠
	public static final Hand[] hand = { new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHO), new Hand(HANDVALUE_PAA), };

	private static final String[] name = { // 가위바위보의 손의 문자열 표현
	"주먹", "가위", "보", };

	private int handvalue; // 가위바위보의 손의 값

	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}

	// 값으로부터 Hand 인스턴스를 얻는다.
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}

	//결국 비교할때는 둘다 fight 메소드를 호출한다는 것을 알수있음
	// this가 h보다 강할 때 true를 반환함
	public boolean isStrongerThan(Hand h) { // this가 h보다 강할 때 true
		return fight(h) == 1; //현재 손이 이겼다.
	}

	// this가 h보다 약할 때 true를 반환함
	public boolean isWeakerThan(Hand h) { // this가h보다 약할 때 true
		return fight(h) == -1; //현재 손이 졌다.
	}

	// 무승부는 0, this가 이기면 1, h가 이기면 -1을 반환함
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue) { // 예: 현재 손은 바위,
			// h가 바위+1(가위)이면
			// 현재 손이 이긴다.
			return 1;
		} else {
			return -1;
		}
	}

	// 문자열 표현으로 변환
	public String toString() {
		return name[handvalue];
	}
}
