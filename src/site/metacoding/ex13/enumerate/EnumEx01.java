package site.metacoding.ex13.enumerate;

// 인터페이스의 변수는 public static final 이 생략되어있다.
interface Direction {
	String LEFT = "Left";
	String RIGHT = "Right";
}

public class EnumEx01 {

	public static void add(String direction) {
		// "Left", "Right"
		if (direction.equals("Left") || direction.equals("Right")) {
			System.out.println(direction);
			System.out.println("정상");
		} else {
			System.out.println("입력오류");
		}
	}

	public static void main(String[] args) {
		add(Direction.LEFT);
	}

}
