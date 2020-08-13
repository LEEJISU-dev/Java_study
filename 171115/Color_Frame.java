package Ex171115;

import javax.swing.*;
import java.awt.*;

/* GUI
	- 4 * 4 색깔 버튼 정렬 
*/
public class Color_Frame extends JFrame {
	Color_Frame() {
		setTitle("4x4 Color Frame");// super("Ten Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));

		JLabel[] b = new JLabel[16];
		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.DARK_GRAY, Color.CYAN, Color.PINK,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.WHITE, Color.LIGHT_GRAY, Color.BLUE, Color.MAGENTA,
				Color.PINK, Color.BLACK, };
		for (int i = 0; i < b.length; i++) {
			b[i] = new JLabel(Integer.toString(i));
			b[i].setOpaque(true);// 투명도
			b[i].setBackground(color[i]);
			c.add(b[i]);
		}

		setSize(500, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Color_Frame();
	}
}
