package Ex171016;

/* 369게임 (1~100까지 출력) 프로그램 */
public class Ex171016_7 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("i = %d", i);

			int tmp = i;
			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
					System.out.print("짝");

			} while ((tmp /= 10) != 0);
			System.out.println();
		}
	}
}
