package Ex171207;

import java.util.*;

/* 컬랙션 set
 * 	HashSet의 기본 기능들
 * 		- add()	: 값 추가
 * 		- remove()	: 값 1 제거
 * 		- clear()	: 모든 값 제거
 * 		- iterator() : 반복해서 값 가져옴
 * 		- next()	 : Iterator에서 하나의 값을 가져옴
 * 		- Collections.min()	: 가장 작은 값
 * 		- Collections.max()	: 가장 큰 갋
*/
public class Ex171207_2 {

	public static void main(String[] args) {
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();

		for (int i = 1; i <= 5; i = i + 2) {
			odd.add(i);
			even.add(i + 1);
		}
		boolean setChanged = odd.add(5);
		System.out.println("성공여부: " + setChanged);
		setChanged = even.add(12);
		System.out.println("성공여부: " + setChanged);
		System.out.println("odd집합: " + odd);
		System.out.println("even집합: " + even);
		System.out.println("odd min:" + Collections.min(odd));
		System.out.println("odd max:" + Collections.max(even));
		Iterator<Integer> it = even.iterator();
		int sum = 0;

		while (it.hasNext()) {
			sum += it.next();
		}
		System.out.println("even sum:" + sum);
	}

}
