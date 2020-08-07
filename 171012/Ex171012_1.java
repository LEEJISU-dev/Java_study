package Ex171012;

import java.util.Scanner;

/* 가위바위보 */
public class Ex171012_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;	// 영희
		String b;	// 철수
		System.out.println("[가위바위보 게임]");
		System.out.print("영희 >>");
		a = sc.next();
		System.out.print("철수 >>");
		b = sc.next();
		
		if(a.equals("가위")){
			if(b.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(b.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(b.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
		}else if(a.equals("바위")){
			if(b.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}else if(b.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if(b.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
		}else if(a.equals("보")){
			if(b.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}else if(b.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}else if(b.equals("보")) {
				System.out.println("비겼습니다.");
			}
		}else {
			System.out.println("다시 입력하세요");
			main(null);
		}
		//문자열끼리 비교
		/* if(a.equals(b)){
			System.out.println("비겼습니다.");
		}else if(a.equals("가위")){
			if(b.equals("바위")){
				System.out.println("철수가 이겼습니다.");
			}else if(b.equals("보")){
				System.out.println("영희가 이겼습니다.");
			}
		}else if(a.equals("바위")){
			if(b.equals("가위")){
				System.out.println("영희가 이겼습니다.");
			}else if(b.equals("보")){
				System.out.println("철수가 이겼습니다.");
			}
		}else if(a.equals("보")){
			if(b.equals("가위")){
				System.out.println("철수가 이겼습니다.");
			}else if(b.equals("바위")){
				System.out.println("영희가 이겼습니다.");
			}
		}else {
			System.out.println("다시 입력하세요");
			main(null);
		}*/

	}
}
