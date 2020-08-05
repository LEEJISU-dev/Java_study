package Ex171018;

import java.util.Scanner;

/* 메뉴 선택 프로그램 */
public class Ex171018_6 {

	public static void main(String[] args) {
		int menu = 0;	// 메뉴 선택입력
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("[1] square");
			System.out.println("[2] square root");
			System.out.println("[3] log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료 0)>>");

			menu = sc.nextInt();

			if (menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else if (!(1 <= menu && menu <= 3)) { // !(조건)이면
				System.out.println("잘못 선택하셨습니다(종료 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다");
		}

	}

}
