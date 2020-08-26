package Ex171120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/* GUI
	- 버튼 누르면 내용 바꾸기
	- actionListener (actionPerformed)
*/
public class Ex171120_3 extends JFrame {
	public Ex171120_3() {
		setTitle("Action Event Listener");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		b.addActionListener(listener);
		add(b);
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex171120_3();

	}

}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if (b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");

	}

}