package Ex171114;

import javax.swing.*; // 객체지향프로그램

/* 자바의 GUI (Graphical User Interface)
 	- 창만들기
 
GUI의 목적
그래픽 이용, 사용자에게 이해하기 쉬운 모양으로 정보 제공
 
AWT와 Swing 패키지
Swing(스윙) -> 순수 자바 언어로 구현

*/

class MyFrame {
	MyFrame() { // 생성자.
		JFrame f = new JFrame("내가 만든 창"); // javax.swing에서 제공.
		f.setLocation(200, 300); 		 // 창이 생기는 위치. 픽셀단위.
		f.setSize(300, 400); // 창의 사이즈. 픽셀단위.
		f.setResizable(false); // 창의 사이즈를 임의로 조절하지 못하게 만듬.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼을 눌렀을 때 프로세스도 같이 끝남.
		f.setVisible(true); // 제일 마지막에 작성.
	}
}

public class Ex171114_1 {

	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();
		// 메인은 짧으면 짧을수록 좋음. 처리는 클래스에서.
	}

}
