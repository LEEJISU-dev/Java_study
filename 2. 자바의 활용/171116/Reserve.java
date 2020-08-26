package Ex171116;

import java.util.*;

public class Reserve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SeatType[] aSeatType = new SeatType[3];

		aSeatType[0] = new SeatType('s', 10); // s석 10개
		aSeatType[1] = new SeatType('A', 10); // A석 10개
		aSeatType[2] = new SeatType('B', 10); // B석 10개

		int choice = 0;
		while (choice != 4) {
			int type;
			System.out.print("(1)예약  (2)조회  (3)취소  (4)끝내기>>");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("좌석 구분 (1)S석  (2)A석  (3)B석>>");
				type = sc.nextInt();
				// 좌석 구분 잘못 입력시
				if (type < 1 || type > 3) {
					System.out.println("잘못된 좌석 타입입니다.");
					break;
				}
				aSeatType[type - 1].reserve();
				break;
			case 2:
				// 전 좌석 조회
				for (int i = 0; i < aSeatType.length; i++) {
					aSeatType[i].show();
				}
				System.out.println("<<조회 완료>>");
				break;
			case 3:
				System.out.print("좌석 구분 (1)S석  (2)A석  (3)B석>>");
				type = sc.nextInt();
				// 좌석 구분 잘못 입력시
				if (type < 1 || type > 3) {
					System.out.println("잘못된 좌석 타입입니다.");
					break;
				}
				// 좌석 취소
				aSeatType[type - 1].cancel();
				break;
			case 4:
				System.out.println("[프로그램 종료]");
				break;
			default:
				System.out.println("메뉴를 잘못 선택");
			}

		}
	}

}
