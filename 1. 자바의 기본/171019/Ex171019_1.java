package Ex171019;

/* 구구단 3*3형식으로 출력하는 프로그램 */
public class Ex171019_1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i = i + 3) {
			System.out.println(i + "단" + "\t" + (i + 1) + "단" + "\t" + (i + 2) + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + (i * j));
				System.out.print("\t");
				System.out.print((i + 1) + "*" + j + "=" + ((i + 1) * j));
				System.out.print("\t");
				System.out.print((i + 2) + "*" + j + "=" + ((i + 2) * j));
				System.out.print("\n");
			}
		}

	}

}
