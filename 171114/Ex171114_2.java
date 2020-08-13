package Ex171114;

import java.awt.FlowLayout;
import javax.swing.*;

/* GUI
  	- 창만들기 
  	- 버튼 삽입
*/
class MyFrame2 extends JFrame {
	MyFrame2() {
		setLocation(200, 300); // this. 이 생략된 것. (this.setLocation)
		setTitle("창 만들기");
		setSize(300, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("메롱");
		JButton button1 = new JButton("까꿍");
		this.setLayout(new FlowLayout()); // FlowLayout -> 가운데에서부터 물흐르듯이.
		this.add(button);
		this.add(button1);
		
		setVisible(true);
	}
}
public class Ex171114_2 {

	public static void main(String[] args) {
		MyFrame2 f1 = new MyFrame2();

	}

}
