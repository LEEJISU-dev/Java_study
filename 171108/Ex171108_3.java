package Ex171108;
/* 동등연산자 equals() */

class Box10 {
	private int width;
	private int height;
	private int depth;

	public Box10(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}

public class Ex171108_3 {

	public static void main(String[] args) {
		int a1 = 10, a2 = 10;
		Box10 b1 = new Box10(10, 20, 30);
		Box10 b2 = new Box10(10, 20, 30);
		Box10 b3 = b2;

		// 기본자료형은 값을 비교
	/*	System.out.println(a1 == a2 ? "a1과 a2는 같다" : "a1과 a2는 같지 않다");
		// 참조 자료형은 주소값을 비교
		System.out.println(b1 == b2 ? "b1과 b2는 같다" : "b1과 b2는 같지 않다");
		System.out.println(b2 == b3 ? "b2과 b3는 같다" : "b2과 b3는 같지 않다");
	*/
		
		System.out.println(b1.equals(b2) ? "b1과 b2는 같다":"b1과 b2는 같지 않다");
		System.out.println(b2.equals(b3) ? "b2과 b3는 같다":"b2과 b3는 같지 않다");
		
		String s1 = new String("start java");
		String s2 = new String("start java");
		
		System.out.println(s1.equals(s2) ?"s1과 s2는 같다":"s1과 s2는 같지 않다");

	}

}
