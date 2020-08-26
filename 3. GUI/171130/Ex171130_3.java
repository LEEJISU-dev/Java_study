package Ex171130;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 숫자 맞추기 게임(미완성)
*/
public class Ex171130_3 extends JFrame implements ActionListener, KeyListener {
	JLabel label1, label2;
	JPanel p;
	JButton b1, b2;
	JTextField t1;
	int num;
	int temp = 0;

	Ex171130_3() {
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label1 = new JLabel("숫자 추측");
		label2 = new JLabel("");
		b1 = new JButton("다시한번");
		b1.addActionListener(this);
		b2 = new JButton("종료");
		b2.addActionListener(this);
		t1 = new JTextField(10);
		t1.addKeyListener(this);
		p = new JPanel();
		p.add(label1);
		p.add(t1);

		p.add(label2);
		p.add(b1);
		p.add(b2);
		add(p);
		setVisible(true);
	}

	void Num() {
		num = (int) (Math.random() * 100);
		if (temp == num) {
			label2.setText("정답입니다.");
		} else if (temp > num) {
			label2.setText("너무 높습니다.");
		} else if (temp < num) {
			label2.setText("너무 낮습니다. ");
		}
	}

	public static void main(String[] args) {
		new Ex171130_3();

	}
	// 마우스 입력
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			temp = Integer.parseInt(t1.getText());
			Num();
		} else if (e.getSource() == b2) {
			System.exit(0);
		}

	}
	// 키보드 입력
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == e.VK_ENTER)
			Num();
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
}
