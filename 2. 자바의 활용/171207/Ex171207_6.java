package Ex171207;

import java.util.*;

/* 컬랙션 set
 * 	- HashSet
 * 	- set 클래스 객체 중복 1
*/
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
}

public class Ex171207_6 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("Dabid", 10));
		set.add(new Person("Dabid", 10));

		System.out.println(set);

	}

}
