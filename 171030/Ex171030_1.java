package Ex171030;
/* 사람의 객체와 클래스 */

class People {
	// 속성
	String name;
	String sex;
	int age;

	void speak() {
		System.out.println("말한다");
	}

	void walk() {
		System.out.println("걷는다");
	}
}

public class Ex171030_1 {

	public static void main(String[] args) {
		People p1 = new People();

		p1.name = "이지수";
		p1.age = 24;

		p1.speak();
		p1.walk();

		People p2 = new People();

	}

}
