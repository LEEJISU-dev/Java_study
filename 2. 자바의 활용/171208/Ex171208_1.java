package Ex171208;

import java.util.*;

/* 컬랙션 List
 * 	- ArrayList
 * 
 * [ArrayList의 기본 기능]
 * 	- add("")	: 리스트 끝에 추가
 * 	- add(3,"")	: 3번째에 추가
 * 	- set(0 ,"") : 0번째 항목 변경 
 * 	- get() 	: 리스트 값 추출
 * 	- shuffle() : 리스트 무작위 재배열
 * 	- sort() : 리스트 정렬
 * 	- fill() : 리스트의 모든 요소를 같은 값으로 설정
*/
public class Ex171208_1 {

	public static void main(String[] args) {
		String[] name = { "kim", "lee", "park", "jung", "oh" };

		// 문자열의 배열을 이용하여 리스트 객체 생성
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("초기값 :" + lname);

		lname.add("ha");// 리스트 끝에 추가
		System.out.println("\"ha\" 추가된 후의 값:" + lname);

		lname.set(0, "김");// 0번째 항목 변경
		lname.add(3, "곽");// 3번째에 추가
		System.out.println("\"김\"으로 변경되고 \"곽\"이 추가된 값:" + lname);

		Collections.shuffle(lname);// 리스트 무작위 재배열
		System.out.println("shuffle()메소드가 적용된 값: " + lname);

		Collections.sort(lname);// 리스트 정렬
		System.out.println("sort()메소드가 적용된 값: " + lname);

		System.out.println("5번째 요소의 값: " + lname.get(4));

		Collections.fill(lname, "김");// 리스트 모든 요소 "김"으로 설정
		System.out.println("모든 요소를 \"김\"으로 설정된 값: " + lname);
	}

}
