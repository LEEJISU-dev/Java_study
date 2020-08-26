package Ex171201;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 텍스트 입력-> textarea에 저장
*/
class MyFrame extends JFrame implements ActionListener {
	private JTextField tf;	// 한줄
	private JTextArea ta;	// 여러줄

	MyFrame() {
		setTitle("TextArea Test");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tf = new JTextField(30);
		tf.addActionListener(this);

		ta = new JTextArea(10, 30);
		ta.setEditable(false);

		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = tf.getText();
		ta.append(text + "\n");
		tf.selectAll();// 모든 문자 선택
		ta.setCaretPosition(ta.getDocument().getLength());
		// 커서를 맨 마지막으로 가게 함

	}
}

public class Ex171201_1 {

	public static void main(String[] args) {
		new MyFrame();

	}

}
