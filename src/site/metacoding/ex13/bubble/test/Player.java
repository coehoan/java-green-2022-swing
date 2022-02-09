package site.metacoding.ex13.bubble.test;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	// 선언
	private int x;
	private int y;
	private ImageIcon playerR;
	private ImageIcon playerL;
	// 이동 메서드는 이동을 하거나 안하거나로 받아야 하기 때문에 boolean타입으로 받는다.
	private boolean isRight;
	private boolean isLeft;
	private boolean isJump;
	// SPEED가 변경하는걸 대비하여 변수로 만든다.
	private static final int JUMPSPEED = 2;
	private static final int SPEED = 4;

	// 이동 메서드를 private로 만들었기 때문에 Getter,Setter를 만들고 이걸로 제어를 한다.
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

	// 생성자로 메서드를 받는다
	public Player() {
		initObject();
		initSetting();
	}

	// new 하는 것
	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}

	// 초기세팅
	private void initSetting() {
		// 플레이어 초기 위치
		x = 75;
		y = 535;
		// 플레이어 초기 아이콘
		setIcon(playerR);
		// 플레이어 사이즈
		setSize(50, 50);
		// paintComponent 호출하여 플레이어 그려주기
		setLocation(x, y);
		// 초기엔 이동이 있으면 안되니 false로 선언
		isRight = false;
		isLeft = false;
		isJump = false;
	}

	// 왼쪽 이동 메서드
	public void left() {
		// while문을 쓰기위해 true로 선언
		isLeft = true;
		setIcon(playerL); // 왼쪽을 바라보는 이미지로 변경

		// GUI 프로그래밍에서 새로운 이벤트는 새로운 스레드를 만들어서 실행해준다.
		// main스레드에 바로 넣을경우 순차적으로 실행되기 때문에 동시실행 불가능
		new Thread(() -> {
			while (isLeft) {
				x = x - SPEED;
				setLocation(x, y);
				// CPU에게 0.01초 쉬는시간을 줘서 0.01초마다 while문을 돌려준다.
				try {
					Thread.sleep(10);
				} catch (Exception e) { // 타입을 부모타입인 Exception으로 받아서 모든 Exception을 받을 수 있게 한다.
					e.printStackTrace();
				}
			}
		}).start(); // 스레드 시작

	}

	// 오른쪽 이동 메서드
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

	// 점프 메서드
	public void jump() {
		isJump = true;

		new Thread(() -> {
			// 점프는 일정높이까지 올라가야하니 for문을 사용해준다
			// 올라가는 for문
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y - JUMPSPEED; // y가 0이면 왼쪽상단에 캐릭터가 존재하기때문에 초기값을 535로 잡아서 밑에 생성시켰고 -를 통해 점프하게만든다.
				setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// 내려오는 for문
			for (int i = 0; i < 130 / JUMPSPEED; i++) {
				y = y + JUMPSPEED; // 내려오니간 +로 잡아준다.
				setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			isJump = false; // for문이 다 돌고나면 false로 변경해준다.
		}).start();
	}

}
