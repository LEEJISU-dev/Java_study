package Ex171201;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GUI
	- 팝업 메뉴 (마우스 우클릭)
*/
public class Ex171201_2 extends JFrame implements ActionListener {
	private JPopupMenu p;
	private JMenuItem m1, m2;// 가장 마지막에 나오는 메뉴
	private JTextArea ta;

	Ex171201_2() {
		setTitle("Popup Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		// pack();//크기를 맞게 사이즈 조정해줌
		ta = new JTextArea(10, 20);
		add(ta);
		// 팝업 메뉴 생성
		p = new JPopupMenu();
		m1 = new JMenuItem("탐색");
		m1.addActionListener(this);
		p.add(m1);
		m2 = new JMenuItem("저장");
		m2.addActionListener(this);
		p.add(m2);
		// 팝업 메뉴 생성 위해서 텍스트 영역에 마우스 리스너 등록
		ta.addMouseListener(new PopupListener());

		setVisible(true);
	}

	class PopupListener extends MouseAdapter {// 하나만 상속받기 위함
		public void mousePressed(MouseEvent e) {
			showPopup(e);
		}

		public void mouseReleased(MouseEvent e) {
			showPopup(e);
		}

		private void showPopup(MouseEvent e) {
			if (e.isPopupTrigger()) {
				p.show(e.getComponent(), e.getX(), e.getY());
				// 누른곳의 좌표를 찾아 팝업메뉴를 보여줌
			}
		}

	}

	public static void main(String[] args) {
		new Ex171201_2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == m1) {
			JOptionPane.showMessageDialog(this, "탐색이 선택되었습니다");
		} else if (e.getSource() == m2) {
			JOptionPane.showMessageDialog(this, "저장이 선택되었습니다");
		}

	}

}
