package Ex171101;
/* 생성자 오버로딩 예2
 * 박스의 부피 구하기 */

class Box {
	int width;	// 가로
	int height;	// 세로
	int depth;	// 높이
	
	// 생성자 객체의 초기값 정의 (클래스 이름과 동일)
	Box(int w, int h, int d) {
		width = w;
		height = h;	
		depth = d;
	}
}

public class Ex171101_2 {

	public static void main(String[] args) {
		Box my = new Box(10, 20, 30);
		int vol = my.width * my.height * my.depth;
		System.out.println("박스의 부피: " + vol);

	}

}
