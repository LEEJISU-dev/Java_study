package Ex171017;

import java.util.Scanner;

/* 입력받은 숫자만큼 *찍는 프로그램(역 피라미드) */
public class Ex171017_3 {

	public static void main(String[] args) {
		int num;		//입력받은 숫자
		Scanner sc= new Scanner(System.in);
		System.out.print("원하는 숫자 입력: ");
		num = sc.nextInt();
		
		for(int i=num; i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
