package site.metacoding.ex13;

import javax.swing.JFrame;

// Ctrl+Shift+F - 자동정렬
// Ctrl+Shift+O - import
public class MyFrame extends JFrame {

	public MyFrame() {
		super(); // 생략되어있음
		System.out.println("MyFrame 디폴트");
		setSize(600, 400); // width, height
		setLocationRelativeTo(null); // 프레임 화면 중앙에 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 메인 종료
	}
	public MyFrame(int w, int h) {
		super(); // 생략되어있음
		System.out.println("MyFrame 오버로딩된 생성자");
		setSize(w, h); // width, height
		setLocationRelativeTo(null); // 프레임 화면 중앙에 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 메인 종료
	}
}
