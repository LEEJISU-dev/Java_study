package Ex171124;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 계산기 구현하기
*/
public class Ex171124_1 extends JFrame implements ActionListener {
	private JButton b[] = new JButton[16];
	private JButton bb;
	private JLabel t1;
	int num, temp, result;
	String tempF, tempInput = "";
	boolean finish = false;

	Ex171124_1() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		t1 = new JLabel("0");
		t1.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 50));

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.add(t1);

		p2.setLayout(new GridLayout(4, 4, 10, 10));
		String bv[] = { "7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "-", "C", "0", "=", "+" };
		for (int i = 0; i < 16; i++) {
			b[i] = new JButton(bv[i]);
			p2.add(b[i]);
			b[i].addActionListener(this);
			b[i].setBackground(Color.LIGHT_GRAY);
			b[i].setFont(new Font("굴림", Font.BOLD, 18));
			if (i == 3 || i == 7 || i == 11 || i == 12 || i == 14 || i == 15) {
				b[i].setBackground(Color.DARK_GRAY);
				b[i].setForeground(Color.WHITE);
			}
		}
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String input = e.getActionCommand();
		if (input.equals("+")) {
			num = temp;
			tempF = "+";
			tempInput = "";
		} else if (input.equals("-")) {
			num = temp;
			tempF = "-";
			tempInput = "";
		} else if (input.equals("*")) {
			num = temp;
			tempF = "*";
			tempInput = "";
		} else if (input.equals("/")) {
			num = temp;
			tempF = "/";
			tempInput = "";
		} else if (input.equals("C")) {
			tempInput = "";
			temp = 0;
			num = 0;
			t1.setText("0");
		} else if (input.equals("=")) {
			if (tempF.equals("+")) {
				result = num + temp;
				t1.setText(String.valueOf(result));
				finish = true;
			} else if (tempF.equals("-")) {
				result = num - temp;
				t1.setText(String.valueOf(result));
				finish = true;
			} else if (tempF.equals("*")) {
				result = num * temp;
				t1.setText(String.valueOf(result));
				finish = true;
			} else if (tempF.equals("/")) {
				result = num / temp;
				t1.setText(String.valueOf(result));
				finish = true;
			}
		} else {
			if (finish) {
				t1.setText("0");
				finish = false;
				temp = 0;
				num = 0;
				tempInput = "";
			}
			tempInput += e.getActionCommand();
			System.out.println(tempInput);
			t1.setText(tempInput);
			temp = Integer.parseInt(tempInput);
		}

	}

	public static void main(String[] args) {
		Ex171124_1 c = new Ex171124_1();

	}

}
