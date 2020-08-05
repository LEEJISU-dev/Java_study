package Ex171016;

import java.util.Scanner;

/* 입력받은 숫자의 각 자리수의 합 구하는 프로그램 */
public class Ex171016_5 {

	public static void main(String[] args) {
		int num = 0;	// 입력받은 숫자
		int sum = 0;	// 결과값
		System.out.print("숫자 입력>>");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();// String tmp = sc.nextLine();
							// ->스페이스 상관없이 다 입력됨
		// num = Integer.parseInt(tmp);

		while (num != 0) {
			sum += num % 10; // 마지막 자리를 얻을 수 잇다
			System.out.printf("sum = %3d num = %d \n", sum, num);
			num /= 10; // 마지막 한 자리가 제거됨
		}
		System.out.println("각 자리수의 합: " + sum);

	}

}
