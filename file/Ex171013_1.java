package Ex171013;

import java.util.Scanner;

/* Switch문 */
public class Ex171013_1 {

	public static void main(String[] args) {
		int mon;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		mon = sc.nextInt();
		
		switch(mon){
		case 12: case 1: case 2:
			System.out.println("겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("월을 잘못 입력");
			//break; <-안써도 됨(마지막이기때문)
		}
	}

}
