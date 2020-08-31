package Ex171208;

import java.util.*;

/* 컬랙션 List
 * 	- ArrayList
 * 	- 제네릭 사용법
*/
public class Ex171208_3 {

	public static void main(String[] args) {
		/*
		 * String s1 ="Hello"; String s2 = "100"; Integer i1 = 10;
		 * 
		 * Vector<String> v= new Vector<String>();//<>generics표현 v.add(s1);//벡터는
		 * addElement써야하지만 add써도 괜찮 v.addElement(s2); //v.add(i1); 오류뜸
		 * 
		 * for(int i=0; i<v.size();i++){
		 * System.out.println(v.get(i).toUpperCase());//제네릭했기 때문에 형변환 ㄴㄴ }
		 */
		ArrayList al = new ArrayList<>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");

		/*
		 * for(int i=0; i<al.size();i++){ 
		 * 		String tmp = (String)al.get(i);//제네릭 하지 않으면형변환 계속 해줘야 함 
		 * 		System.out.println(tmp); 
		 * }
		 */
		for (Object ol : al) {
			System.out.println(ol);
		}

	}

}
