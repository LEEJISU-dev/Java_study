package Ex171106;
/* 숙제
 * 다수의 클래스를 정의해서 사칙연산(+, -, *, /)을 수행하는 Add, Sub, Mul, Div클래스 만들고
     다음과 같은 연산이 가능하도록 프로그래밍 하시오

     두 정수와 연산자를 입력하시오>> 3 4 +
  7

   ...
    두 정수와 연산자를 입력하시오>> 3 3 .
    프로그램 종료 
 */

import java.util.Scanner;

class Add {
	int a, b;

	public void add(int a, int b) {
		System.out.println("두수의 합은 " + (a + b));
	}
}

class Sub {
	int a, b;

	public void sub(int a, int b) {
		System.out.println("두수의 차는 " + (a - b));
	}
}

class Mul {
	int a, b;

	public void mul(int a, int b) {
		System.out.println("두 수의 곱은 " + (a * b));
	}
}

class Div {
	int a, b;

	public void div(int a, int b) {
		System.out.println("두수의 나눗셈은 " + (a / b));
	}

}

public class Ex171106_6 {

	public static void main(String[] args) {
		Add i = new Add();
		Sub s = new Sub();
		Mul m = new Mul();
		Div d = new Div();
		String c;
		int a, b;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("두 정수와 연산자를 입력하시오: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.next();

			if (c.equals("+")) {
				i.add(a, b);
			} else if (c.equals("-")) {
				System.out.println(c);
				s.sub(a, b);
			} else if (c.equals("*")) {
				m.mul(a, b);
			}else if (c.equals("/")) {
				d.div(a, b);
			}else {
				System.out.println("다시 입력하세요");
			}
		} while (c.equals("."));
		System.out.println("프로그램 종료");
	}

}
