package site.metacoding.ex13.bubble.ex04;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * ����: smooth�� �¿� �̵�! (Ű���带 ������ �ִ� ���� right�޼��带 �ѹ��� �����ϰ� �ʹ�!!)
 */

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true); // ���ο� paintComponent() ȣ���ڵ尡 �ִ�.
	}

	// ���� ������ new�ϴ� ��
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("Image/backgroundMap.png"));
		setContentPane(backgroundMap); // ��׶��� ȭ�� ����

		player = new Player(); // player�� jlabel�̴ϱ� �ص� ��
		add(player);
	}

	// ���� ������ ���� ��� ����
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // jframe�� �⺻ jpanel�� ���̾ƿ� ���� !
		setLocationRelativeTo(null); // �η� �ָ� ��� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ�� �� jvm���� �����ϱ�
	}

	private void initListener() { // Ÿ�ٴ���� ����! Ű���崩���°Ŵϱ�,,, ��� ����� jframe
		addKeyListener(new KeyListener() { // Ÿ���� keylistener���� �� �ִ�.

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { // Ű���� ������ ����
				// �ݹ�޼���: ��� ȣ�����ش�. �ٸ��Լ��� �μ��� ���޵ȴ�.
				System.out.println("Ű���� ������");

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// isright�� false -> isright�� private�̴ϱ� player���� getter,setter���������Ѵ�.
					player.setRight(false);

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// isleft �� false
					player.setLeft(false);

				}
			}

			@Override
			public void keyPressed(KeyEvent e) { // Ű���带 ������
				// �����̴� å���� player�� ���� �����Ƿ�, ���⼭�� ���� ���ְ� playerŬ�������� �޼ҵ带 �������Ѵ�.

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // Ű���带 ������ �ִ� ���� right�޼��带 �ѹ��� �����ϰ� �ʹ�!!
					if (player.isRight() == false) {
						player.right();
					}
				}

				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (player.isLeft() == false) {
						player.left();
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}