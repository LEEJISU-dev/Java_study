package Ex171207;

import java.util.*;

/* 컬랙션 map
 * 	- HashMap
 * 	- 단어 저장 후 검색(영한 사전)
*/
public class Ex171207_15 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();

		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");

		Set<String> keys = dic.keySet();// key문자열 가진 set 리턴
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + ", " + value + ")");
		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("찾고 싶은 단어 >>");
			String eng = sc.nextLine();
			System.out.println(dic.get(eng));
		}

	}

}
