package Ex171114;

import java.awt.*;
import javax.swing.*;

/* GUI
	- 창 만들기
	- 버튼 삽입
	- 레이아웃 
*/
class MF3 extends JFrame {
	public MF3() {
		this.setTitle("레이아웃 잡기");
		this.setSize(400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Button("Center"), BorderLayout.CENTER); // 기본적으로 레이아웃은 BorderLayout.
		add(new Button("East"), BorderLayout.EAST);
		add(new Button("West"), BorderLayout.WEST);
		add(new Button("North"), BorderLayout.NORTH);
		add(new Button("South"), BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
}
public class Ex171114_4 {

	public static void main(String[] args) {
		MF3 m = new MF3();

	}

}
