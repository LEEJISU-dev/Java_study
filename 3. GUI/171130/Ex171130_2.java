package Ex171130;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- slider 삽입
*/
public class Ex171130_2 extends JFrame implements ChangeListener {
	static final int INIT_VALUE = 15;
	private JButton button;
	private JSlider slider;

	Ex171130_2(){
		JPanel panel;
		setTitle("slider test");
		setSize(300, 300);
		
		panel = new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여 주세요");
		panel.add(label);
		
		slider = new JSlider(0, 30, INIT_VALUE);	//처음 , 시작, 화살표의 위치(15 중간)
		slider.setMajorTickSpacing(10);				//큰 눈금간격
		slider.setMinorTickSpacing(1);				//작은 눈금간격
		slider.setPaintTicks(true);					//눈금 출력
		slider.setPaintLabels(true);				//값을 레이블로 표시(메이저 단위로 출력)
		slider.addChangeListener(this);
		panel.add(slider);
		button = new JButton("");
		ImageIcon icon = new ImageIcon("dog.png");
		button.setIcon(icon);
		button.setSize(INIT_VALUE * 10, INIT_VALUE * 10);
		panel.add(button);
	
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex171130_2();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider s = (JSlider) e.getSource();
		if (!s.getValueIsAdjusting()) {		// 슬라이드를 움직였다면 실행
			int value = (int) s.getValue();
			button.setSize(value * 10, value * 10);
		}

	}
}
