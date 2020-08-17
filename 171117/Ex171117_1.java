package Ex171117;

import java.util.Scanner;

/* 배열 예제 
 * 현금 분리하기 */
public class Ex171117_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };	// 현금 단위

		System.out.print("금액을 입력하세요>>");
		int price = sc.nextInt();	// 입력된 금액

		for (int i = 0; i < unit.length; i++) {
			int res = price / unit[i];

			if (res > 0) {
				String str1, str2;
				if (i <= 2) {	// 지폐일 경우
					str1 = "원권";
					str2 = "매";
				} else {		// 동전일 경우
					str1 = "원 동전";

					str2 = "개";
				}
				System.out.println(unit[i] + str1 + res + str2);
				price = price % unit[i];
			}
		}

	}

}
