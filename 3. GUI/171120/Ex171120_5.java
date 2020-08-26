package Ex171120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 버튼 누르면 버튼이름 바꾸기
	- ActionListener (actionPerformed)
*/
class EventEx implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("dd");

	}

}

public class Ex171120_5 extends JFrame {
	private JButton button;

	public Ex171120_5() {
		this.setTitle("EVENT");
		this.setSize(200, 300);
		this.setLocation(700, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("버튼을 누르시오");
		button.addActionListener(new EventEx());
		add(button);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex171120_5 l = new Ex171120_5();

	}

}
