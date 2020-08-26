package Ex171115;

import javax.swing.*;
import java.awt.*;
/* GUI
	- 버튼 만들기
	- FlowLayout
*/
public class FlowLayoutEx extends JFrame {
	FlowLayoutEx(){
		setTitle("FlowLayoutSample");//창이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//엑스표 누르면 꺼짐
		Container c =getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));//왼쪽, 수평, 수직
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}
