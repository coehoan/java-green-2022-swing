package site.metacoding.ex13.enumerate;

enum Way {
	Left, Right;
}

public class EnumEx02 {
	public static void add(Way way) {
		if (way.equals("Left") || way.equals("Right")) {
			System.out.println(way);
			System.out.println("정상");
		} else {
			System.out.println("입력오류");
		}
	}

	public static void main(String[] args) {
		add(Way.Left);
	}

}
