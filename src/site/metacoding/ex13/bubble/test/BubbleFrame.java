package site.metacoding.ex13.bubble.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import site.metacoding.ex13.bubble.ex05.Player;

public class BubbleFrame extends JFrame {
	// ����
	private JLabel backgroundMap;
	private Player player;

	// �����ڷ� �޼��带 �޴´�
	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true); // �ݵ�� setVisible�� ���� ȭ�鿡 ����� ��Ű��.
	}

	// new �ϴ� ��
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("Image/backgroundMap.png"));
		setContentPane(backgroundMap); // JFrame�� ��׶��� �̹����� backgroundMap���� �����Ѵ�.

		// player�� JLabel�� ����ϰ� �ְ�
		// BubbleFrame�� JFrame�� ����ϰ� �ִ�.
		// �� �� Container��� ���� �θ� �����ֱ� ������ �ٷ� new Player();�� �����ϴ�.
		player = new Player(); // �÷��̾� ����
		add(player); // �÷��̾ �����Ӿȿ� add�Ѵ�.
	}

	// �������� �ʱ⼼��
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null);// JFrame�� �⺻ Layout�� Border�̱� ������ setLayout���� null�� ����
		setLocationRelativeTo(null); // null �Է½� ����� ����� ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame�� X��ư Ŭ���� ��������
	}

	// Listener�� Ű������ �̺�Ʈ�� �ֽ��Ѵ�.
	// �̵��ϴ� å���� player�� ���������� ���� ���ش�.
	private void initListener() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { // Ű���尡 �������� ����Ǵ� �޼���
				// ���� ����Ű�� �������� left�� false�� ���� (�̵��� �����)
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.setLeft(false);
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.setRight(false);
				}

			}

			@Override
			public void keyPressed(KeyEvent e) { // Ű���尡 ���������� ����Ǵ� �޼���
				// keyCode�� VK_LEFT�� ������
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// player�� isLeft�� false�ϋ� left �޼��带 �����϶�.
					// �ʱ⿡ false�� ������ ������ keyCode�� ������ �����Ѵ�.
					if (player.isLeft() == false) {
						player.left();
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (player.isRight() == false) {
						player.right();
					}
				}
				if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (player.isJump() == false) {
						player.jump();
					}
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}

}
