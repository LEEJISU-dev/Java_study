package Ex171020;

/* 최대값, 최소값, 총합, 평균 구하기(배열) */
public class Ex171020_4 {

	public static void main(String[] args) {
		int sum = 0;		// 총핪
		double avg = 0.0;	// 평균
		int score[] = { 79, 88, 56, 74, 98, 100 };
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / (double) score.length;
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);

		int max = score[0];	// 최대값
		int min = score[0];	// 최소값
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
			if (score[i] < min)
				min = score[i];
		}
		System.out.println("max " + max);
		System.out.println("min " + min);

	}

}
