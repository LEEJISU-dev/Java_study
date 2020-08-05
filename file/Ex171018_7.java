package Ex171018;

/* 구구단 프로그램(한 라인에 3단씩 출력) */
public class Ex171018_7 {

	public static void main(String[] args) {
		int i, j, k;

		for (i = 1; i < 10; i = i + 3) { 	// 3단씩
			for (j = 1; j <= 9; j++) {		// 단의 변화수
				for (k = i; k < i + 3; k++) { // 단수
					System.out.print(k + "*" + j + "=" + k * j + "\t");
				}
				System.out.println();
			}
			System.out.println("==============================");
		}

	}

}
