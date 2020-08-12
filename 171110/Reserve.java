package Ex171110;

import java.util.Scanner;
/* 예약프로그램 만들기 */

class Res {
	Scanner sc1 = new Scanner(System.in);
	String seat[][] = new String[3][10];// 좌석 위치

	Res() {// 생성자 초기값입력
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 10; j++)
				this.seat[i][j] = "---";
	}
	// 예약,취소시 입력받은 좌석타입별 예약상황 보여주는 메소드
	void watch(int s) {

		switch (s) {
		case 1:
			System.out.print("S>>");
			break;
		case 2:
			System.out.print("A>> ");
			break;
		case 3:
			System.out.print("B>>");
			break;
		}
		for (int i = 0; i < 10; i++)
			System.out.print(this.seat[s - 1][i] + " ");
		System.out.println();
	}
	// 예약 메소드
	void book() {
		String name = null;// 예약자 이름
		int num;// 좌석 번호
		int s;// 좌석 타입

		while (true) {
			System.out.print("좌석 구분 (1)S   (2)A   (3)B  >>");
			s = sc1.nextInt();
			watch(s);
			System.out.print("이름 >>");
			name = sc1.next();
			System.out.print("번호 >>");
			num = sc1.nextInt();
			System.out.println();
			System.out.println("[예약되었습니다.]");

			if (num > 10 || num < 1) {// 좌석번호 잘못 입력시
				System.out.println("다시 입력하세요(1~10)");
				continue;
			}
			// 이미 예약된 좌석 입력시
			if (!this.seat[s - 1][num - 1].equals("---")) {
				System.out.println("이미 예약된 좌석입니다");
				continue;
			}
			// 없는 좌석 입력시
			try {
				this.seat[s - 1][num - 1] = name;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("다시 입력하세요(1~10)");
				continue;
			}
			return;
		}
	}
	// 조회 메소드
	void show() {
		for (int i = 0; i < 3; i++) {
			if (i == 0)// s열
				System.out.print("S>>");
			else if (i == 1)// a열
				System.out.print("A>>");
			else if (i == 2)// b열
				System.out.print("B>>");
			for (int j = 0; j < 10; j++) {
				System.out.print(this.seat[i][j] + " ");
			}
			System.out.println();
		}
	}
	// 취소 메소드
	void cancel() {
		String name = null;// 예약자 이름
		int num;// 예약 좌석 번호
		int s;// 예약 좌석 타입

		while (true) {
			System.out.println("좌석 구분 (1)S   (2)A   (3)B  >>");
			s = sc1.nextInt();
			watch(s);// 타입별로 예약상황 보여주는 메소드

			System.out.print("이름>>");
			name = sc1.next();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 10; j++) {
					if (this.seat[i][j].equals(name)) {	// 입력받은 이름과 같은 좌석 찾기
						this.seat[i][j] = "---";		// 초기값으로 변경
						System.out.println();
						System.out.println("[취소되었습니다.]");
						return;
					}
				}
			}
			System.out.println("예약된 이름이 없습니다.");
		}
	}

}

public class Reserve {

	public static void main(String[] args) {
		Res r = new Res();

		while (true) {
			System.out.println();
			System.out.println("==========================================");
			System.out.println("(1)예약   (2)조회  (3)취소   (4)끝내기");
			System.out.println("==========================================");
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println();
				System.out.println("[예약]");
				r.book();// 예약 메소드 호출
				break;
			case 2:
				System.out.println();
				System.out.println("[조회]");
				r.show();// 조회 메소드 호출
				break;
			case 3:
				System.out.println();
				System.out.println("[취소]");
				r.cancel();// 취소 메소드 호출
				break;
			case 4:
				System.out.println("[프로그램 종료]");
				System.exit(0);// 끝내기
			default:
				System.out.println("잘못 입력");
				continue;
			}
		}
	}

}
