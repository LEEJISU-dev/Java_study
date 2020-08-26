package Ex171116;

import java.util.*;

public class SeatType {
	private char type;		// 좌석 타입
	private Seat[] aSeat;	// 좌석번호

	SeatType(char type, int num) {
		this.type = type;
		aSeat = new Seat[num];
		for (int i = 0; i < aSeat.length; i++) {
			aSeat[i] = new Seat();
		}
	}

	// 예약 메소드
	public boolean reserve() {
		Scanner sc = new Scanner(System.in);
		int seatNum;	// 좌석번호
		String name;	// 예약자이름
		show();
		System.out.print("이름>>");
		name = sc.nextLine();
		System.out.print("좌석 번호>>");
		seatNum = sc.nextInt();

		// 좌석번호의 범위가 아닐 경우 
		if (seatNum < 1 || seatNum >= aSeat.length) {
			System.out.println("잘못된 좌석번호 입니다.");
			return false;
		}
		
		// 예약된 좌석일 경우 
		if (aSeat[seatNum - 1].isOccupied()) {
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		}
		// 예약 확정
		aSeat[seatNum - 1].reserve(name);
		
		return true;
	}

	// 예약 조회 메소드
	public void show() {
		System.out.print(type + ">>");
		for (int i = 0; i < aSeat.length; i++) {
			if (aSeat[i].isOccupied())
				System.out.print(aSeat[i].getName());
			else
				System.out.print("---");
		}
		System.out.println();
	}

	// 예약 취소 메소드
	public boolean cancel() {
		Scanner sc = new Scanner(System.in);
		show();
		System.out.print("이름>>");
		String name = sc.nextLine();
		if (name != null) {
			// 예약자 찾기
			for (int i = 0; i < aSeat.length; i++) {
				if (aSeat[i].match(name)) {
					aSeat[i].cancel();	// 예약 취소
					return true;
				}
			}
			System.out.println("예약자 이름을 찾을 수 없습니다");
		}
		return false;	// 예약자 이름 찾지 못함
	}
}
