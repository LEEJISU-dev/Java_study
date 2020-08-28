package Ex171207;

import java.util.*;

/* 컬랙션 set
 * 	- HashSet
 * 	- set 클래스 객체 중복 2
*/
class Per {
	String name;
	int age;

	Per(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object o) {
		if (o instanceof Per) {
			Per tmp = (Per) o;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	public int hashCode() {
		return (name + age).hashCode();
	}

	public String toString() {
		return name + ":" + age;
	}
}

public class Ex171207_7 {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Per("David", 10));
		set.add(new Per("David", 10));

		System.out.println(set);

	}

}
