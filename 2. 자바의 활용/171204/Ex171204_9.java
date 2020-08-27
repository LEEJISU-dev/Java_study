package Ex171204;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* Thread & GUI
 * 		- 라벨 랜덤 위치,색으로 출력하다가 마우스 클릭시 강제종료 
 * 		- 2. flag()
*/
class RandomT extends Thread {
	Container c;
	boolean flag = false;

	public RandomT(Container c) {
		this.c = c;
	}

	void finish() {
		flag = true;
	}

	public void run() {
		while (true) {
			int x = ((int) (Math.random() * c.getWidth()));
			int y = ((int) (Math.random() * c.getHeight()));

			JLabel label = new JLabel("2018");
			label.setSize(80, 30);
			label.setLocation(x, y);
			// 랜덤 컬러, 위치
			label.setForeground(new Color((int) (Math.random() * 225.0), (int) (Math.random() * 225.0),
					(int) (Math.random() * 225.0)));
			c.add(label);
			c.repaint();
			try {
				Thread.sleep(300);
				// 강제 중지
				if (flag == true) {
					c.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					c.add(label);
					c.repaint();
					return;
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class Ex171204_9 extends JFrame {
	RandomT th;

	public Ex171204_9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		setSize(300, 200);
		setVisible(true);
		th = new RandomT(c);
		th.start();
	}

	public static void main(String[] args) {
		new Ex171204_9();

	}

}
