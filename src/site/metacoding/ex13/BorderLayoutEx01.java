package site.metacoding.ex13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutEx01 extends MyFrame{
	
	public BorderLayoutEx01() {
		super(500,500);
		
		JPanel panel = (JPanel) getContentPane();
		panel.setLayout(new BorderLayout()); // default�� BorderLayout�̱� ������ ��������
		
		JButton btnNorth = new JButton("����");
		JButton btnEast = new JButton("����");
		JButton btnWest = new JButton("����");
		JButton btnSouth = new JButton("����");
		JButton btnCenter = new JButton("���");
		
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
		
		setVisible(true); // paint �޼���
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx01();
	}

}
