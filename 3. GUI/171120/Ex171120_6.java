package Ex171120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 버튼 클릭시 창 색상 변경
	- ActionListener (actionPerformed)
*/
public class Ex171120_6 extends JFrame {
	private JButton button1, button2;
	private JPanel panel;
	MyEvent6 listener = new MyEvent6();

	public Ex171120_6() {
		this.setTitle("생상 바꾸기 창");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		button2 = new JButton("분홍색");
		button2.addActionListener(listener);
		panel.add(button1);
		panel.add(button2);
		add(panel);
		this.setVisible(true);
	}

	public class MyEvent6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				panel.setBackground(Color.yellow);
			} else if (e.getSource() == button2) {
				panel.setBackground(Color.pink);
			}

		}

	}

	public static void main(String[] args) {
		Ex171120_6 t3 = new Ex171120_6();
	}

}
