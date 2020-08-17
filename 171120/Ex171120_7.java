package Ex171120;

import javax.swing.*;
import java.awt.*;

/* GUI
	- 버튼 삽입 위치 알아보기
	- GridLayout, BorderLayout
*/

class MF2 extends JFrame {
	MF2() {
		setTitle("Hi");
		setSize(200, 300);
		setLocation(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 2));
		JButton b1 = new JButton("오른쪽");
		JButton b2 = new JButton("왼쪽");
		p1.add(b1);
		p1.add(b2);
		add(p1, BorderLayout.NORTH);

		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2, 1));
		JButton b3 = new JButton("상");
		JButton b4 = new JButton("하");
		p2.add(b3);
		p2.add(b4);

		JButton p5 = new JButton("입력");
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(2, 1));
		JButton b6 = new JButton("좌");
		JButton b7 = new JButton("우");
		p3.add(b6);
		p3.add(b7);

		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(1, 3));
		p4.add(p2);
		p4.add(p5);
		p4.add(p3);
		add(p4, BorderLayout.SOUTH);

		this.setVisible(true);
	}
}

public class Ex171120_7 {

	public static void main(String[] args) {
		MF2 f2 = new MF2();

	}

}
