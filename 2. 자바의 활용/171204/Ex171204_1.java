package Ex171204;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 카운트 다운
	- Thread
*/
public class Ex171204_1 extends JFrame implements ActionListener {
	private JLabel label;
	private JButton button;
	private JPanel p;

	Ex171204_1() {
		setTitle("count Down");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("start");
		button = new JButton("시작");
		button.addActionListener(this);
		p = new JPanel();
		p.add(label);
		p.add(button);
		label.setFont(new Font("serif", Font.BOLD, 100));
		add(p);

		setSize(250, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex171204_1 t = new Ex171204_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new MyThread1().start();
	}

	class MyThread1 extends Thread {
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				label.setText(i + " ");
			}
		}
	}
}
