package site.metacoding.ex13.bubble.test;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	// ����
	private int x;
	private int y;
	private ImageIcon playerR;
	private ImageIcon playerL;
	// �̵� �޼���� �̵��� �ϰų� ���ϰų��� �޾ƾ� �ϱ� ������ booleanŸ������ �޴´�.
	private boolean isRight;
	private boolean isLeft;
	private boolean isJump;
	// SPEED�� �����ϴ°� ����Ͽ� ������ �����.
	private static final int JUMPSPEED = 2;
	private static final int SPEED = 4;

	// �̵� �޼��带 private�� ������� ������ Getter,Setter�� ����� �̰ɷ� ��� �Ѵ�.
	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	public boolean isJump() {
		return isJump;
	}

	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

	// �����ڷ� �޼��带 �޴´�
	public Player() {
		initObject();
		initSetting();
	}

	// new �ϴ� ��
	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}

	// �ʱ⼼��
	private void initSetting() {
		// �÷��̾� �ʱ� ��ġ
		x = 75;
		y = 535;
		// �÷��̾� �ʱ� ������
		setIcon(playerR);
		// �÷��̾� ������
		setSize(50, 50);
		// paintComponent ȣ���Ͽ� �÷��̾� �׷��ֱ�
		setLocation(x, y);
		// �ʱ⿣ �̵��� ������ �ȵǴ� false�� ����
		isRight = false;
		isLeft = false;
		isJump = false;
	}

	// ���� �̵� �޼���
	public void left() {
		// while���� �������� true�� ����
		isLeft = true;
		setIcon(playerL); // ������ �ٶ󺸴� �̹����� ����

		// GUI ���α׷��ֿ��� ���ο� �̺�Ʈ�� ���ο� �����带 ���� �������ش�.
		// main�����忡 �ٷ� ������� ���������� ����Ǳ� ������ ���ý��� �Ұ���
		new Thread(() -> {
			while (isLeft) {
				x = x - SPEED;
				setLocation(x, y);
				// CPU���� 0.01�� ���½ð��� �༭ 0.01�ʸ��� while���� �����ش�.
				try {
					Thread.sleep(10);
				} catch (Exception e) { // Ÿ���� �θ�Ÿ���� Exception���� �޾Ƽ� ��� Exception�� ���� �� �ְ� �Ѵ�.
					e.printStackTrace();
				}
			}
		}).start(); // ������ ����

	}

	// ������ �̵� �޼���
	public void right() {
		isRight = true;
		setIcon(playerR);
		new Thread(() -> {
			while (isRight) {
				x = x + SPEED;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	// ���� �޼���
	public void jump() {
		isJump = true;

		new Thread(() -> {
			// ������ �������̱��� �ö󰡾��ϴ� for���� ������ش�
			// �ö󰡴� for��
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y - JUMPSPEED; // y�� 0�̸� ���ʻ�ܿ� ĳ���Ͱ� �����ϱ⶧���� �ʱⰪ�� 535�� ��Ƽ� �ؿ� �������װ� -�� ���� �����ϰԸ����.
				setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// �������� for��
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y + JUMPSPEED; // �������ϰ� +�� ����ش�.
				setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			isJump = false; // for���� �� ������ false�� �������ش�.
		}).start();
	}

}
