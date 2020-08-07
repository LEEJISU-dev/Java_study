package Ex171016;

import java.util.Scanner;

/* 팩토리얼 구하기 */
public class Ex171016_2 {

	public static void main(String[] args) {
		int a; // 입력받은 팩토리얼 값
		int fac; // 팩토리얼 결과값

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 팩토리얼값 입력:");
		a = sc.nextInt();
		fac = a;
		while (a > 1) {
			System.out.print(a + " * ");
			fac *= --a;
		}
		System.out.println("1 = " + fac);

	}

}
