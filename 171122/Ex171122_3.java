package Ex171122;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/* GUI 
	- 마우스로 여러개의 선 그리기
	- MouseListener()
*/
public class Ex171122_3 extends JFrame {
	public Ex171122_3() {
		setTitle("마우스로 여러 개의 선 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex171122_3();

	}

	class MyPanel extends JPanel {
		Vector<Point> vStart = new Vector<Point>();// 객체를 넣을 수 잇는 배열이라고생각
		Vector<Point> vEnd = new Vector<Point>();

		public MyPanel() {// listener->인터페이스
			addMouseListener(new MouseAdapter() {// adepter->클래스 (원하는것만상속)
				@Override
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}

				@Override
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for (int i = 0; i < vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}
		}
	}
}
