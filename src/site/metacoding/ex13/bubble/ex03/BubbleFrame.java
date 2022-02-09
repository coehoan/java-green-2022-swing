package site.metacoding.ex13.bubble.ex03;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author ��Ÿ�ڵ�
 * @���� : ĳ���� �¿��̵�
 */

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
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

	private void initListener() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Ű���� ������");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// ���� 37 ������ 39 �� 38 �Ʒ� 40
				System.out.println("Ű���� ������" + e.getKeyCode());

				if (e.getKeyCode() == 39) {
					player.right();
				}
				System.out.println("Ű���� ������" + e.getKeyCode());

				if (e.getKeyCode() == 37) {
					player.left();
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
