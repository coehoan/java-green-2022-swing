package site.metacoding.ex13.enumerate;

enum Way {
	Left, Right;
}

public class EnumEx02 {
	public static void add(Way way) {
		if (way.equals("Left") || way.equals("Right")) {
			System.out.println(way);
			System.out.println("����");
		} else {
			System.out.println("�Է¿���");
		}
	}

	public static void main(String[] args) {
		add(Way.Left);
	}

}
