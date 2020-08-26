package Ex171129;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 체크박스 선택시 총액 계산하기
	- ItemListener itemStateChanged
*/
public class Ex171129_3 extends JFrame implements ItemListener {
	JCheckBox[] c = new JCheckBox[4];
	String[] item = { "목걸이", "반지", "귀걸이", "팔찌" };
	int[] price = { 20, 20, 10, 15 };
	JLabel label = new JLabel();

	int sum = 0;

	Ex171129_3() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));
		JPanel panel2 = new JPanel(new GridLayout(0, 4));
		for (int i = 0; i < 4; i++) {
			c[i] = new JCheckBox(item[i]);
			c[i].addItemListener(this);
			panel2.add(c[i]);
		}
		label = new JLabel("상품의 총액은 " + sum + "만원 입니다.");
		label.setFont(new Font("굴림", Font.BOLD, 15));
		add(panel2);
		add(label);
		setVisible(true);

	}

	public static void main(String[] args) {
		Ex171129_3 s = new Ex171129_3();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		for (int i = 0; i < 4; i++) {
			if (source == c[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED)// 선택해제
					sum = sum - price[i];
				else
					sum += price[i];
				label.setText("상품의 총액은 " + sum + "만원 입니다.");
			}
		}

	}
}
