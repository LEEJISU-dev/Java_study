package Ex171103;
/* 상속(extends)  */

class B1 {
	public int x = 500;
	public int y = 1000;
}

class B2 extends B1 {
	public String x = "처음 시작하는 자바";
}

public class Ex171103_1 {

	public static void main(String[] args) {
		B2 b2 = new B2();
		System.out.println("객체 b2에 들어있는 x,y값: " + b2.x + b2.y);
		B1 b1 = new B1();
		System.out.println("객체 b2에 들어있는 x,y값: " + b1.x + b1.y);
		// 연산자 우선순위때문에 문자열과 결합 5001000

	}

}
