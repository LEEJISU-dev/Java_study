package Ex171115;
import javax.swing.*;
import java.awt.*;

/* GUI
- 버튼 만들기
- BorderLayout
*/
public class BorderLayoutEx extends JFrame{
	BorderLayoutEx(){
		setTitle("BorderLayoutSample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		
		c.setLayout(new BorderLayout());
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
