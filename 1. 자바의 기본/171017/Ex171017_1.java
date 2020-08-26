package Ex171017;

import java.util.Scanner;

/* 입력한 수(정수)의 약수를 알려주는 프로그램*/
public class Ex171017_1 {

	public static void main(String[] args) {
		int num;	// 입력한 수(정수)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력>>");
		num = sc.nextInt();

		System.out.print(num + "의 약수: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.print(i + " ");
		}
	}
}
