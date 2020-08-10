package Ex171101;
/* 생성자 오버로딩 예3
 * 박스의 부피구하기 2*/

class Box5 {
	int width;	// 가로
	int height;	// 세로
	int depth;	// 높이

	Box5() {
		width = 1;
		height = 1;
		depth = 1;
	}

	Box5(int w) {
		width = w;
		height = 1;
		depth = 1;
	}

	Box5(int w, int h) {
		width = w;
		height = h;
		depth = 1;
	}

	Box5(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}

}

public class Ex171101_3 {

	public static void main(String[] args) {
		Box5 m1 = new Box5();
		int vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);
		
		m1 = new Box5(10);
		vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);
		
		m1 = new Box5(10, 20);
		vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);
		
		m1 = new Box5(10, 20, 30);
		vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);

	}

}
