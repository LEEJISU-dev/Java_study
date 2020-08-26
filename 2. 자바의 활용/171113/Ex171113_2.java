package Ex171113;
/* 인터페이스
    - 상수와 추상메소드만 가짐
 	- 인터페이스끼리는 다중상속가능(extends)
	- 상속받을 시 implements구현 -> 반드시 재정의 해줘야함(다중implements구현가능)
	- 인터페이스는 생성자 만들수 X
*/

// 추상 메소드
abstract class Fig {
	abstract void draw();
}

// 인터페이스 
interface Shape1 {
	public void comArea1(double a, double b);
}

// 삼각형 메소드 (추상메소드 , 인터페이스 상속)
class Tri2 extends Fig implements Shape1 {
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}

	public void comArea1(double a, double h) {
		System.out.println("삼각형의 넓이 : " + (a * h / 2));
	}
}
// 사각형 메소드 (추상메소드 , 인터페이스 상속)
class Rec2 extends Fig implements Shape1 {
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}

	public void comArea1(double a, double h) {
		System.out.println("사각형의 넓이 : " + (a * h));
	}
}
// 원 메소드 (추상메소드 , 인터페이스 상속)
class Oval2 extends Fig implements Shape1 {
	void draw() {
		System.out.println("원을 그리는 기능");
	}

	public void comArea1(double a, double h) {
		System.out.println("원의 넓이 : " + (a * h * 3.14));
	}
}

class Poly {
	public void pdraw(Fig f) {
		f.draw();
	}

	public void pcomArea(Shape1 s, double a, double b) {
		s.comArea1(a, b);
	}
}

public class Ex171113_2 {

	public static void main(String[] args) {
		Poly p = new Poly();
		Fig fg1 = new Tri2();	// 삼각형
		Fig fg2 = new Rec2();	// 사각형
		Fig fg3 = new Oval2();	// 원
		Shape1 s1 = new Tri2();
		Shape1 s2 = new Rec2();
		Shape1 s3 = new Oval2();
		p.pdraw(fg1);			// 삼각형
		p.pcomArea(s1, 4, 4);
		
		p.pdraw(fg2);			// 사각형
		p.pcomArea(s2, 4, 4);
		
		p.pdraw(fg3);			// 원
		p.pcomArea(s3, 4, 4);

	}

}
