package Ex171115;

import javax.swing.*;
import java.awt.*;

/* GUI
	- 프레임 안에 레이아웃 추가
*/
public class SimpleSwingFrame extends JFrame{
	SimpleSwingFrame(){
		setTitle("Open Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new NorthPanel(), BorderLayout.NORTH);
		add(new CenterPanel(), BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}
	//내부 클래스
	class NorthPanel extends JPanel{
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			//setLayout(new FlowLayout());
			add(new JButton("Open"));
			add(new JButton("Read"));
			add(new JButton("Close"));
		}
	}
	
	class CenterPanel extends JPanel{
		public CenterPanel(){
			setLayout(null);
			JLabel a = new JLabel("Hello");
			a.setSize(100, 20);
			a.setLocation(100, 10);
			
			JLabel b = new JLabel("JAVA");
			b.setSize(100, 20);
			b.setLocation(20, 200);
			
			JLabel c = new JLabel("Love");
			c.setSize(100, 20);
			c.setLocation(200, 150);
			
			add(a);
			add(b);
			add(c);
		}
	}
	public static void main(String[] args) {
		new SimpleSwingFrame();

	}

}