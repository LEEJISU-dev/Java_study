package Ex171123;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 환율계산기 (원화 -> 엔화 or 달러)
	- ActionListener actionPerformed
*/
class Change extends JFrame {
	private JButton b1, b2;
	private JTextField t1, t2;

	Change() {
		Listener listener = new Listener();
		JPanel panel = new JPanel();
		panel.add(new JLabel("금액"));
		t1 = new JTextField(15);
		t1.addActionListener(listener);
		panel.add(t1);

		b1 = new JButton("엔화");
		b1.addActionListener(listener);
		panel.add(b1);
		b2 = new JButton("달러");
		b2.addActionListener(listener);
		panel.add(b2);
		t2 = new JTextField(15);
		t2.addActionListener(listener);
		t2.setEditable(false);
		panel.add(t2);
		setSize(300, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);

	}

	private class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String mon = t1.getText();
			double won = Integer.parseInt(mon);
			if (e.getSource() == b1) {			// 엔화
				t2.setText("" + (won * 0.98));
			} else if (e.getSource() == b2) {	// 달러
				t2.setText("" + (won * 1.1));
			}

		}

	}
}

public class Ex171123_3 {

	public static void main(String[] args) {
		new Change();

	}

}
