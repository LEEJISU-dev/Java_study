package Ex171025;

import java.util.Scanner;

/* 수학오류 예외처리 */
public class Ex171025_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.print("a : ");
		a = sc.nextInt();
		System.out.print("b :");
		b = sc.nextInt();
		try {
			System.out.println("a/b = " + (a / b));
			// 오류 모를경우 가장 최상위개념인 Exception e로 씀
		} catch (ArithmeticException e) { // 수학오류
			System.out.println("0으로 나눌수 없음");
			main(null);
		}

	}

}
