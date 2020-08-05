package Ex171017;

import java.util.Scanner;

/* 복리계산 프로그램 */
public class Ex171017_5 {

	public static void main(String[] args) {
		double d; 	// 현재 금액
		double per; // 이자율
		int i; 		// 몇년 뒤
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 금액을 입력(만원)>>");
		d = sc.nextDouble();
		System.out.print("이자율입력>>");
		per = sc.nextDouble();
		System.out.print("몇년뒤인지 입력>>");
		i = sc.nextInt();

		for (int y = 1; y < i; y++) {

			d = d * per;

		}
		System.out.printf(" %d년 뒤의 수익은 %30.2f입니다", i, d);
	}

}
