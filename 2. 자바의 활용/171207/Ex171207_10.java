package Ex171207;

import java.util.*;

/* 컬랙션 map
 * 	- LinkedHashMap
 * 	- 성적 출력
 * 
 * [map]
 * 		- put()	: 값 추가
 * 		- get()	: 값 추출
*/
public class Ex171207_10 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();
		lm.put("국어", 98);
		lm.put("영어", 100);
		lm.put("수학", 86);
		lm.put("사회", 99);
		lm.put("과학", 98);

		System.out.println("당신의 성적: " + lm + total_avg(lm));
	}

	public static String total_avg(LinkedHashMap m) {
		int total = 0;
		int count = m.size();
		Collection<Integer> c = m.values();
		Iterator<Integer> i = c.iterator();
		while (i.hasNext()) {
			total += i.next();
		}
		return "  총점=" + total + " 평균 =" + (double) total / count;
	}

}
