package Ex171101;
/* 생성자 오버로딩 */

//생성자 오버로딩(이름 같은 인자가 다른 여러 생성자 구현)
class Cons1 {
	public int num;
	
	// Cons1(){}매개변수 없는 묵시적 생성자(클래스 이름과 동일)
	Cons1() {	
		System.out.println("묵시적 생성자");
	}// 명시적 생성자가 있다면 묵시적 꼭 써줘야 함

	// 매개변수 있는 명시적 생성자
	Cons1(String s) {
		System.out.println(s + "명시적 생성자");
	}

	Cons1(int i) {
		System.out.println(i + "명시적 생성자");
	}
}

public class Ex171101_1 {

	public static void main(String[] args) {
		Cons1 cons = new Cons1();
		Cons1 cons1 = new Cons1("첫번째");
		Cons1 cons2 = new Cons1(5);

	}

}
