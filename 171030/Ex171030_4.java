package Ex171030;
/* 박스 클래스 
 * 박스의 부피 구하기 */

class Box1 {
	int width;	// 가로
	int height;	// 세로
	int depth;	// 높이

}

public class Ex171030_4 {

	public static void main(String[] args) {
		Box1 b1 = new Box1();
		Box1 b2 = new Box1();

		b1.width = 78;
		b1.height = 145;
		b1.depth = 87;

		b2.width = 48;
		b2.height = 45;
		b2.depth = 137;
		int vo1, vo2;

		vo1 = b1.depth * b1.height * b1.width;
		System.out.println("1box vol :" + vo1);
		vo2 = b2.depth * b2.height * b2.width;
		System.out.println("2box vol :" + vo2);
	}

}
