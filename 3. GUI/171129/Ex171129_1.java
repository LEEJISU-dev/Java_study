package Ex171129;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 클릭시 이미지 출력하기
	- ActionListener actionPerformed
*/
public class Ex171129_1 extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel label;
	private JButton b;

	Ex171129_1() {
		setTitle("이미지 레이블");
		setSize(300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		label = new JLabel("이미지를 보려면 아래 버튼을 클릭하세요");
		b = new JButton("이미지 레이블");
		b.addActionListener(this);

		panel.add(label);
		panel.add(b);
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex171129_1();// Ex171129_1 i = new Ex171129_1();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ImageIcon dog = new ImageIcon("dog.png");
		label.setIcon(dog);
		label.setText(null);

	}

}
