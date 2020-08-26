package Ex171130;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 콤보박스 삽입
*/
public class Ex171130_1 extends JFrame implements ActionListener {
	JLabel label;

	Ex171130_1() {
		setTitle("Combo Box");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String[] ani = { "dog", "cat", "Lion" };
		JComboBox aniList = new JComboBox(ani);
		aniList.setSelectedIndex(0);
		aniList.addActionListener(this);
		add(aniList, BorderLayout.NORTH);

		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);	// 중간에 오게 조정
		changePic(ani[aniList.getSelectedIndex()]);		// 인덱스값 가져옴
		add(label, BorderLayout.CENTER);
		setVisible(true);
	}

	void changePic(String name) {
		ImageIcon icon = new ImageIcon(name + ".png");
		label.setIcon(icon);
		if (icon != null) {
			label.setText(null);
		} else
			label.setText("no image");

	}

	public static void main(String[] args) {
		new Ex171130_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox) e.getSource();// 클릭한 것을 다 이벤트가 발생했다고 인식하기 때문
		String name = (String) cb.getSelectedItem();
		changePic(name);

	}

}
