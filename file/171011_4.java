import java.util.Scanner;

/* 삼항연산자 */
public class Ex171011_4 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 값을 입력하세요: \n");
		a = sc.nextInt();
		
		System.out.println("b의 값을 입력하세요: \n");
		b = sc.nextInt();
		
		System.out.println("두 수의 차는  " + ((a > b)?(a - b):(b - a)));
	}
}
