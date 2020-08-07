package Ex171023;

import java.util.Random;

/* random함수 사용하여 값 설정후, 행의 합 구하기(이차원 배열) */
public class Ex171023_1 {

	public static void main(String[] args) {
		Random ran = new Random();		// random 함수
		int score[][] = new int[4][4];
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				score[i][j] = ran.nextInt(10);	// 0-9까지의 수 중에 랜덤

		for (int k = 0; k < 4; k++) {
			int sum = 0;
			for (int v : score[k]) {
				System.out.print(v + " ");
				sum = sum + v;
			}
			System.out.println("의 합계는 " + sum);
		}

	}

}
