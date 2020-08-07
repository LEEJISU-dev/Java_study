package Ex171019;

import java.util.Scanner;

/* 값을 입력받아 합, 평균 구하는 프로그램(배열) */
public class Ex171019_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i; 				// 배열 인자
		double sum = 0.0;	// 총 합
		double avg;			// 평균
		double num[] = new double[5];	// 입력받은 값(배열)

		System.out.print("배열의 길이: \n" + num.length);
		System.out.print("초기화 하지 않은 배열의 값:");
		for (i = 0; i < 5; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

		for (i = 0; i < 5; i++) {
			System.out.print("배열의 [" + (i) + "]번째의 데이터입력: ");
			num[i] = sc.nextDouble();
		}
		for (i = 0; i < num.length; i++)
			sum = sum + num[i];
		System.out.println("배열의 합은 " + sum);
		avg = sum / num.length;
		System.out.println("배열의 평균값은 " + avg);

	}

}
