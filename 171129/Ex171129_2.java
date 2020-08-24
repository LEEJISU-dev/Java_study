package Ex171129;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 체크박스 체크시 이미지 출력하기
	- ItemListener itemStateChanged
*/
public class Ex171129_2 extends JPanel implements ItemListener {
	JCheckBox[] buttons = new JCheckBox[3];// flow->jpanel상속받아서
	String[] f = { "apple", "grape", "orange" };
	JLabel[] picLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];

	Ex171129_2() {
		// setLayout(new GridLayout(1, 4));//행을 고정
		super.setLayout(new GridLayout(0, 4));// 열만 고정 행은 자동생성
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JCheckBox(f[i]);
			buttons[i].addItemListener(this);
			icon[i] = new ImageIcon(f[i] + ".gif");
			picLabel[i] = new JLabel(f[i]);
		}
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for (int i = 0; i < 3; i++) {
			checkPanel.add(buttons[i]);
		}
		add(checkPanel);
		add(picLabel[0]);
		add(picLabel[1]);
		add(picLabel[2]);

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Check Box");
		JComponent newContentpane = new Ex171129_2();// 다형성 jcomponent가 상위 클래스
		newContentpane.setOpaque(true);// 투명도 (투명하게 함)
		frame.setContentPane(newContentpane);
		frame.setSize(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		ImageIcon image = null;
		Object source = e.getItemSelectable();
		for (int i = 0; i < 3; i++) {
			if (source == buttons[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED)// 선택해제
					picLabel[i].setIcon(null);
				else
					picLabel[i].setIcon(icon[i]);
			}
		}

	}

}
