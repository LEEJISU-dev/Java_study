package Ex171208;

import java.util.*;

/* 컬랙션 List
 * 	- Vector
 * 	- 벡터의 용량과 사이즈 
*/
public class Ex171208_5 {

	public static void main(String[] args) {
		Vector v = new Vector<>(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		v.trimToSize();// 빈공간을 없앤다(용량 크기 같아짐)
		System.out.println("===After trimToSize()===");
		print(v);

		v.ensureCapacity(6);// 최소한의 용량이 6이 되게 만듦
		System.out.println("===After ensureCapacity(6)===");
		print(v);

		v.setSize(7);// 사이즈 7로 늘림 ->용량은 부족해서 두배가 됨
		System.out.println("===After setSize(7)===");
		print(v);

		v.clear();// v의 모든 요소 삭제
		System.out.println("===After clear()===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size: " + v.size());// 사이즈
		System.out.println("capacity: " + v.capacity());// 용량
	}

}
