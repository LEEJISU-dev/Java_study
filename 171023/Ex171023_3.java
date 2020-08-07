package Ex171023;

/* 배열의 출력 및 합구하기(이차원 배열) */
public class Ex171023_3 {

	public static void main(String[] args) {
		int score[][] = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 } };
		int sum = 0;	// 총합계
		
		// 배열의 값 설정
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] =%d\n", i, j, score[i][j]);
			}
		}
		
		for (int[] tmp : score) {
			for (int i : tmp) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		// 총합 결과
		System.out.println("sum = " + sum);
	}

}
