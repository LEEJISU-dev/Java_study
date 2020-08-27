package Ex171204;

import javax.swing.*;
import java.awt.*;

/* GUI & runnable  
 * 		- 깜빡깜빡 효과
*/
class FlickeringLabel extends JLabel implements Runnable {

	public FlickeringLabel(String text) {
		super(text);
		setOpaque(true);

		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			if (n == 0) {
				setBackground(Color.YELLOW);
				n = 1;
			} else {
				setBackground(Color.PINK);
				n = 0;
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				return;
			}
		}

	}

}

public class Ex171204_5 extends JFrame {
	public Ex171204_5() {
		setTitle("Flickering");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		FlickeringLabel flabel = new FlickeringLabel("깜빡");

		JLabel label = new JLabel("안깜빡");
		FlickeringLabel flabel2 = new FlickeringLabel("여기도깜빡");
		c.add(flabel);
		c.add(label);
		c.add(flabel2);

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex171204_5();
	}

}
