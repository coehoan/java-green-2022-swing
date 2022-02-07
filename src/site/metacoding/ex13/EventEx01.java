package site.metacoding.ex13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventEx01 extends JFrame {

	JPanel myPanel;
	JButton btn1, btn2;
	JCheckBox checkBox1;
	JLabel labelText, labelImg;

	public EventEx01() {
		initSetting();
		initObject();
		initAssign();
		initListener();

		setVisible(true);
	}

	private void initSetting() {
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initObject() {
		myPanel = new JPanel();
		btn1 = new JButton("��ư1");
		btn2 = new JButton("��ư2");
		checkBox1 = new JCheckBox();
		labelText = new JLabel("���̺�1");
		// ��δ� �� ������Ʈ ��ġ���� ����ΰ� �����Ǿ� �ִ�.
		labelImg = new JLabel(new ImageIcon("image/dog.jpg"));

	}

	private void initAssign() {
		add(myPanel);
		myPanel.add(btn1);
		myPanel.add(btn2);
		myPanel.add(checkBox1);
		myPanel.add(labelText);
		myPanel.add(labelImg);
	}

	private void initListener() {
		checkBox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					System.out.println("üũ�Ϸ�");
				} else if (e.getStateChange() == 2) {
					System.out.println("üũ����");
				}
			}
		});

		// �����찡 ��ư�� ���Ѻ��� �Ѵ�
		btn1.addActionListener(new ActionListener() {

			// ��ư�� Ŭ���Ǹ� �����찡 �ش� �޼��带 �ݹ����ش�.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư1 Ŭ�� �Ϸ�");
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư2 Ŭ�� �Ϸ�");
			}
		});
	}

	public static void main(String[] args) {
		new EventEx01();
	}

}
