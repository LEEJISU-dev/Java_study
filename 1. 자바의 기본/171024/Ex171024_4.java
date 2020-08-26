package Ex171024;

import java.util.Scanner;
/* 가위바위보 게임  */
public class Ex171024_4 {

	public static void main(String[] args) {
		String com[] = { "가위", "바위", "보" };

		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		while (true) {
			System.out.print("가위 바위 보>>");
			String a = sc.nextLine();
			if (a.equals("그만")) {
				System.out.print("게임을 종료합니다");
				break;
			}
			int n = (int) (Math.random() * 3);
			String b = com[n];

			System.out.print("사용자 : " + a + ", 컴퓨터 : " + b + ", ");

			if (a.equals(b))
				System.out.println("비겼습니다");
			else {
				if (a.equals("가위")) {
					if (b.equals("바위"))
						System.out.println("컴퓨터가 이겼습니다.");
					else if (b.equals("보"))
						System.out.println("사용자가 이겼습니다.");
				} else if (a.equals("바위")) {
					if (b.equals("가위"))
						System.out.println("사용자가 이겼습니다.");
					else if (b.equals("보"))
						System.out.println("컴퓨터가 이겼습니다.");
				} else if (a.equals("보")) {
					if (b.equals("가위"))
						System.out.println("컴퓨터가 이겼습니다.");
					else if (b.equals("바위"))
						System.out.println("사용자가 이겼습니다.");
				} else
					System.out.println("다시 입력하세요");

			}

		}
		sc.close();

	}

}
