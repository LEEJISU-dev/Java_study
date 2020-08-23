package Ex171127;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 계산기 구현하기 풀이
*/
public class Ex171127_1 extends JFrame {
	JTextArea t = new JTextArea(2, 20);
	JButton p, m, g, n, c, result, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
	int total = 0, temp = 0;
	boolean count = false;
	String str;

	Ex171127_1() {
		Container ct = getContentPane();
		JPanel jp = new JPanel(new GridLayout(4, 3, 5, 5));
		JPanel jp1 = new JPanel(new GridLayout(4, 1, 5, 5));
		ct.setLayout(new FlowLayout());
		ct.add(t);

		P pl = new P();
		M ma = new M();
		G gu = new G();
		N na = new N();
		R re = new R();
		C cc = new C();
		p = new JButton("+");
		p.addActionListener(pl);
		m = new JButton("-");
		m.addActionListener(ma);
		g = new JButton("*");
		g.addActionListener(gu);
		n = new JButton("/");
		n.addActionListener(na);
		c = new JButton("C");
		c.addActionListener(cc);
		result = new JButton("=");
		result.addActionListener(re);

		NumPad np = new NumPad();

		b0 = new JButton("0");
		b0.addActionListener(np);
		b1 = new JButton("1");
		b1.addActionListener(np);
		b2 = new JButton("2");
		b2.addActionListener(np);
		b3 = new JButton("3");
		b3.addActionListener(np);
		b4 = new JButton("4");
		b4.addActionListener(np);
		b5 = new JButton("5");
		b5.addActionListener(np);
		b6 = new JButton("6");
		b6.addActionListener(np);
		b7 = new JButton("7");
		b7.addActionListener(np);
		b8 = new JButton("8");
		b8.addActionListener(np);
		b9 = new JButton("9");
		b9.addActionListener(np);

		jp.add(b7);
		jp.add(b8);
		jp.add(b9);
		jp.add(b4);
		jp.add(b5);
		jp.add(b6);
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		jp.add(b0);
		jp.add(result);
		jp.add(c);
		ct.add(jp);

		jp1.add(p);
		jp1.add(m);
		jp1.add(g);
		jp1.add(n);
		ct.add(jp1);

		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setForeground(Color.BLACK);
		setSize(250, 240);
		setVisible(true);
	}

	class NumPad implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b0)
				t.append("0");
			else if (e.getSource() == b1)
				t.append("1");
			else if (e.getSource() == b2)
				t.append("2");
			else if (e.getSource() == b3)
				t.append("3");
			else if (e.getSource() == b4)
				t.append("4");
			else if (e.getSource() == b5)
				t.append("5");
			else if (e.getSource() == b6)
				t.append("6");
			else if (e.getSource() == b7)
				t.append("7");
			else if (e.getSource() == b8)
				t.append("8");
			else if (e.getSource() == b9)
				t.append("9");
		}

	}

	class P implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				temp = Integer.parseInt(t.getText());
				if (str.equals("+"))
					total = total + temp;
				else if (str.equals("-"))
					total = total - temp;
				else if (str.equals("*"))
					total = total * temp;
				else if (str.equals("/"))
					total = total / temp;
			} catch (NullPointerException ee) {
			} finally {
				if (!count)// 계산 끝나면 초기화
					total = temp;
				str = "+";
				count = true;
				t.setText("");
			}
		}

	}

	class M implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				temp = Integer.parseInt(t.getText());
				if (str.equals("+"))
					total = total + temp;
				else if (str.equals("-"))
					total = total - temp;
				else if (str.equals("*"))
					total = total * temp;
				else if (str.equals("/"))
					total = total / temp;
			} catch (NullPointerException ee) {
			} finally {
				if (!count)// 계산 끝나면 초기화
					total = temp;
				str = "-";
				count = true;
				t.setText("");
			}

		}

	}

	class G implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				temp = Integer.parseInt(t.getText());
				if (str.equals("+"))
					total = total + temp;
				else if (str.equals("-"))
					total = total - temp;
				else if (str.equals("*"))
					total = total * temp;
				else if (str.equals("/"))
					total = total / temp;
			} catch (NullPointerException ee) {
			} finally {
				if (!count)// 계산 끝나면 초기화
					total = temp;
				str = "*";
				count = true;
				t.setText("");
			}

		}

	}

	class N implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				temp = Integer.parseInt(t.getText());
				if (str.equals("+"))
					total = total + temp;
				else if (str.equals("-"))
					total = total - temp;
				else if (str.equals("*"))
					total = total * temp;
				else if (str.equals("/"))
					total = total / temp;
			} catch (NullPointerException ee) {
			} finally {
				if (!count)// 계산 끝나면 초기화
					total = temp;
				str = "/";
				count = true;
				t.setText("");
			}

		}

	}

	class R implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (temp == 0)
				t.setText(t.getText());
			else {
				try {
					temp = Integer.parseInt(t.getText());
					if (str.equals("+"))
						total += temp;
					else if (str.equals("-"))
						total -= temp;
					else if (str.equals("*"))
						total *= temp;
					else if (str.equals("/"))
						total /= temp;
					t.setText(total + "");
				} catch (Exception ee) {
					t.setText("0");
				}

			}
			temp = 0;
			count = false;

		}

	}

	class C implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			t.setText("");
			total = 0;
			temp = 0;
			count = false;
		}

	}

	public static void main(String[] args) {
		Ex171127_1 cal = new Ex171127_1();

	}

}
