package Ex171207;

import java.util.*;

/* 컬랙션 map
 * 	- HashTable
 * 
 * [map]
 * 	- 키와 값을 쌍으로 이루어진 구조
 * 	- 키(key) : 컬렉션내의 키중에서 유일해야 함.
 * 	- 값(value) : 키와 달리 데이터의 중복을 허용.
*/
class EF {
}

class GH {
}

public class Ex171207_9 {

	public static void main(String[] args) {
		EF a = new EF();
		GH b = new GH();
		String c = new String("C");

		Hashtable h = new Hashtable();
		h.put("EF", a);// 키와 값이 한 세트
		h.put("GH", b);
		h.put("word", c);
		h.put("dd", a);// 키값만 다르면 중복 얼마든지 허용함

		Enumeration enu = h.elements();// 하나씩 가져오기Iterator와 같은 기능(set에서만 씀)
		while (enu.hasMoreElements()) {
			Object obj = enu.nextElement();
			System.out.println(obj);
		}

		System.out.println("키에 의한 값을 반환");
		Object obj = h.get("dd");
		System.out.println(obj);

	}

}
