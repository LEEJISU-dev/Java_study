package Ex171120;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 마우스 클릭한 곳으로 hello 이동
	- MouseListener (mousePressed)
*/
public class Ex171120_4 extends JFrame{
	JLabel la;
	
	public Ex171120_4() {
		setTitle("마우스 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		setLayout(null);
		contentPane.addMouseListener(new MyMouseListener()); 
		
		la = new JLabel("hello");
		la.setSize(50, 20);
		la.setLocation(30, 30);
		contentPane.add(la);
		
		setSize(200, 200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		new Ex171120_4();

	}

}
