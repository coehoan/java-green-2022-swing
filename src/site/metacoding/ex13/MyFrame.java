package site.metacoding.ex13;

import javax.swing.JFrame;

// Ctrl+Shift+F - �ڵ�����
// Ctrl+Shift+O - import
public class MyFrame extends JFrame {

	public MyFrame() {
		super(); // �����Ǿ�����
		System.out.println("MyFrame ����Ʈ");
		setSize(600, 400); // width, height
		setLocationRelativeTo(null); // ������ ȭ�� �߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� ���� ����
	}
	public MyFrame(int w, int h) {
		super(); // �����Ǿ�����
		System.out.println("MyFrame �����ε��� ������");
		setSize(w, h); // width, height
		setLocationRelativeTo(null); // ������ ȭ�� �߾ӿ� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� ���� ����
	}
}
