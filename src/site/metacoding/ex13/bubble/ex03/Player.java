package site.metacoding.ex13.bubble.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author ��Ÿ�ڵ� �÷��̾�� �¿� �̵��� �����ϴ�. ������ �����ϴ� ��� �߻�
 */

public class Player extends JLabel {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	public Player() {
		initObjct();
		initSetting();
	}

	private void initObjct() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}

	private void initSetting() {
		x = 50;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	public void left() {
		System.out.println("���� �̵�");
		x = x - 10;
		setLocation(x, y);
		setIcon(playerL);

	}

	public void right() {
		System.out.println("������ �̵�");
		x = x + 10;
		setLocation(x, y);
		setIcon(playerR);
	}

}
