package Ex171207;

import java.util.*;

/* 컬랙션 set
 * 	- HashSet
 * 
 * [set]
 * 	- 객체를 중복해서 저장할 수 없음
 * 	- 하나의 null값만 저장 가능
 * 	- 저장 순서 X
 * 	- HashSet : 정렬X
 * 	- TreeSet : 자동정렬
*/
class AB {
}

class CD {
}

public class Ex171207_1 {

	public static void main(String[] args) {
		AB a = new AB();
		CD b = new CD();

		String c = new String("C");	// 래퍼클래스

		HashSet hs = new HashSet();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		// hs.add(a);//값의 중복 허용 안해서 찍히지 않음

		Iterator it = hs.iterator();	// 하나씩 가져오기
		while (it.hasNext()) {			// 가져온것이 있다면
			Object obj = it.next();
			System.out.println(obj);
		}

	}

}
