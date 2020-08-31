package Ex171208;
import java.util.*;

/* 컬랙션 List
 * 	- ArrayList
 * 	- List -> sublist
 * 
 * 	- retainAll() : 겹치는 부분만 남기고 삭제
 * 	- remove() : 객체 삭제
*/
public class Ex171208_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(10);
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));

		// 1~4의 인덱스를 가져와서 리스트 생성
		ArrayList list2 = new ArrayList<>(list.subList(1, 4));
		print(list, list2);

		// 순서대로 정렬
		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		System.out.println("list1.containsAll(list2):" + list.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");// 3번째에 A추가
		print(list, list2);

		list2.set(3, "AA");// 3번을 AA로 바꿈
		print(list, list2);

		// list에서 list2와 겹치는 부분만 남기고 삭제
		System.out.println("list1.retainAll(list2):" + list.retainAll(list2));
		print(list, list2);

		// list2에서 list1에 포함된 객체 삭제
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list, list2);
	}

	static void print(ArrayList list, ArrayList list2) {
		System.out.println("list1 :" + list);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
