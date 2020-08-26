import java.util.Scanner;

/* 나이, 식사량, 식대값을 입력하면 총 식대값을 알려주는 함수 */
public class Ex171011_1 {
	public static void main(String[] args) {
		int age;		// 나이
		int bun;		// 식사량
		int price;		// 식대값
		int TotalPrice;	// 총 식대값
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: \n");
		age = sc.nextInt();
		
		System.out.println("식사량을 입력하세요: \n");
		bun = sc.nextInt();
		
		System.out.println("한끼 식대값을 입력하세요: \n");
		price = sc.nextInt();
		
		TotalPrice = age * 365 * bun * price;
		System.out.printf("지금까지 총 식대비는 %d원 입니다", TotalPrice);
		
	}

}
