package Ex171122;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/* GUI 
	- 키보드로 그림 움직이기
	- KeyListener()
*/
class MyCar extends JPanel {
	BufferedImage img = null;
	int img_x = 100;
	int img_y = 100;

	public MyCar() {
		try {
			img = ImageIO.read(new File("car.png"));
		} catch (IOException e) {
			System.out.println("no image");
			System.exit(1);// 불완전 종료 0은 완전 종료
		}
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				}
				repaint();// 페인트컴퍼런트를 다시 불러옴

			}
		});

		this.requestFocus();// 강제로 포커스 주기(키보트 입력시 반드시 필요)
		this.setFocusable(true);// 키 입력을 받을 수 있도록 포커스 강제 지정
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}

public class Ex171122_1 extends JFrame {
	Ex171122_1() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new MyCar());

		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex171122_1 c = new Ex171122_1();

	}

}
