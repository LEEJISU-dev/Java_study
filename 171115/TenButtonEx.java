package Ex171115;

import javax.swing.*;
import java.awt.*;
/* GUI
	- 0 ~ 9까지 일렬 정렬
	- 색깔 정렬
*/
public class TenButtonEx extends JFrame {
	TenButtonEx(){
		setTitle("Ten Button Frame");//super("Ten Button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
	
		JButton[] btn = new JButton[10];
		Color [] color ={Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
						Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
						Color.PINK, Color.LIGHT_GRAY};
		for(int i=0; i<btn.length;i++){
			btn[i] =new JButton(Integer.toString(i));
			btn[i].setOpaque(true);//투명도
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		
		setSize(500, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new TenButtonEx();

	}

}