package Ex171120;

import java.awt.*;
import javax.swing.*;

/* GUI
 	- 창 밑부분에 확인, 취소 버튼 삽입
*/
class MyFrame extends JFrame{
	MyFrame(){
		setTitle("Hi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(200, 300);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 2));
		JButton b1 = new JButton("확인");
		JButton b2 = new JButton("취소");
		p1.add(b1);
		p1.add(b2);
		
		add(p1, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}
public class Ex171120_1 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}

}
