package Ex171208;

import java.util.*;

/* 컬랙션 List
 * 	- Vector
 * 	- 벡터의 용량과 사이즈 2
*/
public class Ex171208_6 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(5);
		v.add(4);
		v.addElement(-1);
		v.add(2, 100);
		System.out.println("백터 내의 요소 객체의 수:" + v.size());
		System.out.println("백터의 현재 용량: " + v.capacity());// 디폴트값음 10

		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("백터의 정수의 합: " + sum);
	}

}
