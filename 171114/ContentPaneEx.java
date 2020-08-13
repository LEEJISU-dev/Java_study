package Ex171114;

import java.awt.*;
import javax.swing.*;
 /* GUI
	- 창만들기
	- 버튼 삽입
	- 창 색 바꾸기
	- 창 크기 바꾸기
*/

public class ContentPaneEx extends JFrame {
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();
	}
 
}