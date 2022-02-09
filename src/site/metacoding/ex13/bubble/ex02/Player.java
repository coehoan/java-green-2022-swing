package site.metacoding.ex13.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author ��Ÿ�ڵ� �÷��̾�� �¿� �̵��� �����ϴ�. ������ �����ϴ� ��� �߻�
 */

public class Player extends JLabel {

	private int x;
	private int y;
	private ImageIcon playerR;

	public Player() {
		initObjct();
		initSetting();
	}

	private void initObjct() {
		playerR = new ImageIcon("image/playerL.png");
	}

	private void initSetting() {
		x = 50;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}
}
