package Ex171016;

import java.util.Scanner;

/* 1~100사이의 임의의 수 맞추는 프로그램 */
public class Ex171016_4 {

	public static void main(String[] args) {
		int a = 0; 		// 입력한 수
		int com = 0; 	// 1~100사이의 임의의 수

		com = (int) (Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("1~100사이 정수 입력>>");
			a = sc.nextInt();

			if (a > com) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (a < com) {
				System.out.println("더 큰수를 입력하세요");
			}
		} while (a != com);
		System.out.println("정답입니다.");

	}

}
