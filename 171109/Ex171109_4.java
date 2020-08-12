package Ex171109;
/* instanceof  */

// 사각형
class Rectangle1 {
	public int width;	// 가로
	public int height;	// 세로

	public Rectangle1(int w, int h) {
		width = w;
		height = h;
	}

	public int computerRectangle() {
		return width * height;
	}
}

// 정육면체
class Cube1 extends Rectangle1 {
	public int depth;	// 높이

	public Cube1(int w, int h, int d) {
		super(w, h);
		depth = d;
	}

	public int computerCube() {
		return super.computerRectangle() * depth;
	}
}

public class Ex171109_4 {

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(10, 20);
		Cube1 c = new Cube1(10, 20, 30);
		System.out.println("r이 Rec의 객체? " + (r instanceof Rectangle1));
		System.out.println("r이 Cube의 객체? " + (r instanceof Cube1));
		System.out.println("c가 Rec의 객체? " + (c instanceof Rectangle1));
		System.out.println("c가 Cube의 객체? " + (c instanceof Cube1));
		System.out.println("=============형 변환 이후=============");
		r = new Cube1(20, 30, 40);
		System.out.println("r이 Rec의 객체? " + (r instanceof Rectangle1));
		System.out.println("r이 Cube의 객체? " + (r instanceof Cube1));
		System.out.println("c가 Rec의 객체? " + (c instanceof Rectangle1));
		System.out.println("c가 Cube의 객체? " + (c instanceof Cube1));
		System.out.println("======================================");
		System.out.println("r이 Object의 객체? " + (c instanceof Object));

	}

}
