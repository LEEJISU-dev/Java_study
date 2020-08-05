package Ex171018;

/* 구구단 출력 프로그램(옆으로 1-9단 출력) */
public class Ex171018_1 {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 9; i++) {// for(i=1; i<=9;i++, System.out.println())
			for (j = 1; j < 10; j++, System.out.print('\t')) {
				System.out.print(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

}
