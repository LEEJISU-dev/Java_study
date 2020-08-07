package Ex171024;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/* 임의의 값(0-99) 찾는 프로그램 */
public class Ex171024_1 {

	public static void main(String[] args) {
		int low, high;	// 카드에 적힌 수의 범위
		int card;		// 정답
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			low = 0;
			high = 99;
			int i = 0;		// 사용자의 시행횟수
			card = r.nextInt(100);	// 0~99까지 랜덤
			System.out.println("수를 결정했습니다. 맞춰보세요");

			while (true) {
				System.out.println(low + "~" + high);
				System.out.println((i + 1) + ">>");
				int n = 0; // 입력값
				try {
					n = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("정수만 입력하세요");
					sc.nextLine();
					continue;
				}

				if (n > high || n < low)
					System.out.println("범위를 벗어났어요");
				else {
					if (n == card) {
						System.out.println("맞았습니다");
						break;
					} else if (n > card) {
						System.out.println("더 낮게");
						high = n;
					} else {
						System.out.println("더 높게");
						low = n;
					}
				}
				i++;
			}
			System.out.print("다시 하시겠습니까(y/n)>>");
			if (sc.next().equals("n"))
				break;
		}
		sc.close();

	}

}
