package Ex171013;

import java.util.Scanner;

/* 가위바위보 게임 */
public class Ex171013_3 {

	public static void main(String[] args) {
		int user; // 유저의 경우
		int com; // 컴퓨터의 경우
		System.out.print("가위(1)바위(2)보(3) 중 하나 입력>");
		Scanner sc = new Scanner(System.in);
		user = sc.nextInt();
		com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + user + "입니다");
		System.out.println("컴퓨터는" + com + "입니다");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
			break;
		}

	}

}
