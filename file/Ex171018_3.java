package Ex171018;

import java.util.Scanner;

/* 1부터 n까지의 짝수의 합(continue)구하는 프로그램 */
public class Ex171018_3 {

	public static void main(String[] args) {
		int num;	// 입력받은 수(정수)
		int sum = 0;	// 짝수의 합
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 정수 입력(짝수의 합):");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			if(i % 2 ==1)continue;
			sum = sum+i;
		}
		System.out.println("1부터"+num+"까지 짝수의 합은 "+sum);

	}

}
