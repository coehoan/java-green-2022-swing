package site.metacoding.ex13.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author ��Ÿ�ڵ�
 * @���� : ���ȭ�� ����, ĳ���� �߰�
 */

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true); // ���ο� paintComponent() ȣ�� �ڵ尡 �ִ�.
	}

	// new �ϴ� ��
	private void initObject() {
		backgroundMap = new JLabel();
		backgroundMap.setIcon(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap); // ��׶��� ȭ�� ����

		player = new Player();
		add(player);
	}

	// ���� ��� ����
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // null ���̾ƿ����� ����
		setLocationRelativeTo(null); // ȭ�� ��� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư ������ ���� ����
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
