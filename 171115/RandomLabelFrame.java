package Ex171115;

import java.awt.*;
import javax.swing.*;

/* GUI
	- 랜덤으로 사각형 찍기
*/
public class RandomLabelFrame extends JFrame {
	public RandomLabelFrame() {
		super("Random Labels");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 0; i < 20; i++) {
			JLabel l = new JLabel(Integer.toString(i));
			l.setOpaque(true);
			l.setBackground(Color.BLUE);

			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;

			l.setSize(10, 10);
			l.setLocation(x, y);
			c.add(l);
		}
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new RandomLabelFrame();

	}

}