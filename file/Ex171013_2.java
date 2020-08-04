package Ex171013;
import java.util.Scanner;

/* 369 게임 */
public class Ex171013_2 {
	public static void main(String[] args) {
		int count = 0;	//369판정 변수
		int a;		// 10의자리 판단
		int b;		// 1의자리 판단
		int num;	// 입력받은 숫자
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("---------");
		System.out.println("3.6.9게임");
		System.out.println("---------");
		System.out.print("1~99중에 하나를 입력하세요:");
		num = sc.nextInt();
		a = num / 10;
		b = num % 10; 
		if (num >= 1 && num <= 100) {
			if (a != 0 && a % 3 == 0)
				count++;
			if (b != 0 && b % 3 == 0)
				count++;
		} else {
			System.out.println("다시 입력하세요");
			System.out.println();
			main(null);
		}
		switch (count) {
		case 1:
			System.out.println(num + "은(는)박수 짝");
			main(null);
		case 2:
			System.out.println(num + "은(는)박수 짝짝");
			main(null);
		case 0:
			System.out.println(num + "은(는)pass");
			main(null);
		}
	}
}
