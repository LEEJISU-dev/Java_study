package Ex171024;

import java.util.Arrays;
import java.util.Scanner;

/* 과목의 이름을 입력받아 점수를 출력하는 프로그램 */
public class Ex171024_2 {

	public static void main(String[] args) {
		String sub[] = { "java", "c++", "html5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 85, 80, 100, 75 };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("====================================");
			System.out.println(Arrays.toString(sub));
			System.out.println("====================================");
			System.out.print("과목이름(종료시 그만)>>");
			String name = sc.next();
			if (name.equals("그만"))
				break;

			int i;
			for (i = 0; i < score.length; i++) {
				if (sub[i].equals(name)) {
					System.out.println(name + "의 점수는 " + score[i]);
					break;
				}
			}
			if (i == score.length)
				System.out.println("없는 과목입니다");
		}
		sc.close();

	}

}
