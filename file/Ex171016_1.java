package Ex171016;

import java.util.Scanner;

/* 성적입력시 평균계산 프로그램 */
public class Ex171016_1 {

	public static void main(String[] args) {
		int n = 0; 			// 입력받은 과목수
		int i = 0; 			// 입력받은 성적
		double sum = 0.0;	// 성적의 합계

		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요(종료시 -1)");
		while ((i = sc.nextInt()) != -1) {
			sum = sum + i;
			n++;
		}
		System.out.println("평균은 :" + (sum / n));
	}

}
