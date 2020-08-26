package Ex171123;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 카운터 감소/증가/초기화
	- ActionListener actionPerformed
*/
class MyCounter extends JFrame implements ActionListener {
	private JLabel label, label1;
	private JButton button, button1, button2;
	private int count = 0;

	MyCounter() {
		JPanel panel = new JPanel();
		label = new JLabel("Counter");
		panel.add(label);

		label1 = new JLabel("" + count);
		label1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));// 클래스 이름 통해서접근
		panel.add(label1);

		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);

		button = new JButton("카운터 증가");
		panel.add(button);
		button.addActionListener(this);

		button1 = new JButton("카운터 감소");
		panel.add(button1);
		button1.addActionListener(this);

		button2 = new JButton("초기화");
		panel.add(button2);
		button2.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {			// 카운터증가
			count++;
			label1.setText(count + "");
		} else if (e.getSource() == button1) {	// 카운터감소
			count--;
			label1.setText(count + "");
		} else if (e.getSource() == button2) {	// 초기화
			count = 0;
			label1.setText(count + "");
		}

	}
}

public class Ex171123_2 {

	public static void main(String[] args) {
		new MyCounter();

	}

}
