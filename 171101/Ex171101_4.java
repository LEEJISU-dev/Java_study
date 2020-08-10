package Ex171101;
/* 생성자 오버로딩 예4
 * this  */

class Box7 {
	int width;	// 가로
	int height;	// 세로
	int depth;	// 높이

	Box7() {
		// this 이용, 3개이 매개변수 가진 생성자 호출/항상 맨 첫줄에!
		this(1, 1, 1);
		System.out.println("매개 변수 없는 생성자 수행");
	}

	Box7(int width) {
		this(width, 1, 1);
		System.out.println("매개변수(1) 생성자 수행");
	}

	Box7(int width, int height) {
		this(width, height, 1);
		System.out.println("매개변수(2) 생성자 수행");
	}

	Box7(int width, int height, int depth) {
		System.out.println("매개변수(3) 생상자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}

public class Ex171101_4 {

	public static void main(String[] args) {
		Box7 m1 = new Box7();
		int vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);
		
		m1 = new Box7(10);
		vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);
		
		m1 = new Box7(10, 20);
		vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);
		
		m1 = new Box7(10, 20, 30);
		vol = m1.depth * m1.height * m1.width;
		System.out.println("박스의 부피: " + vol);
	}

}
