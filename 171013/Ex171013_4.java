package Ex171013;

import java.util.Scanner;

/* 주민번호 입력시 성별 알려주는 프로그램 */
public class Ex171013_4 {

	public static void main(String[] args) {
		String regNo; // 주민번호
		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 주민번호 입력>(000000-0000000)");
		regNo = sc.nextLine();

		char gender = regNo.charAt(7);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("당신은 남자");
			break;
		case '2':
		case '4':
			System.out.println("당신은 여자");
			break;
		default:
			System.out.println("다시입력");
			main(null);
		}

	}

}
