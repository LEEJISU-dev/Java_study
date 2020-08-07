package Ex171024;

import java.util.Scanner;

/* 5만원 만원 천원 500원 100원 50원 10원 1원짜리 몇갠지 알려주는 프로그램 */
public class Ex171024_5 {

	public static void main(String[] args) {
		int arr[]={50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요>>");
		int mon = sc.nextInt();
		
		for(int i=0; i<arr.length; i++){
			int res = mon/arr[i];
			
			if(res>0){
				System.out.println(arr[i]+"원짜리: "+res+"개");
				mon =mon%arr[i];
			}
		}
		sc.close();

	}

}
