package Ex171122;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
/* GUI 
	- 마우스로 그림 움직이기
	- MouseListener()
*/
class MyCar2 extends JPanel{
	BufferedImage img = null;
	int img_x=0, img_y =0;
	public MyCar2(){
		try{
			img = ImageIO.read(new File("car.png"));
		}catch(IOException e){
			System.out.println("이미지가 없습니다");
			System.exit(1);
		}
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {
				img_x = e.getX();
				img_y = e.getY();
				
				repaint();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}
public class Ex171122_2  extends JFrame{
	Ex171122_2(){
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyCar2());
		setVisible(true);
	}
	public static void main(String[] args) {
		Ex171122_2 t = new Ex171122_2();

	}

}
