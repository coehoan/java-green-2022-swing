package site.metacoding.ex13.bubble.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import site.metacoding.ex13.bubble.ex05.Player;

public class BubbleFrame extends JFrame {
	// 선언
	private JLabel backgroundMap;
	private Player player;

	// 생성자로 메서드를 받는다
	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true); // 반드시 setVisible을 통해 화면에 출력을 시키자.
	}

	// new 하는 것
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("Image/backgroundMap.png"));
		setContentPane(backgroundMap); // JFrame의 백그라운드 이미지를 backgroundMap으로 설정한다.

		// player는 JLabel을 상속하고 있고
		// BubbleFrame은 JFrame을 상속하고 있다.
		// 둘 다 Container라는 같은 부모를 갖고있기 때문에 바로 new Player();가 가능하다.
		player = new Player(); // 플레이어 생성
		add(player); // 플레이어를 프레임안에 add한다.
	}

	// 프레임의 초기세팅
	private void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null);// JFrame의 기본 Layout은 Border이기 때문에 setLayout으로 null로 변경
		setLocationRelativeTo(null); // null 입력시 모니터 가운데에 프레임 생성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame의 X버튼 클릭시 메인종료
	}

	// Listener로 키보드의 이벤트를 주시한다.
	// 이동하는 책임은 player가 갖고있으니 선언만 해준다.
	private void initListener() {
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) { // 키보드가 떼졌을때 실행되는 메서드
				// 왼쪽 방향키가 떼졌을때 left를 false로 변경 (이동을 멈춘다)
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.setLeft(false);
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.setRight(false);
				}

			}

			@Override
			public void keyPressed(KeyEvent e) { // 키보드가 눌러졌을때 실행되는 메서드
				// keyCode가 VK_LEFT와 같을때
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					// player의 isLeft가 false일떄 left 메서드를 실행하라.
					// 초기에 false로 잡아줬기 때문에 keyCode만 맞으면 실행한다.
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
