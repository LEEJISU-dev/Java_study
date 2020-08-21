package Ex171123;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
 	- 숫자 입력시 제곱값 출력
 	- ActionListener actionPerformed
*/
class MyText extends JFrame {
	private JButton button;
	private JTextField text, result;

	MyText() {
		ButtonListener listener = new ButtonListener();
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력"));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		panel.add(new JLabel("제곱한 값"));
		result = new JTextField(15);
		result.setEditable(false);// 수정하는 것을 막음
		panel.add(result);

		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);

		setSize(300, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}

	// 내부 클래스
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button || e.getSource() == text) {
				String name = text.getText();
				int val = Integer.parseInt(name);
				result.setText("" + (val * val));
				text.requestFocus();// 키보드 포커스 주기

			}

		}

	}
}

public class Ex171123_1 {

	public static void main(String[] args) {
		new MyText();

	}

}
