package Ex171115;

import javax.swing.*;
import java.awt.*;

/* GUI
	- 버튼 계단식 삽입 
*/
public class NullContainerEx extends JFrame {
	NullContainerEx() {
		setTitle("NullContainer Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(null);

		JLabel la = new JLabel("Hello, Press Button");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		for (int i = 1; i <= 5; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			c.add(b);
		}
		for (int j = 6; j <= 9; j++) {
			JButton d = new JButton(Integer.toString(j));
			d.setLocation(j * 15, j * 15);
			d.setSize(50, 20);
			c.add(d);
		}
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new NullContainerEx();

	}

}