package Ex171115;

import javax.swing.*;
import java.awt.*;

/* GUI
	- 계산기 모양 만들기
*/
public class Calculator extends JFrame {
	Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	class NorthPanel extends JPanel {
		public NorthPanel() {
			Container c = getContentPane();
			c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));

			c.add(new JTextField("\t"));
			c.add(new JButton("clear"));
		}
	}

	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(new GridLayout(5, 4, 5, 5));
			add(new JButton("AC"));
			add(new JButton("+/-"));
			add(new JButton("%"));
			add(new JButton("/"));
			add(new JButton("7"));
			add(new JButton("8"));
			add(new JButton("9"));
			add(new JButton("X"));
			add(new JButton("4"));
			add(new JButton("5"));
			add(new JButton("6"));
			add(new JButton("-"));
			add(new JButton("1"));
			add(new JButton("2"));
			add(new JButton("3"));
			add(new JButton("+"));
			add(new JButton(" "));
			add(new JButton("0"));
			add(new JButton("."));
			add(new JButton("="));
		}
	}

	public static void main(String[] args) {
		new Calculator();

	}

}