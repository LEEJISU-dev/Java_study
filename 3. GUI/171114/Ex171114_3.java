package Ex171114;

import javax.swing.*;
/* GUI
  	- 창 만들기 
  	- 라벨 삽입
 	- 버튼 삽입
 */
class Comp extends JFrame {
	public Comp() {
		this.setTitle("컴포넌트 창");
		this.setSize(300, 200);

		JPanel panel = new JPanel(); // JPanel -> 가상의 공간. 포토샵의 layer같은 기능. 자동적으로 FlowLayout으로 잡힘.
		JLabel label = new JLabel("안녕하세요");
		JButton button = new JButton("인사");
		panel.add(label);
		panel.add(button);
		add(panel);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

public class Ex171114_3 {

	public static void main(String[] args) {
		Comp c = new Comp();

	}

}
