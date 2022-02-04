package site.metacoding.ex13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutEx01 extends MyFrame{
	
	public BorderLayoutEx01() {
		super(500,500);
		
		JPanel panel = (JPanel) getContentPane();
		panel.setLayout(new BorderLayout()); // default가 BorderLayout이기 때문에 생략가능
		
		JButton btnNorth = new JButton("북쪽");
		JButton btnEast = new JButton("동쪽");
		JButton btnWest = new JButton("서쪽");
		JButton btnSouth = new JButton("남쪽");
		JButton btnCenter = new JButton("가운데");
		
//		panel.add(btnNorth,BorderConstant.NORTH);
//		panel.add(btnCenter,BorderConstant.CENTER);
//		panel.add(btnEast,BorderConstant.EAST);
//		panel.add(btnSouth,BorderConstant.SOUTH);
//		panel.add(btnWest,BorderConstant.WEST);
		
		panel.add(btnNorth,BorderLayout.NORTH);
		panel.add(btnCenter,BorderLayout.CENTER);
		panel.add(btnEast,BorderLayout.EAST);
		panel.add(btnSouth,BorderLayout.SOUTH);
		panel.add(btnWest,BorderLayout.WEST);
		
		setVisible(true); // paint 메서드
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx01();
	}

}
