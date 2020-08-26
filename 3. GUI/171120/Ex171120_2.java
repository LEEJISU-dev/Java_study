package Ex171120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 마우스 이벤트 삽입 ( 마우스로 색깔 바꾸기 )
	- MouseListener (mouseEntered, mouseExited)
*/
public class Ex171120_2 extends JFrame {

	public Ex171120_2() {
		setTitle("버튼에 마우스 이벤트 리스터 작성");
		setLayout(new FlowLayout());
		setLocation(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("Mouse Event 테스트 버튼");
		b.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		b.addMouseListener(listener);
		add(b);
		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex171120_2();

	}
}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		b.setBackground(Color.RED);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		b.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}