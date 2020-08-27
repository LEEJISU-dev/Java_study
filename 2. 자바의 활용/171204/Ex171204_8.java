package Ex171204;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Thread & GUI
 * 		- 카운트다운 중 강제종료
 * 		- 1. interrupt()
*/
class TimerRunnable implements Runnable {
	JLabel tl;

	public TimerRunnable(JLabel tl) {
		this.tl = tl;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			tl.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

}

public class Ex171204_8 extends JFrame {
	Thread th;

	public Ex171204_8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel tl = new JLabel();
		tl.setFont(new Font("Gothic", Font.ITALIC, 80));

		TimerRunnable runnable = new TimerRunnable(tl);
		th = new Thread(runnable);
		c.add(tl);

		JButton b = new JButton("kill");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();	// 강제종료
				JButton b = (JButton) e.getSource();
				b.setEnabled(false);
			}
		});
		c.add(b);
		setSize(300, 150);
		setVisible(true);

		th.start();
	}

	public static void main(String[] args) {
		new Ex171204_8();

	}

}
