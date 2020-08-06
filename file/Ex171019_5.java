package Ex171019;

import java.util.Scanner;

/* 입력한 배열 값 중 찾는 숫자가 있는지, 몇 개가 있는지 구하는 프로그램 */
public class Ex171019_5 {

	public static void main(String[] args) {
		/*
		 * int num[]= new int[10]; Scanner sc = new Scanner(System.in);
		 * System.out.println("배열의 값을 입력하세요"); for(int i=0; i<num.length;i++){
		 * System.out.print((i+1)+"번째의 값: "); num[i]= sc.nextInt(); }
		 * System.out.println("===배열==="); for(int i=0; i<num.length;i++){
		 * System.out.print("["+num[i]+"] "); } System.err.println();
		 */
		int num[] = { 8, 7, 3, 6, 9, 8, 6, 7, 4, 1, 2 };
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고싶은 숫자 입력: ");
		int key = sc.nextInt();
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == key) {
				count++;
				System.out.println((i + 1) + "번째 데이터와 일치");
			}
		}
		if (count == 0)
			System.out.println(key + "값은 없습니다");
		else
			System.out.println(key + "값은 " + count + "개 있습니다");

	}

}
