package Ex171113;
/* 추상화 클래스 예제
 * - 상속시 반드시 재정의(오버라이딩) */

// 추상화 메소드
abstract class Shape {
	abstract void draw();// 추상화 메소드 -> 상속시 반드시 재정의(오버라이딩)

	abstract void comArea(double a, double b);
}

// 원 메소드
class Cir extends Shape {
	void draw() {
		System.out.println("원을 그리는 기능");
	}

	void comArea(double r1, double r2) {
		System.out.println("원의 넓이: " + (3.14 * r1 * r2));
	}
}

// 사각형 메소드
class Rec extends Shape {
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}

	void comArea(double h, double v) {
		System.out.println("사각형의 넓이: " + (h * v));
	}
}

// 삼각형 메소드
class Tri extends Shape {
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}

	void comArea(double a, double h) {
		System.out.println("삼각형의 넓이: " + (h * a / 2));
	}
}

public class Ex171113_1 {

	public static void main(String[] args) {
		System.out.println("==추상 메소드 이용한 다형성==");
		Shape s = new Cir(); // 원 메소드
		s.draw();
		s.comArea(5.0, 5.0);

		s = new Rec();		// 사각형 메소드
		s.draw();
		s.comArea(5.0, 10.0);
		
		s = new Tri();		// 삼각형 메소드
		s.draw();
		s.comArea(5.0, 10.0);

	}

}
