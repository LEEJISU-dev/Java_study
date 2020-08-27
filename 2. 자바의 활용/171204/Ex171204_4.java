package Ex171204;

import java.awt.*;
import javax.swing.*;

/* GUI & runnable  
 * 		- 100초 세기
*/
class Timer implements Runnable {
	JLabel tlabel;

	public Timer(JLabel tlabel) {
		this.tlabel = tlabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			tlabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

}

public class Ex171204_4 extends JFrame {
	public Ex171204_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel tlabel = new JLabel();
		tlabel.setFont(new Font("Gothic", Font.ITALIC, 80));

		Timer runnable = new Timer(tlabel);
		Thread th = new Thread(runnable);
		c.add(tlabel);
		setSize(300, 150);
		setVisible(true);
		th.start();
	}

	public static void main(String[] args) {
		new Ex171204_4();

	}

}
