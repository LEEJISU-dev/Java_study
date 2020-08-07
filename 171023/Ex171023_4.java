package Ex171023;

/* 과목의 총점, 평균 구하기(이차원 배열) */
public class Ex171023_4 {

	public static void main(String[] args) {
		int score[][] = { { 100, 100, 100 }, 
						{ 20, 20, 20 }, 
						{ 30, 30, 30 }, 
						{ 40, 40, 40 }, 
						{ 50, 50, 50 } };
		int kt = 0;	// 국어 총점
		int et = 0;	// 영어 총점
		int mt = 0;	// 수학 총점
		System.out.println("번호" + '\t' + "국어" + '\t' + "영어" + '\t' + "수학" + '\t' + "총점" + '\t' + "평균");
		System.out.println("===============================================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;		// 총점
			float avg = 0.0f;	// 평균

			kt += score[i][0];
			et += score[i][1];
			mt += score[i][2];
			System.out.printf("%d\t", i + 1);

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
			}

			avg = sum / (float) score[i].length;
			System.out.printf("%d\t %2.1f\t\n", sum, avg);
		}
		System.out.println("===============================================");
		System.out.printf("총점 :\t %d\t %d\t %d\n", kt, et, mt);

	}

}
