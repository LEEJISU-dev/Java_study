import java.util.Scanner;

/* 금액입력-> 오만원, 만원, 천원, 오백원, 백원 몇개인지 알려주는 프로그램 */
public class Ex171011_3 {

	public static void main(String[] args) {
		int won;	//입력받은 금액
		int om;		//오만원권
		int m;		//만원권
		int c;		//천원권
		int ob;		//오백원권
		int b;		//백원권
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요: \n");
		won = sc.nextInt();
		
		om = won/50000;
		m  = (won % 50000) / 10000;
		c  = (won % 50000 % 10000) / 1000;
		ob = (won % 50000 % 10000 % 1000) / 500;
		b  = (won % 50000 % 10000 % 1000 % 500) / 100;
		
		System.out.print(won+"원은 ");
		System.out.print("오만원"+om+"장 ");
		System.out.print("만원"+m+"장 ");
		System.out.print("천원"+c+"장 ");
		System.out.print("오백원"+ob+"개 ");
		System.out.print("백원"+b+"개입니다");
	}
}
