package Ex171018;

import java.util.Scanner;

/*  -1 입력될때까지 입력된 숫자의 갯수 알아맞히는 프로그램 */
public class Ex171018_5 {

	public static void main(String[] args) {
		int num = 0;	// 입력된 숫자 count
		Scanner sc = new Scanner(System.in);

		while (true) {
			if (sc.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력된 숫자의 갯수: " + num);
	}

}
