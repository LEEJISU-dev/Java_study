package Ex171207;

import java.util.*;

/* 컬랙션 map
 * 	- HashMap
 * 	- 아이디 패드워드 확인
*/
public class Ex171207_11 {

	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		m.put("myid", "1234");
		m.put("asdf", "1111");
		m.put("asdf", "1234");

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("id와 password를 입력하세요");
			System.out.print("id:");
			String id = s.nextLine().trim();
			System.out.println();
			System.out.print("password:");
			String password = s.nextLine().trim();
			System.out.println();

			if (!m.containsKey(id)) {
				System.out.println("다시 입력하세요");
				continue;
			} else {
				if (!(m.get(id)).equals(password)) {
					System.out.println("다시 입력하세요");
				} else {
					System.out.println("id과 비밀번호가 일치합니다");
					break;
				}
			}
		}

	}

}
