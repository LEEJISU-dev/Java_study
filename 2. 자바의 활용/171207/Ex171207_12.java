package Ex171207;
import java.util.*;

/* 컬랙션 map
 * 	- HashMap
 * 	- 참가자의 총점 /평균 /최고점수/최저 점수
*/
public class Ex171207_12 {

	public static void main(String[] args) {
		HashMap m = new HashMap<>();
		m.put("djava", new Integer(90));
		m.put("djava", new Integer(100));
		m.put("sjava", new Integer(100));
		m.put("ajava", new Integer(80));
		m.put("bjava", new Integer(90));

		Set set = m.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("name: " + e.getKey() + "  grade:" + e.getValue());
		}
		set = m.keySet();
		System.out.println("참가자 명단: " + set);

		Collection values = m.values();
		it = values.iterator();

		int total = 0;

		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("총점:" + total);
		System.out.println("평균:" + (float) total / set.size());
		System.out.println("최고점수:" + Collections.max(values));
		System.out.println("최저점수:" + Collections.min(values));

	}

}
