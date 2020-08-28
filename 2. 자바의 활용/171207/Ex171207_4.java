package Ex171207;

import java.util.*;

/* 컬랙션 set
 * 	- HashSet의 랜덤 값 삽입
 * 	- LinkedList의 출력
*/
public class Ex171207_4 {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		for (int i = 0; h.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			h.add(new Integer(num));
		}
		List list = new LinkedList(h);
		Collections.sort(list);
		System.out.println(list);

	}

}
