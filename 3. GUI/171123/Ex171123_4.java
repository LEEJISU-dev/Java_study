package Ex171123;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 세자리 숫자 랜덤 출력
	- ActionListener actionPerformed
*/
class MySpin extends JFrame implements ActionListener {
	private JLabel[] labels;
	private JButton button;
	private int numbers[];

	MySpin() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		labels = new JLabel[3];
		numbers = new int[3];

		for (int i = 0; i < 3; i++) {
			labels[i] = new JLabel("" + numbers[i]);
			labels[i].setFont(new Font("serif", Font.BOLD | Font.ITALIC, 100));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100 + 100 * i, 20);
			panel.add(labels[i]);
		}

		button = new JButton("스핀");
		button.setSize(250, 50);
		button.setLocation(100, 150);
		panel.add(button);
		button.addActionListener(this);

		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 3; i++) {
			numbers[i] = (int) (Math.random() * 10);
			labels[i].setText("" + numbers[i]);
		}

	}
}

public class Ex171123_4 {

	public static void main(String[] args) {
		new MySpin();
	}

}
